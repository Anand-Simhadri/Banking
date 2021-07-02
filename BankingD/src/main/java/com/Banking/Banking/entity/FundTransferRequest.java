package com.Banking.Banking.entity;


import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction_details",schema="dbo")
public class FundTransferRequest {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long transactionId;
	
	private Double amount;
	
	private Long fromAccount;
	
	private Long toAccount;
	
	private Timestamp transactionTime;
	
	private String type;

	
	public FundTransferRequest() {
	}


	public FundTransferRequest(Double amount, Long fromAccount, Long toAccount, Timestamp datetime, String type) {
		this.amount = amount;
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.transactionTime = datetime;
		this.type = type;
	}


	public Long getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}


	public Long getFromAccount() {
		return fromAccount;
	}


	public void setFromAccount(Long fromAccount) {
		this.fromAccount = fromAccount;
	}


	public Long getToAccount() {
		return toAccount;
	}


	public void setToAccount(Long toAccount) {
		this.toAccount = toAccount;
	}


	public Timestamp getTransactionTime() {
		return transactionTime;
	}


	public void setTransactionTime(Timestamp transactionTime) {
		this.transactionTime = transactionTime;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "FundTransferRequest [transactionId=" + transactionId + ", fromAccount=" + fromAccount + ", toAccount="
				+ toAccount + ", transactionTime=" + transactionTime + ", type=" + type + "]";
	}
}
