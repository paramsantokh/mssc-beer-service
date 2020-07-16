package guru.springframework.msscbeerservice.bootstrap;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author param singh
 */

/**
 * Load data at startup
 */
@Component
public class BeerLoader implements CommandLineRunner {
  
  private final BeerRepository beerRepository;
  
  public BeerLoader(BeerRepository beerRepository) {
    this.beerRepository = beerRepository;
  }
  
  @Override
  public void run(String... args) throws Exception {
    loadBeerObjects();
  }
  
  private void loadBeerObjects() {
    //if beerRepository is empty
    if (beerRepository.count() == 0) {
      beerRepository.save(Beer.builder()
                              .beerName("Mango Bobs")
                              .beerStyle("IPA")
                              .quantityToBrew(200)
                              .minOnHand(10)
                              .upc(3300000001L)
                              .price(new BigDecimal("120.95"))
                              .build());
      
      beerRepository.save(Beer.builder()
                              .beerName("Beera")
                              .beerStyle("PALE_ALE")
                              .quantityToBrew(200)
                              .minOnHand(20)
                              .upc(3300000002L)
                              .price(new BigDecimal("110.95"))
                              .build());
    }
    System.out.println("Loaded Beers:" + beerRepository.count());
  }
}
