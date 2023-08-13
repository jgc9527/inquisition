package moe.dazecake.inquisition.model.vo.query;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class PageQueryVO<T> {

    //当前页
    private Long current;

    //总页数
    private Long page;

    //总条目数
    private Long total;

    //记录数组
    private List<T> records = new ArrayList<>();
}
