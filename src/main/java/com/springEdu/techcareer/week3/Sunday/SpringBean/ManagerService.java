package com.springEdu.techcareer.week3.Sunday.SpringBean;

import org.springframework.stereotype.Service;

@Service
public class ManagerService {

    // Constructor Injection
    private final EmployeeService employeeService;

    public ManagerService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void employeeValue(){
//        System.out.println(this.employeeService);
    }
}
