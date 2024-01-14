package com.springEdu.techcareer.week5.Sunday.Product.service;

import com.springEdu.techcareer.week5.Sunday.Product.dto.requestDto.CustomerSaveRequestDto;
import com.springEdu.techcareer.week5.Sunday.Product.entity.Customer;
import com.springEdu.techcareer.week5.Sunday.Product.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final ModelMapper modelMapper;


    public Boolean saveCustomer(CustomerSaveRequestDto customerSaveRequestDto) {

        Customer customer = modelMapper.map(customerSaveRequestDto, Customer.class);
        customerRepository.save(customer);

        return true;

    }
}
