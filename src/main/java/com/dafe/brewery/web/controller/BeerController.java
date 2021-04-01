package com.dafe.brewery.web.controller;

import com.dafe.brewery.web.model.BeerDto;
import com.dafe.brewery.web.service.BeerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private  final BeerService beerService;
    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable UUID beerId){

        return new ResponseEntity<>(beerService.getbeerById(beerId), HttpStatus.OK);
    }
    @PostMapping("{/handle}")
    public ResponseEntity<BeerDto> handlePost(@RequestBody BeerDto beerDto){
        BeerDto savedDto = beerService.saveNewBeer(beerDto);

        HttpHeaders headers = new HttpHeaders();
        //todo add hostname to url
        headers.add("LOCATION", "http://localhost:8080/api/v1/beer"+ savedDto.getId().toString());

        return  new ResponseEntity(headers, HttpStatus.OK);
    }
    @PutMapping("/{beerId}")
    public ResponseEntity<BeerDto> updateBeer(@PathVariable UUID beerId, BeerDto beerDto){

        beerService.updateBeer(beerId, beerDto);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
