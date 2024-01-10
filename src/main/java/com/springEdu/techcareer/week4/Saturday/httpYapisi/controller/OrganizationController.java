package com.springEdu.techcareer.week4.Saturday.httpYapisi.controller;


import com.springEdu.techcareer.week4.Saturday.httpYapisi.dto.OrganizationSaveRequestDto;
import com.springEdu.techcareer.week4.Saturday.httpYapisi.dto.OrganizationUpdateRequestDto;
import com.springEdu.techcareer.week4.Saturday.httpYapisi.model.Organization;
import com.springEdu.techcareer.week4.Saturday.httpYapisi.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/organization")
public class OrganizationController {

    @Autowired
    OrganizationService organizationService;

    @GetMapping("/getAllOrganizations")
    public List<Organization> getAllOrganizations() {
        return organizationService.getAllOrganizations();
    }

    @GetMapping("/getOrganizationById")
    public ResponseEntity<Organization> getOrganizationById(@RequestParam int organizationId) {
        Organization organizationById = organizationService.getOrganizationById(organizationId);
        if (Objects.isNull(organizationById)) {
            return new ResponseEntity<>(organizationById, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(organizationById, HttpStatus.OK);
    }

//    @PostMapping("/saveOrganization")
//    public boolean saveOrganization1(@RequestBody Organization organization){
//       return organizationService.saveOrganization1(organization);
//    }

    @PostMapping("/saveOrganization")
    public boolean saveOrganization(@RequestBody OrganizationSaveRequestDto organizationSaveRequestDto) {
        return organizationService.saveOrganization(organizationSaveRequestDto);
    }

    @PutMapping("/updateOrganization")
    public ResponseEntity<Boolean> updateOrganization(@RequestBody OrganizationUpdateRequestDto organizationUpdateRequestDto) {
        Boolean updateOrganization = organizationService.updateOrganization(organizationUpdateRequestDto);
        return new ResponseEntity<>(updateOrganization, HttpStatus.OK);
    }

    @PatchMapping("/updateOrganizationName/{id}")
    public Boolean updateOrganizationName1(@PathVariable int id, @RequestParam String organizationName) {
        return organizationService.updateOrganizationName(id, organizationName);
    }

    @DeleteMapping("/deleteOrganization")
    public ResponseEntity<Boolean> deleteOrganization(@RequestParam int organizationId) {
        boolean deleteOrganization = organizationService.deleteOrganization(organizationId);
        return new ResponseEntity<>(deleteOrganization, HttpStatus.OK);
    }


}
