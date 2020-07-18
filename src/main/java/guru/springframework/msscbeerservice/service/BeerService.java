package guru.springframework.msscbeerservice.service;

import guru.springframework.msscbeerservice.web.model.BeerDto;

import java.util.UUID;

/**
 * @author param singh
 */
public interface BeerService {
  
  BeerDto getBeerById(UUID beerId);
  
  BeerDto saveBeer(BeerDto beerDto);
  
  void updateBeer(UUID beerId, BeerDto beerDto);
}
