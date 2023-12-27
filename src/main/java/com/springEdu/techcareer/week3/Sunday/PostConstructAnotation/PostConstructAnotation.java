package com.springEdu.techcareer.week3.Sunday.PostConstructAnotation;

import jakarta.annotation.PostConstruct;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PostConstructAnotation {

    public static List<String> cityList = new ArrayList<>();

    @PostConstruct
    @Order(1)
    public void test(){
        System.out.println("İlk çağırılan metot.");
    }

    @PostConstruct
    @Order(2)
    public void setCityList(){
        cityList.add("Samsun");
        cityList.add("Ankara");
    }


}
