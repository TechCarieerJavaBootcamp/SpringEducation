package com.springEdu.techcareer.week3.Sunday.SpringBean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class EngineerService {

    // Constructor Injection
    private final EmployeeService employeeService;

    public EngineerService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    public void employeeValue(){
        System.out.println(this.employeeService);
    }

}
