package fatihhernn.springframework.spring5recipeapp.repository;

import fatihhernn.springframework.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {

}
