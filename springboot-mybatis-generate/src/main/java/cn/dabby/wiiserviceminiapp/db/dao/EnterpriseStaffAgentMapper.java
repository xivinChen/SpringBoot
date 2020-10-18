package cn.dabby.wiiserviceminiapp.db.dao;

import cn.dabby.wiiserviceminiapp.db.entity.EnterpriseStaffAgent;
import java.util.List;

public interface EnterpriseStaffAgentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EnterpriseStaffAgent record);

    EnterpriseStaffAgent selectByPrimaryKey(Long id);

    List<EnterpriseStaffAgent> selectAll();

    int updateByPrimaryKey(EnterpriseStaffAgent record);
}