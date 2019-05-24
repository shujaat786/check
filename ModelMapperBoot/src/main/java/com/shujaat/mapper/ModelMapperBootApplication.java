package com.shujaat.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.shujaat.mapper.facade.OrderFacade;

@SpringBootApplication
public class ModelMapperBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModelMapperBootApplication.class, args);
	}
	
	@Bean
    public ModelMapper modelMapper(){
        return  new ModelMapper();
    }

    @Bean
    public OrderFacade orderFacade(){
        return  new OrderFacade();
    }

}
