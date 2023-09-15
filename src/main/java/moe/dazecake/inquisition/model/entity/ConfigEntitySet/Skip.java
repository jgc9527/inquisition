package moe.dazecake.inquisition.model.entity.ConfigEntitySet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skip {

    private boolean coin;
    private boolean beast;
    private boolean daily;
    private boolean sensitive;
    private boolean illusion;
    private boolean survive;

}