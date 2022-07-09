package com.vk.springboot.accntdemo.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.persistence.Entity;

@Entity
@Table(name="Fav_Accounts")
public class FavAccounts {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="customer_id")
	private int customerId;
	
	
	@Column(name="iban")
	private String iban;
	
	@NotNull(message="is required")
	@Column(name="account_name")
	private String acntName;
	
	@Column(name="bank_code")
	private int bankCode;
	
	public FavAccounts()
	{
		
	}

	

	public FavAccounts(int customerId, String iban, String acntName, int bankCode) {
	
		this.customerId = customerId;
		this.iban = iban;
		this.acntName = acntName;
		this.bankCode = bankCode;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getAcntName() {
		return acntName;
	}

	public void setAcntName(String acntName) {
		this.acntName = acntName;
	}

	public int getBankCode() {
		return bankCode;
	}

	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}

	@Override
	public String toString() {
		return "FavAccounts [id=" + id + ", iban=" + iban + ", acntName=" + acntName + ", bankCode=" + bankCode + "]";
	}
	
	
	
	
}
