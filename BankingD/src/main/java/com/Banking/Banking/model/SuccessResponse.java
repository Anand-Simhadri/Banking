package com.Banking.Banking.model;

public class SuccessResponse {

	private String status;
	private String message;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public SuccessResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SuccessResponse(String status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	@Override
	public String toString() {
		return "SuccessResponse [status=" + status + ", message=" + message + "]";
	}
	
}
