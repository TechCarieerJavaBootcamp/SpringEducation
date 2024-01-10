package com.springEdu.techcareer.week4.Saturday.httpYapisi.service;

import com.springEdu.techcareer.week4.Saturday.httpYapisi.configuration.OrganizationConfig;
import com.springEdu.techcareer.week4.Saturday.httpYapisi.dto.OrganizationSaveRequestDto;
import com.springEdu.techcareer.week4.Saturday.httpYapisi.dto.OrganizationUpdateRequestDto;
import com.springEdu.techcareer.week4.Saturday.httpYapisi.model.Organization;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class OrganizationService {

    public List<Organization> getAllOrganizations() {
        return OrganizationConfig.organizationList;
    }

    public Organization getOrganizationById(int organizationId) {
        List<Organization> organizationList = OrganizationConfig.organizationList;
        for (Organization organization : organizationList) {
            if (organization.getId() == organizationId) {
                return organization;
            }
        }
        return null;
    }

    public boolean saveOrganization1(Organization organization) {
        List<Organization> organizationList = OrganizationConfig.organizationList;
        organizationList.add(organization);
        return true;
    }

    public boolean saveOrganization(OrganizationSaveRequestDto organizationSaveRequestDto) {
        // Client'tan alınan veriler.
        String organizationName = organizationSaveRequestDto.getOrganizationName();
        String address = organizationSaveRequestDto.getAddress();

        Organization organization = new Organization();
        organization.setOrganizationName(organizationName);
        organization.setAddress(address);
        organization.setId(getId());

        List<Organization> organizationList = OrganizationConfig.organizationList;
        organizationList.add(organization);
        return true;
    }

    private static int getId() {
        Random random = new Random();
        int id = random.nextInt(1000);
        return id;
    }

    public Boolean updateOrganization(OrganizationUpdateRequestDto organizationUpdateRequestDto) {
        int id = organizationUpdateRequestDto.getId();
        List<Organization> organizationList = OrganizationConfig.organizationList;
        for (Organization organization : organizationList) {
            if (organization.getId() == id) {
                organization.setOrganizationName(organizationUpdateRequestDto.getOrganizationName());
                organization.setAddress(organizationUpdateRequestDto.getAddress());
            }
        }
        return true;
    }

    public boolean deleteOrganization(int organizationId) {
        List<Organization> organizationList = OrganizationConfig.organizationList;
        for (Organization organization : organizationList) {
            if (organization.getId() == organizationId) {
                organizationList.remove(organization);
                return true;
            }
        }
        return false;
    }

    public boolean updateOrganizationName(int id, String organizationName) {
        List<Organization> organizationList = OrganizationConfig.organizationList;
        for (Organization organization : organizationList) {
            if (organization.getId() == id) {
                organization.setOrganizationName(organizationName);
            }
        }
        return true;
    }
}
