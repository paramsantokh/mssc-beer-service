package guru.springframework.msscbeerservice.web.controller;

import guru.springframework.msscbeerservice.MsscBeerServiceApplication;
import guru.springframework.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.net.URI;
import java.util.UUID;

/**
 * @author param singh
 */
@RequestMapping ("/api/v1/beer")
@RestController
public class BeerController {
  
  private BeerService beerService;
  
  @GetMapping ("/{beerId}")
  public ResponseEntity<BeerDto> getBeerById(@PathVariable ("beerId") UUID beerId) {
  
    return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    //return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
  }
  
  @PostMapping
  public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto) {
    //todo impl
    //BeerDto savedBeer = beerService.saveBeer(beerDto);
    HttpHeaders headers = new HttpHeaders();
    headers.add("Location", "/api/v1/beer/" + UUID.randomUUID());
    return new ResponseEntity(headers, HttpStatus.CREATED);
  }
  
  @PutMapping ("/{beerId}")
  public ResponseEntity updateBeerById(@PathVariable ("beerId") UUID beerId, @RequestBody BeerDto beerDto) {
    //todo impl
    //beerService.updateBeer(beerId, beerDto);
    return new ResponseEntity(HttpStatus.NO_CONTENT);
  }
}
