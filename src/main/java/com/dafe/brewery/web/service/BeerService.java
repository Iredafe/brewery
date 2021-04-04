package com.dafe.brewery.web.service;

import com.dafe.brewery.web.model.BeerDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public interface BeerService {
     BeerDto getBeerById(UUID beerId);

     BeerDto saveNewBeer(BeerDto beerDto);

     void updateBeer(UUID beerId, BeerDto beerDto);

     void deleteBeerById(UUID beerId);
}
