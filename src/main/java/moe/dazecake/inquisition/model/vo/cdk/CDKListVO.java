package moe.dazecake.inquisition.model.vo.cdk;

import lombok.Data;
import lombok.NoArgsConstructor;
import moe.dazecake.inquisition.model.dto.cdk.CDKDTO;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class CDKListVO {
    private List<CDKDTO> cdkList = new ArrayList<>();
}
