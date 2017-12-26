package com.selva.travelcalendar.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

/**
 * The persistent class for the TRAVEL database table.
 * 
 */
@Entity
@NamedQuery(name = "Travel.findAll", query = "SELECT t FROM Travel t")
public class Travel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name = "CREATED_TIME")
	private Timestamp createdTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DEPARUTRE_TIME")
	private Date deparutreTime;

	private String destination;

	@Column(name = "LAST_UPDATED_TIME")
	private Timestamp lastUpdatedTime;

	@Column(name = "NO_OF_PASSENGERS")
	private int noOfPassengers;

	private String source;

	private String status;

	@Column(name = "TICKET_ID")
	private String ticketId;

	@Column(name = "TRAVEL_MODE")
	private String travelMode;

	@Column(name = "TRAVELS_NAME")
	private String travelsName;

	// bi-directional many-to-one association to Contact
	@ManyToOne
	@JoinColumn(name = "CREATED_BY")
	private Contact createdBy;

	// bi-directional many-to-one association to Contact
	@ManyToOne
	@JoinColumn(name = "LAST_UPDATED_BY")
	private Contact lastUpdatedBy;

	public Travel() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public Date getDeparutreTime() {
		return this.deparutreTime;
	}

	public void setDeparutreTime(Date deparutreTime) {
		this.deparutreTime = deparutreTime;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Timestamp getLastUpdatedTime() {
		return this.lastUpdatedTime;
	}

	public void setLastUpdatedTime(Timestamp lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}

	public int getNoOfPassengers() {
		return this.noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTicketId() {
		return this.ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public String getTravelMode() {
		return this.travelMode;
	}

	public void setTravelMode(String travelMode) {
		this.travelMode = travelMode;
	}

	public String getTravelsName() {
		return this.travelsName;
	}

	public void setTravelsName(String travelsName) {
		this.travelsName = travelsName;
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