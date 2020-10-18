package cn.dabby.fama.db.dao;

import cn.dabby.fama.db.entity.EnterpriseStaffCustomerEmployee;
import java.util.List;

public interface EnterpriseStaffCustomerEmployeeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EnterpriseStaffCustomerEmployee record);

    EnterpriseStaffCustomerEmployee selectByPrimaryKey(Long id);

    List<EnterpriseStaffCustomerEmployee> selectAll();

    int updateByPrimaryKey(EnterpriseStaffCustomerEmployee record);
}