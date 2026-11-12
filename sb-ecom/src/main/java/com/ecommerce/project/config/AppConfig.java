package com.ecommerce.project.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
    //Band
public class AppConfig {

    @Beans
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
