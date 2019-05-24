package com.shujaat.mapper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shujaat.mapper.dto.OrderDto;
import com.shujaat.mapper.facade.OrderFacade;

@RestController
public class OrderController {

    @Autowired
    private OrderFacade orderFacade;

    @GetMapping(value = "/orders/{id}")
    public @ResponseBody ResponseEntity<OrderDto> getOrder(@PathVariable("id") String id){
        OrderDto order = orderFacade.getOrderById(id);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }
}