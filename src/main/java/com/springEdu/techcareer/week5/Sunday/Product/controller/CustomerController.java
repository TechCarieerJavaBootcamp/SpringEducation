package com.springEdu.techcareer.week5.Sunday.Product.controller;

import com.springEdu.techcareer.week5.Sunday.Product.dto.requestDto.CustomerSaveRequestDto;
import com.springEdu.techcareer.week5.Sunday.Product.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/saveCustomer")
    public ResponseEntity<Boolean> saveCustomer(@RequestBody CustomerSaveRequestDto customerSaveRequestDto) {
        boolean isSaveCustomer = customerService.saveCustomer(customerSaveRequestDto);
        return new ResponseEntity<>(isSaveCustomer, HttpStatus.OK);
    }

}
