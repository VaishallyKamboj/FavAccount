package com.vk.springboot.accntdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bank")
public class Bank {
	@Id
	@Column(name="code")
	private int code;
	@Column(name="bank_name")
	private String bankName;
	
	public Bank()
	{
		
	}
	
	public Bank(String bankName) {
		
		this.bankName = bankName;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	

}
