package com.saby.evs.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the USERDETAILS database table.
 * 
 */
@Entity
@Table(name="USERDETAILS")
@NamedQuery(name="Userdetail.findAll", query="SELECT u FROM Userdetail u")
public class Userdetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="USERDETAILS_USERDETAILDID_GENERATOR", sequenceName="USERDETAIL_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USERDETAILS_USERDETAILDID_GENERATOR")
	private long userdetaildid;

	private String addressline1;

	private String addressline2;

	private String city;

	private String constituincy;

	private String email;

	private String firstname;

	private String lastname;

	private String password;

	private String phonenumber;

	@Column(name="\"STATE\"")
	private String state;

	private String status;

	private String username;

	private BigDecimal zip;

	public Userdetail() {
	}

	public long getUserdetaildid() {
		return this.userdetaildid;
	}

	public void setUserdetaildid(long userdetaildid) {
		this.userdetaildid = userdetaildid;
	}

	public String getAddressline1() {
		return this.addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return this.addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getConstituincy() {
		return this.constituincy;
	}

	public void setConstituincy(String constituincy) {
		this.constituincy = constituincy;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhonenumber() {
		return this.phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public BigDecimal getZip() {
		return this.zip;
	}

	public void setZip(BigDecimal zip) {
		this.zip = zip;
	}

}