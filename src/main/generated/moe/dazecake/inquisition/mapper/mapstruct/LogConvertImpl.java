package moe.dazecake.inquisition.mapper.mapstruct;

import javax.annotation.processing.Generated;
import moe.dazecake.inquisition.model.dto.log.AddLogDTO;
import moe.dazecake.inquisition.model.dto.log.LogDTO;
import moe.dazecake.inquisition.model.entity.LogEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-10T06:23:20+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.16.1 (Oracle Corporation)"
)
@Component
public class LogConvertImpl implements LogConvert {

    @Override
    public LogEntity toLogEntity(AddLogDTO addLogDTO) {
        if ( addLogDTO == null ) {
            return null;
        }

        LogEntity logEntity = new LogEntity();

        logEntity.setId( addLogDTO.getId() );
        logEntity.setLevel( addLogDTO.getLevel() );
        logEntity.setTaskType( addLogDTO.getTaskType() );
        logEntity.setTitle( addLogDTO.getTitle() );
        logEntity.setDetail( addLogDTO.getDetail() );
        logEntity.setImageUrl( addLogDTO.getImageUrl() );
        logEntity.setFrom( addLogDTO.getFrom() );
        logEntity.setServer( addLogDTO.getServer() );
        logEntity.setName( addLogDTO.getName() );
        logEntity.setAccount( addLogDTO.getAccount() );
        logEntity.setPassword( addLogDTO.getPassword() );
        logEntity.setTime( addLogDTO.getTime() );
        logEntity.setDelete( addLogDTO.getDelete() );

        return logEntity;
    }

    @Override
    public LogDTO toLogDTO(LogEntity logEntity) {
        if ( logEntity == null ) {
            return null;
        }

        LogDTO logDTO = new LogDTO();

        logDTO.setId( logEntity.getId() );
        logDTO.setLevel( logEntity.getLevel() );
        logDTO.setTaskType( logEntity.getTaskType() );
        logDTO.setTitle( logEntity.getTitle() );
        logDTO.setDetail( logEntity.getDetail() );
        logDTO.setImageUrl( logEntity.getImageUrl() );
        logDTO.setFrom( logEntity.getFrom() );
        logDTO.setServer( logEntity.getServer() );
        logDTO.setName( logEntity.getName() );
        logDTO.setAccount( logEntity.getAccount() );
        logDTO.setPassword( logEntity.getPassword() );
        logDTO.setTime( logEntity.getTime() );
        logDTO.setDelete( logEntity.getDelete() );

        return logDTO;
    }
}
