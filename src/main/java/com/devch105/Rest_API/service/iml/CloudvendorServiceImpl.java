package com.devch105.Rest_API.service.iml;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devch105.Rest_API.model.CloudVendour;
import com.devch105.Rest_API.repository.CloudVendorRepository;
import com.devch105.Rest_API.service.CloudVendorService;

//*************//
// SerVice    //
//  Layer      //
//*************//



@Service
public class CloudvendorServiceImpl implements CloudVendorService {
    
	CloudVendorRepository cloudVendorRepository;
	
	public CloudvendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
		this.cloudVendorRepository=cloudVendorRepository;
	}
	@Override
	public String createCloudVendor(CloudVendour cloudVendour) {
		// TODO Auto-generated method stub
		cloudVendorRepository.save(cloudVendour);
		
		return "Succesfully Data saved in DataBase";
	}

	@Override
	public String updateCloudVendor(CloudVendour cloudVendour) {
		// TODO Auto-generated method stub
		cloudVendorRepository.save(cloudVendour);
		return " Update Succesfully";
	}

	@Override
	public String deleteCloudVendor(String vendorId) {
		// TODO Auto-generated method stub
		cloudVendorRepository.deleteById(vendorId);
		return "vendor Deleted successfully";
	}

	@Override
	public CloudVendour getCloudVendour(String vendorId) {
		// TODO Auto-generated method stub
		
		return cloudVendorRepository.findById(vendorId).get();
	}

	@Override
	public List<CloudVendour> getallCloudVendors() {
		// TODO Auto-generated method stub
		return cloudVendorRepository.findAll();
		
	}
	
	

}
