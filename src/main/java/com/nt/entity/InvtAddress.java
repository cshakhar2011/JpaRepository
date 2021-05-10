package com.nt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Invt_Address")
public class InvtAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int invtAddid;
	private String invtAddCity;
	private String invtStreet;
	
	@ManyToOne
	private UserEntity userEntity;

	public int getInvtAddid() {
		return invtAddid;
	}

	public void setInvtAddid(int invtAddid) {
		this.invtAddid = invtAddid;
	}

	public String getInvtAddCity() {
		return invtAddCity;
	}

	public void setInvtAddCity(String invtAddCity) {
		this.invtAddCity = invtAddCity;
	}

	public String getInvtStreet() {
		return invtStreet;
	}

	public void setInvtStreet(String invtStreet) {
		this.invtStreet = invtStreet;
	}

	public UserEntity getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	public InvtAddress(int invtAddid, String invtAddCity, String invtStreet, UserEntity userEntity) {
		super();
		this.invtAddid = invtAddid;
		this.invtAddCity = invtAddCity;
		this.invtStreet = invtStreet;
		this.userEntity = userEntity;
	}

	public InvtAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	


	
	
}