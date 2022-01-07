package com.anand.organization.controller;

import com.anand.organization.model.Organization;
import com.anand.organization.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@RequestMapping("/v1/organization")
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;

    @GetMapping("/{id}")
    public ResponseEntity<Organization> getOrganization(@PathVariable String id){
        return ResponseEntity.ok(organizationService.getOrganizationById(id));
    }
}
