package cn.dabby.wiiserviceminiapp.db.dao;

import cn.dabby.wiiserviceminiapp.db.entity.EnterpriseVerifier;
import java.util.List;

public interface EnterpriseVerifierMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EnterpriseVerifier record);

    EnterpriseVerifier selectByPrimaryKey(Long id);

    List<EnterpriseVerifier> selectAll();

    int updateByPrimaryKey(EnterpriseVerifier record);
}