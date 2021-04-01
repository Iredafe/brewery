package com.dafe.brewery.web.service;

import com.dafe.brewery.web.model.BeerDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public interface BeerService {
     BeerDto getbeerById(UUID beerId);

     BeerDto saveNewBeer(BeerDto beerDto);

     Object updateBeer(UUID beerId, BeerDto beerDto);
}
