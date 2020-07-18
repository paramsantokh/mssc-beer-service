package guru.springframework.msscbeerservice.service;

import guru.springframework.msscbeerservice.repositories.BeerRepository;
import guru.springframework.msscbeerservice.web.model.BeerDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

/**
 * @author param singh
 */
public class BeerServiceImpl implements BeerService {
  
  @Autowired
  BeerRepository beerRepository;
  
  @Override
  public BeerDto getBeerById(UUID beerId) {
    return null;
  }
  
  @Override
  public BeerDto saveBeer(BeerDto beerDto) {
    return null;
  }
  
  @Override
  public void updateBeer(UUID beerId, BeerDto beerDto) {
  
  }
}
