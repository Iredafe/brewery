package com.dafe.brewery.web.service;

import com.dafe.brewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID id);

}
