package cn.dabby.fama.db.dao;

import cn.dabby.fama.db.entity.PushCustomerInfo;
import java.util.List;

public interface PushCustomerInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PushCustomerInfo record);

    PushCustomerInfo selectByPrimaryKey(Long id);

    List<PushCustomerInfo> selectAll();

    int updateByPrimaryKey(PushCustomerInfo record);
}