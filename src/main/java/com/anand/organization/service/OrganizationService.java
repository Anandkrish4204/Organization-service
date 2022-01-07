package com.anand.organization.service;

import com.anand.organization.model.Organization;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService {

    public Organization getOrganizationById(String orgId){
        Organization organization = new Organization();
        organization.setId(orgId);
        organization.setName("Finance");
        organization.setContactNumber("9999999");
        organization.setContactEmail("test@gmail.com");
        organization.setContactName("John Doe");
        return organization;
    }
}
