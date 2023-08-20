package moe.dazecake.inquisition.model.dto.device;


import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Data
public class AddCommonDeviceDTO {
    private String deviceName;

    private LocalDateTime expireTime;

    ArrayList<String> workScope = new ArrayList<>();
}
