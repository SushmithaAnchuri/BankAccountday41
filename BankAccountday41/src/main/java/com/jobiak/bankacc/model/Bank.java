package com.jobiak.bankacc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bankacc")
public class Bank 
{
@Id
private Long accountId;
private String name;
private String mobile;
private String balance;


public Long getAccountId() {
	return accountId;
}



public void setAccountId(Long accountId) {
	this.accountId = accountId;
}



public Bank() {
	// TODO Auto-generated constructor stub
}



public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getMobile() {
	return mobile;
}


public void setMobile(String mobile) {
	this.mobile = mobile;
}


public String getBalance() {
	return balance;
}


public void setBalance(String balance) {
	this.balance = balance;
}

}