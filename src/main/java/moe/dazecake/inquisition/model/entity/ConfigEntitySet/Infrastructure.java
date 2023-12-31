package moe.dazecake.inquisition.model.entity.ConfigEntitySet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Infrastructure {

    private boolean harvest;
    private boolean shift;
    private boolean acceleration;
    private boolean communication;
    private boolean deputy;

}