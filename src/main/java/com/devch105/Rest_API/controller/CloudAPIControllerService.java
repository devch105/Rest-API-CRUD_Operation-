package com.devch105.Rest_API.controller;

import java.util.List;



import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devch105.Rest_API.model.CloudVendour;
import com.devch105.Rest_API.service.CloudVendorService;


//********************//
//                    //
// Controller Layer   //
//                    //
//********************//
@RestController
@RequestMapping("/CloudVendor")
public class CloudAPIControllerService {
	
	CloudVendorService cloudVendorService;
	
	public CloudAPIControllerService(CloudVendorService cloudVendorService) {
		// TODO Auto-generated constructor stub
		this.cloudVendorService=cloudVendorService;
	}
	   
	@GetMapping("{vendorId}")
	
       public CloudVendour getCloudVendorDetails(@PathVariable("vendorId")  String vendorId) {
		   return cloudVendorService.getCloudVendour(vendorId);
    	   	
       }
	
	@GetMapping
	 public List<CloudVendour> getallCloudVendorDetails() {
		   return cloudVendorService.getallCloudVendors();
		   
     }
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendour cloudVendour) {
		cloudVendorService.createCloudVendor(cloudVendour);
		return " Cloudvendor Created successfully";
	}
	
	
	@PutMapping
	public String UpdateCloudVendorDetails(@RequestBody CloudVendour cloudVendour) {
		cloudVendorService.updateCloudVendor(cloudVendour);
		return " Cloudvendor Update successfully";
	}
	
	@DeleteMapping("{vendorId}")
	public String DeleteCloudVendorDetails(@PathVariable("vendorId")   String vendorId) {
		cloudVendorService.deleteCloudVendor(vendorId);
		return " Cloudvendor Delete successfully";
	}
	
}
