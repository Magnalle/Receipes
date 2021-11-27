package Magnalle.SpringLessons.Recipes.repositories;

import Magnalle.SpringLessons.Recipes.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
