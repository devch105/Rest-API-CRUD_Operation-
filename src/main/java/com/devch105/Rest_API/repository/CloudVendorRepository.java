package com.devch105.Rest_API.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devch105.Rest_API.model.CloudVendour;

//*************//
//Interface    //
//Repository    //
//  Layer      //
//*************//


public interface CloudVendorRepository extends JpaRepository<CloudVendour, String > {

}
