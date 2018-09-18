package com.nongshanie.springboot.springbootdemo.dao.model;

public class SrCredit {
    private Integer id;

    private Integer sruid;

    private String outUserid;

    private String creditSn;

    private String productCode;

    private Integer amount;

    private String remark;

    private String creditRemark;

    private String creditOperatorNo;

    private String creditResult;

    private Integer creditTime;

    private Integer channel;

    private String status;

    private Integer version;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSruid() {
        return sruid;
    }

    public void setSruid(Integer sruid) {
        this.sruid = sruid;
    }

    public String getOutUserid() {
        return outUserid;
    }

    public void setOutUserid(String outUserid) {
        this.outUserid = outUserid == null ? null : outUserid.trim();
    }

    public String getCreditSn() {
        return creditSn;
    }

    public void setCreditSn(String creditSn) {
        this.creditSn = creditSn == null ? null : creditSn.trim();
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreditRemark() {
        return creditRemark;
    }

    public void setCreditRemark(String creditRemark) {
        this.creditRemark = creditRemark == null ? null : creditRemark.trim();
    }

    public String getCreditOperatorNo() {
        return creditOperatorNo;
    }

    public void setCreditOperatorNo(String creditOperatorNo) {
        this.creditOperatorNo = creditOperatorNo == null ? null : creditOperatorNo.trim();
    }

    public String getCreditResult() {
        return creditResult;
    }

    public void setCreditResult(String creditResult) {
        this.creditResult = creditResult == null ? null : creditResult.trim();
    }

    public Integer getCreditTime() {
        return creditTime;
    }

    public void setCreditTime(Integer creditTime) {
        this.creditTime = creditTime;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"sruid\":")
                .append(sruid);
        sb.append(",\"outUserid\":\"")
                .append(outUserid).append('\"');
        sb.append(",\"creditSn\":\"")
                .append(creditSn).append('\"');
        sb.append(",\"productCode\":\"")
                .append(productCode).append('\"');
        sb.append(",\"amount\":")
                .append(amount);
        sb.append(",\"remark\":\"")
                .append(remark).append('\"');
        sb.append(",\"creditRemark\":\"")
                .append(creditRemark).append('\"');
        sb.append(",\"creditOperatorNo\":\"")
                .append(creditOperatorNo).append('\"');
        sb.append(",\"creditResult\":\"")
                .append(creditResult).append('\"');
        sb.append(",\"creditTime\":")
                .append(creditTime);
        sb.append(",\"channel\":")
                .append(channel);
        sb.append(",\"status\":\"")
                .append(status).append('\"');
        sb.append(",\"version\":")
                .append(version);
        sb.append('}');
        return sb.toString();
    }
}