package cn.dabby.fama.db.entity;

import java.io.Serializable;
import java.util.Date;

public class EnterpriseStaffCustomerEmployee implements Serializable {
    private Long id;

    private Long enterpriseStaffId;

    private Long customerEmployeeId;

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

    public Long getEnterpriseStaffId() {
        return enterpriseStaffId;
    }

    public void setEnterpriseStaffId(Long enterpriseStaffId) {
        this.enterpriseStaffId = enterpriseStaffId;
    }

    public Long getCustomerEmployeeId() {
        return customerEmployeeId;
    }

    public void setCustomerEmployeeId(Long customerEmployeeId) {
        this.customerEmployeeId = customerEmployeeId;
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