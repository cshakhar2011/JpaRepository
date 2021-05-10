package com.nt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
//@Table(name="Invt_Bank")
public class InvtBank {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accountNo;
	private String accountCustomerName;
	private String accountCustomerIFSC;

	private String active;


	
	

	@ManyToOne
	private UserEntity userEntity;





	public int getAccountNo() {
		return accountNo;
	}





	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}





	public String getAccountCustomerName() {
		return accountCustomerName;
	}





	public void setAccountCustomerName(String accountCustomerName) {
		this.accountCustomerName = accountCustomerName;
	}





	public String getAccountCustomerIFSC() {
		return accountCustomerIFSC;
	}





	public void setAccountCustomerIFSC(String accountCustomerIFSC) {
		this.accountCustomerIFSC = accountCustomerIFSC;
	}





	public String getActive() {
		return active;
	}





	public void setActive(String active) {
		this.active = active;
	}





	public UserEntity getUserEntity() {
		return userEntity;
	}





	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}





	public InvtBank(int accountNo, String accountCustomerName, String accountCustomerIFSC, String active,
			UserEntity userEntity) {
		super();
		this.accountNo = accountNo;
		this.accountCustomerName = accountCustomerName;
		this.accountCustomerIFSC = accountCustomerIFSC;
		this.active = active;
		this.userEntity = userEntity;
	}





	public InvtBank() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
}