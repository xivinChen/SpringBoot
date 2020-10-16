package cn.dabby.fama.db.entity;

import java.io.Serializable;
import java.util.Date;

public class PushCustomerInfo implements Serializable {
    private Long id;

    private Byte visitType;

    private Integer reverseId;

    private String visitName;

    private String visitMobile;

    private String visitCard;

    private String visitOrgName;

    private String nickName;

    private Date visitTime;

    private String visitNum;

    private String visitReason;

    private String empName;

    private String empMobile;

    private String empOrgName;

    private String empOrgAddress;

    private String operatorFullName;

    private String operatorIdNum;

    private String operatorPhone;

    private String remark;

    private Date dataTime;

    private Byte dataState;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getVisitType() {
        return visitType;
    }

    public void setVisitType(Byte visitType) {
        this.visitType = visitType;
    }

    public Integer getReverseId() {
        return reverseId;
    }

    public void setReverseId(Integer reverseId) {
        this.reverseId = reverseId;
    }

    public String getVisitName() {
        return visitName;
    }

    public void setVisitName(String visitName) {
        this.visitName = visitName == null ? null : visitName.trim();
    }

    public String getVisitMobile() {
        return visitMobile;
    }

    public void setVisitMobile(String visitMobile) {
        this.visitMobile = visitMobile == null ? null : visitMobile.trim();
    }

    public String getVisitCard() {
        return visitCard;
    }

    public void setVisitCard(String visitCard) {
        this.visitCard = visitCard == null ? null : visitCard.trim();
    }

    public String getVisitOrgName() {
        return visitOrgName;
    }

    public void setVisitOrgName(String visitOrgName) {
        this.visitOrgName = visitOrgName == null ? null : visitOrgName.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    public String getVisitNum() {
        return visitNum;
    }

    public void setVisitNum(String visitNum) {
        this.visitNum = visitNum == null ? null : visitNum.trim();
    }

    public String getVisitReason() {
        return visitReason;
    }

    public void setVisitReason(String visitReason) {
        this.visitReason = visitReason == null ? null : visitReason.trim();
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getEmpMobile() {
        return empMobile;
    }

    public void setEmpMobile(String empMobile) {
        this.empMobile = empMobile == null ? null : empMobile.trim();
    }

    public String getEmpOrgName() {
        return empOrgName;
    }

    public void setEmpOrgName(String empOrgName) {
        this.empOrgName = empOrgName == null ? null : empOrgName.trim();
    }

    public String getEmpOrgAddress() {
        return empOrgAddress;
    }

    public void setEmpOrgAddress(String empOrgAddress) {
        this.empOrgAddress = empOrgAddress == null ? null : empOrgAddress.trim();
    }

    public String getOperatorFullName() {
        return operatorFullName;
    }

    public void setOperatorFullName(String operatorFullName) {
        this.operatorFullName = operatorFullName == null ? null : operatorFullName.trim();
    }

    public String getOperatorIdNum() {
        return operatorIdNum;
    }

    public void setOperatorIdNum(String operatorIdNum) {
        this.operatorIdNum = operatorIdNum == null ? null : operatorIdNum.trim();
    }

    public String getOperatorPhone() {
        return operatorPhone;
    }

    public void setOperatorPhone(String operatorPhone) {
        this.operatorPhone = operatorPhone == null ? null : operatorPhone.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    public Byte getDataState() {
        return dataState;
    }

    public void setDataState(Byte dataState) {
        this.dataState = dataState;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}