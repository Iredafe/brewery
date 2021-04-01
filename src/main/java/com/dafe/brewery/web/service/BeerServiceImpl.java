package com.dafe.brewery.web.service;

import com.dafe.brewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getbeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID()).beerName("Gulder")
                .beerStyle("Lager Beer").build();
    }
    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public Object updateBeer(UUID beerId, BeerDto beerDto) {
        //todo add impl
    }
}
