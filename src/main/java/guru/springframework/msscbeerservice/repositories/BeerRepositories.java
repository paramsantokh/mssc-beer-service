package guru.springframework.msscbeerservice.repositories;

import guru.springframework.msscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * @author param singh
 */
public interface BeerRepositories extends PagingAndSortingRepository<Beer, UUID> {
  
}
