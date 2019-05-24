package com.shujaat.mapper;
import com.shujaat.mapper.data.Address;
import com.shujaat.mapper.data.CustomerModel;
import com.shujaat.mapper.data.Order;
import com.shujaat.mapper.dto.OrderDto;
import org.junit.Test;
import org.modelmapper.ModelMapper;

import static org.junit.Assert.assertEquals;

public class OrderDataConversionUnitTest {

	   private ModelMapper mapper = new ModelMapper();

    @Test
    public void convert_Order_To_OrderDto(){

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

        OrderDto orderDTO = mapper.map(order, OrderDto.class);

        assertEquals(order.getCustomer().getFirstName(), orderDTO.getCustomer().getFirstName());
        assertEquals(order.getCustomer().getLastName(), orderDTO.getCustomer().getLastName());
        assertEquals(order.getOrderNumber(), orderDTO.getOrderNumber());
        
        
        
        
    }
}