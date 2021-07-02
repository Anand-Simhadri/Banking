package com.Banking.Banking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account_details",schema="dbo")
public class AccountDetails {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountNumber;
    
    private String accountType;
    
    private String branchAddress;
    
    private Long customerId;
    
    private String ifscCode;
    
    private Double opening_balance;

    
	public AccountDetails() {
	}


	public AccountDetails(String accountType, String branchAddress, Long customerId, String ifscCode,
			Double opening_balance) {
		this.accountType = accountType;
		this.branchAddress = branchAddress;
		this.customerId = customerId;
		this.ifscCode = ifscCode;
		this.opening_balance = opening_balance;
	}


	public Long getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public String getBranchAddress() {
		return branchAddress;
	}


	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}


	public Long getCustomerId() {
		return customerId;
	}


	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}


	public String getIfscCode() {
		return ifscCode;
	}


	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}


	public Double getOpening_balance() {
		return opening_balance;
	}


	public void setOpening_balance(Double opening_balance) {
		this.opening_balance = opening_balance;
	}


	@Override
	public String toString() {
		return "AccountDetails [accountNumber=" + accountNumber + ", accountType=" + accountType + ", branchAddress="
				+ branchAddress + ", customerId=" + customerId + ", ifscCode=" + ifscCode + ", opening_balance="
				+ opening_balance + "]";
	}
    
}
