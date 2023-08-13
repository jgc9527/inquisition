package moe.dazecake.inquisition.mapper.mapstruct;

import javax.annotation.processing.Generated;
import moe.dazecake.inquisition.model.dto.prouser.CreateProUserDTO;
import moe.dazecake.inquisition.model.dto.prouser.ProUserDTO;
import moe.dazecake.inquisition.model.entity.ProUserEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-10T06:23:19+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.16.1 (Oracle Corporation)"
)
@Component
public class ProUserConvertImpl implements ProUserConvert {

    @Override
    public ProUserEntity toProUserEntity(CreateProUserDTO createProUserDTO) {
        if ( createProUserDTO == null ) {
            return null;
        }

        ProUserEntity proUserEntity = new ProUserEntity();

        proUserEntity.setUsername( createProUserDTO.getUsername() );
        proUserEntity.setPassword( createProUserDTO.getPassword() );
        proUserEntity.setPermission( createProUserDTO.getPermission() );
        proUserEntity.setDiscount( createProUserDTO.getDiscount() );
        proUserEntity.setExpireTime( createProUserDTO.getExpireTime() );

        proUserEntity.setId( (long) 0L );
        proUserEntity.setBalance( (double) 0.0 );
        proUserEntity.setAuthorization( org.apache.commons.lang3.RandomStringUtils.randomAlphabetic(16) );
        proUserEntity.setDelete( 0 );

        return proUserEntity;
    }

    @Override
    public ProUserEntity toProUserEntity(ProUserDTO proUserDTO) {
        if ( proUserDTO == null ) {
            return null;
        }

        ProUserEntity proUserEntity = new ProUserEntity();

        proUserEntity.setId( proUserDTO.getId() );
        proUserEntity.setUsername( proUserDTO.getUsername() );
        proUserEntity.setPassword( proUserDTO.getPassword() );
        proUserEntity.setPermission( proUserDTO.getPermission() );
        proUserEntity.setBalance( proUserDTO.getBalance() );
        proUserEntity.setDiscount( proUserDTO.getDiscount() );
        proUserEntity.setAuthorization( proUserDTO.getAuthorization() );
        proUserEntity.setExpireTime( proUserDTO.getExpireTime() );
        proUserEntity.setDelete( proUserDTO.getDelete() );

        return proUserEntity;
    }

    @Override
    public ProUserDTO toProUserDTO(ProUserEntity proUserEntity) {
        if ( proUserEntity == null ) {
            return null;
        }

        ProUserDTO proUserDTO = new ProUserDTO();

        proUserDTO.setId( proUserEntity.getId() );
        proUserDTO.setUsername( proUserEntity.getUsername() );
        proUserDTO.setPassword( proUserEntity.getPassword() );
        proUserDTO.setPermission( proUserEntity.getPermission() );
        proUserDTO.setBalance( proUserEntity.getBalance() );
        proUserDTO.setDiscount( proUserEntity.getDiscount() );
        proUserDTO.setAuthorization( proUserEntity.getAuthorization() );
        proUserDTO.setExpireTime( proUserEntity.getExpireTime() );
        proUserDTO.setDelete( proUserEntity.getDelete() );

        return proUserDTO;
    }
}
