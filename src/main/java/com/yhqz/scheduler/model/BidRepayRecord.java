package com.yhqz.scheduler.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

public class BidRepayRecord {

	private Integer rowId;
	private Integer bidId;
	private Integer payeeId;
	private Integer receiverId;
	private Integer transTypeId;
	private Integer termth;
	private BigDecimal repayAmount;
	private Date dueDate;
	private String status;
	private Timestamp repaidDate;
	private Integer bidCreditId;

	public Integer getRowId() {
		return rowId;
	}

	public void setRowId(Integer rowId) {
		this.rowId = rowId;
	}

	public Integer getBidId() {
		return bidId;
	}

	public void setBidId(Integer bidId) {
		this.bidId = bidId;
	}

	public Integer getPayeeId() {
		return payeeId;
	}

	public void setPayeeId(Integer payeeId) {
		this.payeeId = payeeId;
	}

	public Integer getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(Integer receiverId) {
		this.receiverId = receiverId;
	}

	public Integer getTransTypeId() {
		return transTypeId;
	}

	public void setTransTypeId(Integer transTypeId) {
		this.transTypeId = transTypeId;
	}

	public Integer getTermth() {
		return termth;
	}

	public void setTermth(Integer termth) {
		this.termth = termth;
	}

	public BigDecimal getRepayAmount() {
		return repayAmount;
	}

	public void setRepayAmount(BigDecimal repayAmount) {
		this.repayAmount = repayAmount;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getRepaidDate() {
		return repaidDate;
	}

	public void setRepaidDate(Timestamp repaidDate) {
		this.repaidDate = repaidDate;
	}

	public Integer getBidCreditId() {
		return bidCreditId;
	}

	public void setBidCreditId(Integer bidCreditId) {
		this.bidCreditId = bidCreditId;
	}

}