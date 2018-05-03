package com.lmy.pojo;

public class ResultModel {
	private String message;
	private boolean ifSuccess;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isIfSuccess() {
		return ifSuccess;
	}

	public void setIfSuccess(boolean ifSuccess) {
		this.ifSuccess = ifSuccess;
	}

	public ResultModel(String message, boolean ifSuccess) {
		super();
		this.message = message;
		this.ifSuccess = ifSuccess;
	}

	public ResultModel() {
		super();
	}

	@Override
	public String toString() {
		return "Result [message=" + message + ", ifSuccess=" + ifSuccess + "]";
	}

}
