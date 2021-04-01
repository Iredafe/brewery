package com.dafe.brewery.web.controller;

import com.dafe.brewery.web.model.CustomerDto;
import com.dafe.brewery.web.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;
    public CustomerController(CustomerService customerService) {this.customerService = customerService;}

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable UUID customerId){

        return new ResponseEntity<> (customerService.getCustomerById(customerId), HttpStatus.OK);
    }
}
