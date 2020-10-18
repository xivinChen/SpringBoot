package cn.dabby.wiiserviceminiapp.db.entity;

import java.io.Serializable;
import java.util.Date;

public class EnterpriseStaffAgent implements Serializable {
    private Long id;

    private String agentIdType;

    private String agentIdNum;

    private String agentPhone;

    private String agentFullname;

    private Byte isDeleted;

    private Date createTime;

    private Date modifyTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAgentIdType() {
        return agentIdType;
    }

    public void setAgentIdType(String agentIdType) {
        this.agentIdType = agentIdType == null ? null : agentIdType.trim();
    }

    public String getAgentIdNum() {
        return agentIdNum;
    }

    public void setAgentIdNum(String agentIdNum) {
        this.agentIdNum = agentIdNum == null ? null : agentIdNum.trim();
    }

    public String getAgentPhone() {
        return agentPhone;
    }

    public void setAgentPhone(String agentPhone) {
        this.agentPhone = agentPhone == null ? null : agentPhone.trim();
    }

    public String getAgentFullname() {
        return agentFullname;
    }

    public void setAgentFullname(String agentFullname) {
        this.agentFullname = agentFullname == null ? null : agentFullname.trim();
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}