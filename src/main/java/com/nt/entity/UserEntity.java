package com.nt.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
//@Table(name="UserEntity")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "invt_id")
	
	private int invtId;
	private String invtName;
	
	@OneToMany( cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="fk_add")
	private List<InvtAddress> invtAddress;


	@OneToMany( cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="fk_bank")
	private List<InvtBank> invtBank;


	public int getInvtId() {
		return invtId;
	}


	public void setInvtId(int invtId) {
		this.invtId = invtId;
	}


	public String getInvtName() {
		return invtName;
	}


	public void setInvtName(String invtName) {
		this.invtName = invtName;
	}


	public List<InvtAddress> getInvtAddress() {
		return invtAddress;
	}


	public void setInvtAddress(List<InvtAddress> invtAddress) {
		this.invtAddress = invtAddress;
	}


	public List<InvtBank> getInvtBank() {
		return invtBank;
	}


	public void setInvtBank(List<InvtBank> invtBank) {
		this.invtBank = invtBank;
	}


	public UserEntity(int invtId, String invtName, List<InvtAddress> invtAddress, List<InvtBank> invtBank) {
		super();
		this.invtId = invtId;
		this.invtName = invtName;
		this.invtAddress = invtAddress;
		this.invtBank = invtBank;
	}


	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}







}