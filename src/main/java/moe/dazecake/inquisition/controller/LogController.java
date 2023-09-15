package moe.dazecake.inquisition.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import moe.dazecake.inquisition.annotation.Login;
import moe.dazecake.inquisition.model.dto.log.AddImageDTO;
import moe.dazecake.inquisition.model.dto.log.AddLogDTO;
import moe.dazecake.inquisition.model.dto.log.LogDTO;
import moe.dazecake.inquisition.model.dto.log.LogIDDTO;
import moe.dazecake.inquisition.model.vo.query.PageQueryVO;
import moe.dazecake.inquisition.service.impl.LogServiceImpl;
import moe.dazecake.inquisition.service.impl.MessageServiceImpl;
import moe.dazecake.inquisition.utils.Result;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Tag(name = "日志接口")
@ResponseBody
@RestController
public class LogController {

    @Resource
    LogServiceImpl logService;

    @Resource
    MessageServiceImpl messageService;

    private static final String LOG_LEVEL_WARN="WARN";
    private static final String FIGHT_PROXY_FAIL="代理失败";
    private static final String FIGHT_PROXY_FAIL_STR="用户:%s,账号:%s,设备:%s 任务类型:%s 代理失败";
    @Operation(summary = "增加日志")
    @PostMapping("/addLog")
    public Result<String> addLog(@RequestBody AddLogDTO addLogDTO) {
        var level=addLogDTO.getLevel();
        var title=addLogDTO.getTitle();
        if(LOG_LEVEL_WARN.equals(level)&&StringUtils.isNotBlank(title)&&title.contains(FIGHT_PROXY_FAIL)){
            var failMessage=String.format(FIGHT_PROXY_FAIL_STR,addLogDTO.getName(),addLogDTO.getAccount(),addLogDTO.getFrom(),addLogDTO.getTaskType())
                    +"\t"+addLogDTO.getDetail();
            messageService.pushAdmin("代理翻车", failMessage);
        }
        logService.addLog(addLogDTO, false);
        return Result.success("添加成功");
    }

    @Operation(summary = "上传图片")
    @PostMapping("/uploadImage")
    public Result<String> uploadImage(@RequestBody AddImageDTO addImageDTO) {
        return logService.uploadImage(addImageDTO);
    }

    @Login
    @Operation(summary = "删除日志")
    @PostMapping("/delLog")
    public Result<String> delLog(@RequestBody LogIDDTO logIDDTO) {
        logService.deleteLog(logIDDTO.getId());
        return Result.success("删除成功");
    }

    @Login
    @Operation(summary = "查询日志")
    @GetMapping("/showLog")
    public Result<PageQueryVO<LogDTO>> showLog(Long current, Long size) {
        return Result.success(logService.queryAllLog(current, size), "查询成功");
    }

    @Login
    @Operation(summary = "精确查询账号日志")
    @GetMapping("/searchLogByAccount")
    public Result<PageQueryVO<LogDTO>> searchLogByAccount(String account, Long current, Long size) {
        return Result.success(logService.queryLogByAccount(account, current, size), "查询成功");
    }
}
