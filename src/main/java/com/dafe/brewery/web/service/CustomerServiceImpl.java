package com.dafe.brewery.web.service;

import com.dafe.brewery.web.model.BeerDto;
import com.dafe.brewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder().id(UUID.randomUUID()).customerName("Micheal").build();
    }
    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //todo add impl
    }

    @Override
    public void deleteCustomerById(UUID customerId) {

    }

}
