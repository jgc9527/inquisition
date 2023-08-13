package moe.dazecake.inquisition.model.entity.NoticeEntitySet;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WechatCallbackEntity {
    private String action;
    private CallbackData data;
}
