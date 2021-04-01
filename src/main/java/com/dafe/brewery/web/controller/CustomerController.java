package com.dafe.brewery.web.controller;

import com.dafe.brewery.web.model.BeerDto;
import com.dafe.brewery.web.model.CustomerDto;
import com.dafe.brewery.web.service.CustomerService;
import org.springframework.http.HttpHeaders;
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

    @PostMapping("{/handle}")
    public ResponseEntity<CustomerDto> handleCustomerPost(@RequestBody CustomerDto customerDto){
        CustomerDto savedDto = customerService.saveNewCustomer(customerDto);

        HttpHeaders headers = new HttpHeaders();
        //todo add hostname to url
        headers.add("LOCATION", "http://localhost:8080/api/v1/beer"+ savedDto.getId().toString());

        return  new ResponseEntity(headers, HttpStatus.OK);
    }
    @PutMapping("/{beerId}")
    public ResponseEntity<CustomerDto> updateCustomer(@PathVariable UUID customerId, @RequestBody CustomerDto customerDto){

        customerService.updateCustomer(customerId, customerDto);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<CustomerDto> deleteCustomer(@PathVariable UUID customerId){

        customerService.deleteCustomerById(customerId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
