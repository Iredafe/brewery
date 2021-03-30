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
}
