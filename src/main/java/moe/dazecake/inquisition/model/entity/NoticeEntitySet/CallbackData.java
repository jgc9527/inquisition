package moe.dazecake.inquisition.model.entity.NoticeEntitySet;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CallbackData {
    private String appId;
    private String appKey;
    private String appName;
    private String source;
    private String userName;
    private String userHeadImg;
    private String time;
    private String uid;
    private String extra;
}