package moe.dazecake.inquisition.model.vo.account;

import lombok.Data;
import lombok.NoArgsConstructor;
import moe.dazecake.inquisition.model.entity.AccountEntity;

@Data
@NoArgsConstructor
public class AccountWithSanVO extends AccountEntity {
    private String san;
}
