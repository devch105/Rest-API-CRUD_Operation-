package com.devch105.Rest_API.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


// *************//
//   Model       //
// Data Layer   //
//              //
// *************//



@Entity
@Table(name="cloud_vendor_info")
public class CloudVendour {

	// Properties --
	@Id
	private String vendorId;
	private String vendorName;
	private String vendorAddress;
	private String vendorPhoneNumber;
	
	
	// Empty Constructors--
	
	public CloudVendour() {
		
	}
	
	// Main Constructors
	public CloudVendour(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.vendorPhoneNumber = vendorPhoneNumber;
	}
	
	
	
	// # Setters
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}

	public void setVendorPhoneNumber(String vendorPhoneNumber) {
		this.vendorPhoneNumber = vendorPhoneNumber;
	}
	
	
	
	
	// # Getters 
	
	public String getVendorId() {
		return vendorId;
	}
	

	public String getVendorName() {
		return vendorName;
	}
	public String getVendorAddress() {
		return vendorAddress;
	}
	public String getVendorPhoneNumber() {
		return vendorPhoneNumber;
	}
	
	
}
