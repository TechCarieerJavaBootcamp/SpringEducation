package com.springEdu.techcareer.week3.Sunday;

import org.springframework.stereotype.Component;

@Component
public class StudentService {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
