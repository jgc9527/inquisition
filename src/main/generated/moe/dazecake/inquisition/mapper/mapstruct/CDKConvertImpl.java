package moe.dazecake.inquisition.mapper.mapstruct;

import javax.annotation.processing.Generated;
import moe.dazecake.inquisition.model.dto.cdk.CDKDTO;
import moe.dazecake.inquisition.model.entity.CDKEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-10T06:23:20+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.16.1 (Oracle Corporation)"
)
@Component
public class CDKConvertImpl implements CDKConvert {

    @Override
    public CDKDTO toCDKDTO(CDKEntity cdkEntity) {
        if ( cdkEntity == null ) {
            return null;
        }

        CDKDTO cDKDTO = new CDKDTO();

        cDKDTO.setId( cdkEntity.getId() );
        cDKDTO.setCdk( cdkEntity.getCdk() );
        cDKDTO.setType( cdkEntity.getType() );
        cDKDTO.setParam( cdkEntity.getParam() );
        cDKDTO.setTag( cdkEntity.getTag() );
        cDKDTO.setIsAgent( cdkEntity.getIsAgent() );
        cDKDTO.setAgent( cdkEntity.getAgent() );
        cDKDTO.setUsed( cdkEntity.getUsed() );

        return cDKDTO;
    }
}
