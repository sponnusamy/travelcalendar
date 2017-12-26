package com.selva.travelcalendar.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the TRAVEL_CONTACT_ASSOC database table.
 * 
 */
@Entity
@Table(name="TRAVEL_CONTACT_ASSOC")
@NamedQuery(name="TravelContactAssoc.findAll", query="SELECT t FROM TravelContactAssoc t")
public class TravelContactAssoc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="CONTACT_ID")
	private BigInteger contactId;

	@Column(name="CREATED_TIME")
	private Timestamp createdTime;

	@Column(name="LAST_UPDATED_TIME")
	private Timestamp lastUpdatedTime;

	@Column(name="TRAVEL_ID")
	private BigInteger travelId;

	//bi-directional many-to-one association to Contact
	@ManyToOne
	@JoinColumn(name="CREATED_BY")
	private Contact createdBy;

	//bi-directional many-to-one association to Contact
	@ManyToOne
	@JoinColumn(name="LAST_UPDATED_BY")
	private Contact lastUpdatedBy;

	public TravelContactAssoc() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigInteger getContactId() {
		return this.contactId;
	}

	public void setContactId(BigInteger contactId) {
		this.contactId = contactId;
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

	public BigInteger getTravelId() {
		return this.travelId;
	}

	public void setTravelId(BigInteger travelId) {
		this.travelId = travelId;
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