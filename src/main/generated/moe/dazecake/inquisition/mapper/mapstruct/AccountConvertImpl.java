package moe.dazecake.inquisition.mapper.mapstruct;

import java.util.ArrayList;
import javax.annotation.processing.Generated;
import moe.dazecake.inquisition.model.dto.account.AccountDTO;
import moe.dazecake.inquisition.model.entity.AccountEntity;
import moe.dazecake.inquisition.model.vo.account.AccountWithSanVO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-10T06:23:20+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.16.1 (Oracle Corporation)"
)
@Component
public class AccountConvertImpl implements AccountConvert {

    @Override
    public AccountWithSanVO toAccountWithSanVO(AccountEntity accountEntity, String san) {
        if ( accountEntity == null && san == null ) {
            return null;
        }

        AccountWithSanVO accountWithSanVO = new AccountWithSanVO();

        if ( accountEntity != null ) {
            accountWithSanVO.setId( accountEntity.getId() );
            accountWithSanVO.setName( accountEntity.getName() );
            accountWithSanVO.setAccount( accountEntity.getAccount() );
            accountWithSanVO.setPassword( accountEntity.getPassword() );
            accountWithSanVO.setFreeze( accountEntity.getFreeze() );
            accountWithSanVO.setServer( accountEntity.getServer() );
            accountWithSanVO.setTaskType( accountEntity.getTaskType() );
            accountWithSanVO.setConfig( accountEntity.getConfig() );
            accountWithSanVO.setActive( accountEntity.getActive() );
            accountWithSanVO.setNotice( accountEntity.getNotice() );
            ArrayList<String> arrayList = accountEntity.getBLimitDevice();
            if ( arrayList != null ) {
                accountWithSanVO.setBLimitDevice( new ArrayList<String>( arrayList ) );
            }
            accountWithSanVO.setRefresh( accountEntity.getRefresh() );
            accountWithSanVO.setAgent( accountEntity.getAgent() );
            accountWithSanVO.setCreateTime( accountEntity.getCreateTime() );
            accountWithSanVO.setUpdateTime( accountEntity.getUpdateTime() );
            accountWithSanVO.setExpireTime( accountEntity.getExpireTime() );
            accountWithSanVO.setDelete( accountEntity.getDelete() );
        }
        accountWithSanVO.setSan( san );

        return accountWithSanVO;
    }

    @Override
    public AccountEntity toAccountEntity(AccountDTO accountDTO) {
        if ( accountDTO == null ) {
            return null;
        }

        AccountEntity accountEntity = new AccountEntity();

        accountEntity.setId( accountDTO.getId() );
        accountEntity.setName( accountDTO.getName() );
        accountEntity.setAccount( accountDTO.getAccount() );
        accountEntity.setPassword( accountDTO.getPassword() );
        accountEntity.setFreeze( accountDTO.getFreeze() );
        accountEntity.setServer( accountDTO.getServer() );
        accountEntity.setTaskType( accountDTO.getTaskType() );
        accountEntity.setConfig( accountDTO.getConfig() );
        accountEntity.setActive( accountDTO.getActive() );
        accountEntity.setNotice( accountDTO.getNotice() );
        ArrayList<String> arrayList = accountDTO.getBLimitDevice();
        if ( arrayList != null ) {
            accountEntity.setBLimitDevice( new ArrayList<String>( arrayList ) );
        }
        accountEntity.setRefresh( accountDTO.getRefresh() );
        accountEntity.setAgent( accountDTO.getAgent() );
        accountEntity.setCreateTime( accountDTO.getCreateTime() );
        accountEntity.setUpdateTime( accountDTO.getUpdateTime() );
        accountEntity.setExpireTime( accountDTO.getExpireTime() );
        accountEntity.setDelete( accountDTO.getDelete() );

        return accountEntity;
    }

    @Override
    public AccountDTO toAccountDTO(AccountEntity accountEntity) {
        if ( accountEntity == null ) {
            return null;
        }

        AccountDTO accountDTO = new AccountDTO();

        accountDTO.setId( accountEntity.getId() );
        accountDTO.setName( accountEntity.getName() );
        accountDTO.setAccount( accountEntity.getAccount() );
        accountDTO.setPassword( accountEntity.getPassword() );
        accountDTO.setFreeze( accountEntity.getFreeze() );
        accountDTO.setServer( accountEntity.getServer() );
        accountDTO.setTaskType( accountEntity.getTaskType() );
        accountDTO.setConfig( accountEntity.getConfig() );
        accountDTO.setActive( accountEntity.getActive() );
        accountDTO.setNotice( accountEntity.getNotice() );
        ArrayList<String> arrayList = accountEntity.getBLimitDevice();
        if ( arrayList != null ) {
            accountDTO.setBLimitDevice( new ArrayList<String>( arrayList ) );
        }
        accountDTO.setRefresh( accountEntity.getRefresh() );
        accountDTO.setAgent( accountEntity.getAgent() );
        accountDTO.setCreateTime( accountEntity.getCreateTime() );
        accountDTO.setUpdateTime( accountEntity.getUpdateTime() );
        accountDTO.setExpireTime( accountEntity.getExpireTime() );
        accountDTO.setDelete( accountEntity.getDelete() );

        return accountDTO;
    }
}
