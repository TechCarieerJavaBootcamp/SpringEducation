package com.springEdu.techcareer.week3.Sunday.ConfigurationAnotation;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigurationAnotation {

    public static List<Organization> organizations = new ArrayList<>();

   @PostConstruct
    public void fillOrganizations(){
        Organization organization = new Organization();
        organization.setOrganizationName("Düğün");
        organization.setAddress("aa Cad. aa Sok.");

    }

}
