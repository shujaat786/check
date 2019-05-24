package com.shujaat.mapper.service;

import org.springframework.stereotype.Service;

import com.shujaat.mapper.data.Address;
import com.shujaat.mapper.data.CustomerModel;
import com.shujaat.mapper.data.Order;

@Service("orderService")
public class OrderService {

    public Order getOrderById(String id){

        Order order = new Order();
        order.setOrderNumber("1234");
        order.setOrderAmount(200.34);
        order.setTax(10.12);

        //customer
        CustomerModel customer= new CustomerModel();
        customer.setUserId("umeshawasthi@javadevjournal.com");
        customer.setFirstName("Umesh");
        customer.setLastName("Awasthi");
        customer.setEmail("umeshawasthi@javadevjournal.com");
        order.setCustomer(customer);

        Address shippingAddress = new Address();
        shippingAddress.setAddressLine1("Adress line 1");
        shippingAddress.setStreet("street 1");
        shippingAddress.setCity("San Jose");
        shippingAddress.setPostalCode("95111");

        order.setShippingAddress(shippingAddress);

        return order;
    }
}