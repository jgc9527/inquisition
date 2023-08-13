package moe.dazecake.inquisition.model.vo.device;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;

@Data
@NoArgsConstructor
public class LoadDeviceVO {
    private ArrayList<HashMap<String, String>> loadDeviceList = new ArrayList<>();
}
