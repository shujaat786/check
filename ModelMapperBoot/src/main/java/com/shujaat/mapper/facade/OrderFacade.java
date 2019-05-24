package com.shujaat.mapper.facade;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.shujaat.mapper.data.Order;
import com.shujaat.mapper.dto.OrderDto;
import com.shujaat.mapper.service.OrderService;
import com.shujaat.mapper.service.UserService;


public class OrderFacade {

    @Lazy
    @Autowired
    private OrderService orderService;

    @Qualifier("userServiceImpl")
    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    public OrderDto getOrderById(String id){
        userService.enableUser();
        return convertToOrderDto(orderService.getOrderById(id));
    }

    private OrderDto convertToOrderDto(Order order) {
        OrderDto orderDto = modelMapper.map(order, OrderDto.class);
        return orderDto;
    }

}