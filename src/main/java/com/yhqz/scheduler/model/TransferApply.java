package com.yhqz.scheduler.model;

import java.util.Date;

public class TransferApply {
    private Integer rowId;

    private String transferTitle;

    private Long profitAmount;

    private Long transferAmount;

    private Long creditAmount;

    private Long remainAmount;

    private String transferDesc;

    private Integer transferorId;

    private Integer recordId;

    private Integer loanId;

    private Long loanRate;

    private Integer creditTerm;

    private String transferStatus;

    private String transferReason;

    private Date applyDate;

    private Date auditDate;

    private Date raiseendDate;

    private Date transferendDate;

    private Integer createdId;

    private Date createdTime;

    private Integer updateId;

    private Date updateTime;

    public Integer getRowId() {
        return rowId;
    }

    public void setRowId(Integer rowId) {
        this.rowId = rowId;
    }

    public String getTransferTitle() {
        return transferTitle;
    }

    public void setTransferTitle(String transferTitle) {
        this.transferTitle = transferTitle == null ? null : transferTitle.trim();
    }

    public Long getProfitAmount() {
        return profitAmount;
    }

    public void setProfitAmount(Long profitAmount) {
        this.profitAmount = profitAmount;
    }

    public Long getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(Long transferAmount) {
        this.transferAmount = transferAmount;
    }

    public Long getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Long creditAmount) {
        this.creditAmount = creditAmount;
    }

    public Long getRemainAmount() {
        return remainAmount;
    }

    public void setRemainAmount(Long remainAmount) {
        this.remainAmount = remainAmount;
    }

    public String getTransferDesc() {
        return transferDesc;
    }

    public void setTransferDesc(String transferDesc) {
        this.transferDesc = transferDesc == null ? null : transferDesc.trim();
    }

    public Integer getTransferorId() {
        return transferorId;
    }

    public void setTransferorId(Integer transferorId) {
        this.transferorId = transferorId;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public Long getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(Long loanRate) {
        this.loanRate = loanRate;
    }

    public Integer getCreditTerm() {
        return creditTerm;
    }

    public void setCreditTerm(Integer creditTerm) {
        this.creditTerm = creditTerm;
    }

    public String getTransferStatus() {
        return transferStatus;
    }

    public void setTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus == null ? null : transferStatus.trim();
    }

    public String getTransferReason() {
        return transferReason;
    }

    public void setTransferReason(String transferReason) {
        this.transferReason = transferReason == null ? null : transferReason.trim();
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public Date getRaiseendDate() {
        return raiseendDate;
    }

    public void setRaiseendDate(Date raiseendDate) {
        this.raiseendDate = raiseendDate;
    }

    public Date getTransferendDate() {
        return transferendDate;
    }

    public void setTransferendDate(Date transferendDate) {
        this.transferendDate = transferendDate;
    }

    public Integer getCreatedId() {
        return createdId;
    }

    public void setCreatedId(Integer createdId) {
        this.createdId = createdId;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}