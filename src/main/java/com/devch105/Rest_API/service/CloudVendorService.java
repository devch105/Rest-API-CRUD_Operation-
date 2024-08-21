package com.devch105.Rest_API.service;

import java.util.List;


//*************//
//Interface    //
// Service Layer    //
//Layer         //
//*************//

import com.devch105.Rest_API.model.CloudVendour;

public interface CloudVendorService {
	public String createCloudVendor(CloudVendour cloudVendour);
	public String updateCloudVendor(CloudVendour cloudVendour);
	
    public String deleteCloudVendor(String vendorId);
    public CloudVendour getCloudVendour(String vendorId);
    public List<CloudVendour> getallCloudVendors();
}
