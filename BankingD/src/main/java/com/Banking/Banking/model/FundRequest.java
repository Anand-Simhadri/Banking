package com.Banking.Banking.model;

import java.sql.Timestamp;

public class FundRequest {
	private Double amount;

	private Long fromAccount;

	private Long toAccount;

	private String type;

	public FundRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FundRequest(Double amount, Long fromAccount, Long toAccount, String type) {
		super();
		this.amount = amount;
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.type = type;
	}

	@Override
	public String toString() {
		return "FundRequest [amount=" + amount + ", fromAccount=" + fromAccount + ", toAccount=" + toAccount + ", type="
				+ type + "]";
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}

