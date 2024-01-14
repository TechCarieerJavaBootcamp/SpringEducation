package com.springEdu.techcareer.week5.Sunday.Product.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("gConfig")
public class GeneralConfig {

    @Bean("mMapper")
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
