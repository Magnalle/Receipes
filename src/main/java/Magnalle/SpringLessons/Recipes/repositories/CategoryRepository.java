package Magnalle.SpringLessons.Recipes.repositories;

import Magnalle.SpringLessons.Recipes.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
