package com.springEdu.techcareer.week3.Sunday.SpringBean;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements CommandLineRunner {

    // Constructor Injection
    private final EngineerService engineerService;
    private final ManagerService managerService;

    public SpringBean(EngineerService engineerService, ManagerService managerService) {
        this.engineerService = engineerService;
        this.managerService = managerService;
    }






    @Override
    public void run(String... args) throws Exception {
        engineerService.employeeValue();
        managerService.employeeValue();

    }
}
