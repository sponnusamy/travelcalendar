package com.selva.travelcalendar.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * The persistent class for the CONTACT database table.
 * 
 */
@Entity
@NamedQuery(name = "Contact.findAll", query = "SELECT c FROM Contact c")
public class Contact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private int age;

	@Column(name = "CREATED_TIME")
	private Timestamp createdTime;

	@Column(name = "LAST_UPDATED_TIME")
	private Timestamp lastUpdatedTime;

	private String name;

	// bi-directional many-to-one association to Contact
	@ManyToOne
	@JoinColumn(name = "CREATED_BY")
	private Contact createdBy;

	// bi-directional many-to-one association to Contact
	@ManyToOne
	@JoinColumn(name = "LAST_UPDATED_BY")
	private Contact lastUpdatedBy;

	// bi-directional many-to-one association to ContactDetail
	@OneToMany(mappedBy = "contact")
	private List<ContactDetail> contactDetails;

	// bi-directional many-to-one association to TravelContactAssoc
	@OneToMany(mappedBy = "contact")
	private List<TravelContactAssoc> travelContactAssocs;

	public Contact() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public Timestamp getLastUpdatedTime() {
		return this.lastUpdatedTime;
	}

	public void setLastUpdatedTime(Timestamp lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public List<ContactDetail> getContactDetails() {
		return this.contactDetails;
	}

	public void setContactDetails(List<ContactDetail> contactDetails) {
		this.contactDetails = contactDetails;
	}

	public ContactDetail addContactDetails(ContactDetail contactDetails) {
		getContactDetails().add(contactDetails);
		contactDetails.setCreatedBy(this);

		return contactDetails;
	}

	public ContactDetail removeContactDetails(ContactDetail contactDetails) {
		getContactDetails().remove(contactDetails);
		contactDetails.setCreatedBy(null);

		return contactDetails;
	}

	public List<TravelContactAssoc> getTravelContactAssocs() {
		return this.travelContactAssocs;
	}

	public void setTravelContactAssocs(List<TravelContactAssoc> travelContactAssocs) {
		this.travelContactAssocs = travelContactAssocs;
	}

	public TravelContactAssoc addTravelContactAssocs(TravelContactAssoc travelContactAssocs) {
		getTravelContactAssocs().add(travelContactAssocs);
		travelContactAssocs.setLastUpdatedBy(this);

		return travelContactAssocs;
	}

	public TravelContactAssoc removeTravelContactAssocs(TravelContactAssoc travelContactAssocs) {
		getTravelContactAssocs().remove(travelContactAssocs);
		travelContactAssocs.setLastUpdatedBy(null);

		return travelContactAssocs;
	}

}