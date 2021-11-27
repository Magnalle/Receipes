package Magnalle.SpringLessons.Recipes.Services;

import Magnalle.SpringLessons.Recipes.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
