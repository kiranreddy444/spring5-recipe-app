package fatihhernn.springframework.spring5recipeapp.repository;

import fatihhernn.springframework.spring5recipeapp.domain.Category;
import fatihhernn.springframework.spring5recipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {

    Optional<UnitOfMeasure> findByDescription(String description);

}
