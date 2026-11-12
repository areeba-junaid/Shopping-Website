package com.ecommerce.project.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
    //Beand
public class AppConfig {

    @Beans
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
