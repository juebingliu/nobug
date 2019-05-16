package com.dbpf.nobug.database.dto;

import java.io.Serializable;

public class CusUser implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3511234871454716153L;
	/**
	 * 客户编码
	 */
	private String customerNo;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 手机号
	 */
	private String mobileNo;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 盐
	 */
	private String saltKey;
	/**
	 *账户状态
	 */
	private String accStatus;
	
	/**
	 * 激活状态
	 */
	private String activationState;
	
	public String getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSaltKey() {
		return saltKey;
	}
	public void setSaltKey(String saltKey) {
		this.saltKey = saltKey;
	}
	public String getAccStatus() {
		return accStatus;
	}
	public void setAccStatus(String accStatus) {
		this.accStatus = accStatus;
	}
	public String getActivationState() {
		return activationState;
	}
	public void setActivationState(String activationState) {
		this.activationState = activationState;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
