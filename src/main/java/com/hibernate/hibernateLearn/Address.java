package com.hibernate.hibernateLearn;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Entity
@Table(name="student_address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //strategy gets the type of way increment of primary key happens
	@Column(name="address_id")
	private int addressId;
	@Column(name="address_street", length=50)
	private String addressStreet;
	@Column(name="address_city", length=10)
	private String addressCity;
	@Column(name="is_open")
	private boolean isOpen;
	@Column(name="added_date")
	@Temporal(TemporalType.DATE) //TemportalType gets the class that contains the methods to get time
	private Date addedDate;
	@Lob //indicates large objects
	private byte[] addressImage;
	@Transient //wont store this as a column in the table
	private int x;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int addressId, String addressStreet, String addressCity, boolean isOpen, Date addedDate,
			byte[] addressImage, int x) {
		super();
		this.addressId = addressId;
		this.addressStreet = addressStreet;
		this.addressCity = addressCity;
		this.isOpen = isOpen;
		this.addedDate = addedDate;
		this.addressImage = addressImage;
		this.x = x;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddressStreet() {
		return addressStreet;
	}

	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public byte[] getAddressImage() {
		return addressImage;
	}

	public void setAddressImage(byte[] addressImage) {
		this.addressImage = addressImage;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressStreet=" + addressStreet + ", addressCity=" + addressCity
				+ ", isOpen=" + isOpen + ", addedDate=" + addedDate + "]";
	}
	
}
