package com.selva.travelcalendar.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;

/**
 * The persistent class for the CONTACT_DETAILS database table.
 * 
 */
@Entity
@Table(name = "CONTACT_DETAILS")
@NamedQuery(name = "ContactDetail.findAll", query = "SELECT c FROM ContactDetail c")
public class ContactDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String address;

	@Column(name = "CREATED_TIME")
	private Timestamp createdTime;

	private String email;

	@Column(name = "LAST_UPDATED_TIME")
	private Timestamp lastUpdatedTime;

	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	private String type;

	// bi-directional many-to-one association to Contact
	@ManyToOne
	@JoinColumn(name = "CONTACT_ID")
	private Contact contact;

	// bi-directional many-to-one association to Contact
	@ManyToOne
	@JoinColumn(name = "CREATED_BY")
	private Contact createdBy;

	// bi-directional many-to-one association to Contact
	@ManyToOne
	@JoinColumn(name = "LAST_UPDATED_BY")
	private Contact lastUpdatedBy;

	public ContactDetail() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getLastUpdatedTime() {
		return this.lastUpdatedTime;
	}

	public void setLastUpdatedTime(Timestamp lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Contact getContact() {
		return this.contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Contact getCreatedBy() {
		return createdBy;
	}

	public Contact getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setCreatedBy(Contact createdBy) {
		this.createdBy = createdBy;
	}

	public void setLastUpdatedBy(Contact lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

}