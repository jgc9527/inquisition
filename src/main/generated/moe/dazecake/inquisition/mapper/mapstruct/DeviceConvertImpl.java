package moe.dazecake.inquisition.mapper.mapstruct;

import javax.annotation.processing.Generated;
import moe.dazecake.inquisition.model.dto.device.AddChinacDeviceDTO;
import moe.dazecake.inquisition.model.dto.device.AddCommonDeviceDTO;
import moe.dazecake.inquisition.model.dto.device.AddDeviceDTO;
import moe.dazecake.inquisition.model.dto.device.UpdateDeviceDTO;
import moe.dazecake.inquisition.model.entity.DeviceEntity;
import moe.dazecake.inquisition.model.vo.device.DeviceVO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-10T06:23:19+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.16.1 (Oracle Corporation)"
)
@Component
public class DeviceConvertImpl implements DeviceConvert {

    @Override
    public DeviceEntity toDeviceEntity(AddDeviceDTO addDeviceDTO) {
        if ( addDeviceDTO == null ) {
            return null;
        }

        DeviceEntity deviceEntity = new DeviceEntity();

        if ( addDeviceDTO.getDelete() != null ) {
            deviceEntity.setDelete( addDeviceDTO.getDelete() );
        }
        else {
            deviceEntity.setDelete( 0 );
        }
        deviceEntity.setId( addDeviceDTO.getId() );
        deviceEntity.setDeviceName( addDeviceDTO.getDeviceName() );
        deviceEntity.setDeviceToken( addDeviceDTO.getDeviceToken() );
        deviceEntity.setChinac( addDeviceDTO.getChinac() );
        deviceEntity.setRegion( addDeviceDTO.getRegion() );
        deviceEntity.setExpireTime( addDeviceDTO.getExpireTime() );

        return deviceEntity;
    }

    @Override
    public DeviceEntity toDeviceEntity(UpdateDeviceDTO updateDeviceDTO) {
        if ( updateDeviceDTO == null ) {
            return null;
        }

        DeviceEntity deviceEntity = new DeviceEntity();

        deviceEntity.setId( updateDeviceDTO.getId() );
        deviceEntity.setDeviceName( updateDeviceDTO.getDeviceName() );
        deviceEntity.setDeviceToken( updateDeviceDTO.getDeviceToken() );
        deviceEntity.setChinac( updateDeviceDTO.getChinac() );
        deviceEntity.setRegion( updateDeviceDTO.getRegion() );
        deviceEntity.setExpireTime( updateDeviceDTO.getExpireTime() );
        deviceEntity.setDelete( updateDeviceDTO.getDelete() );

        return deviceEntity;
    }

    @Override
    public AddDeviceDTO toAddDeviceDTO(AddCommonDeviceDTO addCommonDeviceDTO) {
        if ( addCommonDeviceDTO == null ) {
            return null;
        }

        AddDeviceDTO addDeviceDTO = new AddDeviceDTO();

        addDeviceDTO.setDeviceName( addCommonDeviceDTO.getDeviceName() );
        addDeviceDTO.setExpireTime( addCommonDeviceDTO.getExpireTime() );

        addDeviceDTO.setId( (long) 0L );
        addDeviceDTO.setChinac( 0 );
        addDeviceDTO.setRegion( null );
        addDeviceDTO.setDelete( 0 );
        addDeviceDTO.setDeviceToken( org.apache.commons.lang3.RandomStringUtils.randomAlphabetic(16) );

        return addDeviceDTO;
    }

    @Override
    public AddDeviceDTO toAddDeviceDTO(AddChinacDeviceDTO addChinacDeviceDTO) {
        if ( addChinacDeviceDTO == null ) {
            return null;
        }

        AddDeviceDTO addDeviceDTO = new AddDeviceDTO();

        addDeviceDTO.setDeviceName( addChinacDeviceDTO.getDeviceName() );
        addDeviceDTO.setDeviceToken( addChinacDeviceDTO.getDeviceToken() );
        addDeviceDTO.setChinac( addChinacDeviceDTO.getChinac() );
        addDeviceDTO.setRegion( addChinacDeviceDTO.getRegion() );
        addDeviceDTO.setExpireTime( addChinacDeviceDTO.getExpireTime() );

        addDeviceDTO.setId( (long) 0L );
        addDeviceDTO.setDelete( 0 );

        return addDeviceDTO;
    }

    @Override
    public DeviceVO toDeviceVO(DeviceEntity deviceEntity) {
        if ( deviceEntity == null ) {
            return null;
        }

        DeviceVO deviceVO = new DeviceVO();

        deviceVO.setId( deviceEntity.getId() );
        deviceVO.setDeviceName( deviceEntity.getDeviceName() );
        deviceVO.setDeviceToken( deviceEntity.getDeviceToken() );
        deviceVO.setChinac( deviceEntity.getChinac() );
        deviceVO.setRegion( deviceEntity.getRegion() );
        deviceVO.setExpireTime( deviceEntity.getExpireTime() );
        deviceVO.setDelete( deviceEntity.getDelete() );

        return deviceVO;
    }
}
