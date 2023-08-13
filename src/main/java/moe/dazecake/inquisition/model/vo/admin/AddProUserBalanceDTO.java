package moe.dazecake.inquisition.model.vo.admin;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddProUserBalanceDTO {
    private Long id;

    private Double balance;
}
