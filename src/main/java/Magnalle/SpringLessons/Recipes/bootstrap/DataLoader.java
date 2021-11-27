package Magnalle.SpringLessons.Recipes.bootstrap;

import Magnalle.SpringLessons.Recipes.domain.Difficulty;
import Magnalle.SpringLessons.Recipes.domain.Ingredient;
import Magnalle.SpringLessons.Recipes.domain.Notes;
import Magnalle.SpringLessons.Recipes.domain.Recipe;
import Magnalle.SpringLessons.Recipes.repositories.CategoryRepository;
import Magnalle.SpringLessons.Recipes.repositories.RecipeRepository;
import Magnalle.SpringLessons.Recipes.repositories.UnitOfMeasureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;

@Controller
public class DataLoader implements CommandLineRunner {
    private RecipeRepository recipeRepository;
    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public DataLoader(RecipeRepository recipeRepository, CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.recipeRepository = recipeRepository;
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Recipe recipe = new Recipe();
        recipe.setDirections("\n" +
                "Grind the oats:\n" +
                "\n" +
                "Set aside 1/2 cup of the oats to add to the batter later. In a food processor, grind the remaining 2 1/2 cups oats until the mixture resembles coarse whole-wheat flour, with a few particles of oats.\n" +
                "Grinding oats in a food processor to make oat meal pancakes\n" +
                "Make the batter:\n" +
                "\n" +
                "Add the baking powder, baking soda, cinnamon, salt, eggs, 1 1/2 cups of the buttermilk, oil or melted butter, honey, and vanilla to the food processor bowl and pulse a few times, until blended.\n" +
                "\n" +
                "Pour the batter into a bowl and stir in the remaining 1/2 cup oats. Let stand for 5 to 10 minutes. The mixture will not be not completely smooth, and it will thicken as it sits. If the batter becomes too thick at any point feel free to thin with some of the remaining buttermilk.\n" +
                "A spoon is lifting some gluten-free pancake batter out of a white mixing bowl.\n" +
                "Heat a skillet or griddle:\n" +
                "\n" +
                "Pour a few drops of oil into the skillet or griddle and spread with a paper towel. Set the pan over medium heat. The pan is hot enough when you drop a few drops of water on it and they sizzle. Turn the heat to medium-low.\n" +
                "Cook the pancakes:\n" +
                "\n" +
                "Ladle about 1/3 cup of batter for each pancake onto the skillet. With the back of the ladle, spread the batter into 4-inch circles. Cook for 2 to 3 minutes, or until bubbles form on top and the bottoms look brown when you peek under the pancakes with a spatula. Turn them and cook for another 2 minutes, or until browned. Repeat until all the batter is used.\n" +
                "Homemade healthy and gluten free pancakes frying on a skillet. They need to be flipped because bubbles are forming.\n" +
                "Serve the pancakes:\n" +
                "\n" +
                "Serve them hot off the griddle or keep them warm in a 325oF oven on a wire rack set over a baking sheet. Serve with lots of butter, fresh fruit (if you wish), and maple syrup. ");
        Notes notes = new Notes(" Tips for Cooking the Perfect Pancake\n" +
                "\n" +
                "    Pick the correct pan: A griddle is my first choice for making pancakes because it’s a wide shallow pan without the tall sides of a skillet. Shorter sides make it easier to flip the pancakes. If you don’t have a griddle, a well-seasoned cast-iron skillet is also a good choice even though the pancakes may be a bit harder to flip because of the higher sides. Both distribute the heat evenly and are essentially non-stick. Failing those two options, use a non-stick skillet.\n" +
                "    Lightly oil the griddle/pan: Whether using a skillet or griddle, a thin slick of oil or a pat of butter is all you need. Drizzle a few drops of oil (or a pat of butter) in the pan and spread it around. Repeat between each new round of batter. I prefer oil to butter, but really either will work.\n" +
                "    Cook on medium-low temperature: Low and slow is the way to go. Once the pan is hot, turn the heat to medium-low. The pancakes cook slowly, giving the outsides time to brown and the insides time to cook. A hot griddle may burn the pancakes too quickly on the outside, leaving the inside raw.\n" +
                "    Know when to flip: Once bubbles form on the surface of the batter and the edges start to look a little dry, it’s time to flip. Slide a wide spatula under the pancake (try not to move it) and peek to make sure it is brown. Then slide the spatula all the way under the pancake and flip it. The first side takes longer to cook than the second.\n");
        recipe.setNotes(notes);
        recipe.setDescription("Oatmeal Buttermilk Pancakes");
        recipe.setCookTime(15);
        recipe.setPrepTime(10);
        recipe.setServings(12);
        recipe.setDifficulty(Difficulty.EASY);
        recipe.getCategories().add(categoryRepository.findByDescription("Breakfast").get());

        Ingredient ingredient = new Ingredient();
        ingredient.setDescription("old-fashioned rolled oats");
        ingredient.setAmount(new BigDecimal("3"));
        ingredient.setUnitOfMeasure(unitOfMeasureRepository.findByDescription("Cup").get());
        recipe.addIngredient(ingredient);

        ingredient = new Ingredient();
        ingredient.setDescription("baking powder");
        ingredient.setAmount(new BigDecimal("0.5"));
        ingredient.setUnitOfMeasure(unitOfMeasureRepository.findByDescription("Teaspoon").get());
        recipe.addIngredient(ingredient);

        ingredient = new Ingredient();
        ingredient.setDescription("baking soda");
        ingredient.setAmount(new BigDecimal("0.5"));
        ingredient.setUnitOfMeasure(unitOfMeasureRepository.findByDescription("Teaspoon").get());
        recipe.addIngredient(ingredient);

        ingredient = new Ingredient();
        ingredient.setDescription("ground cinnamon (optional)");
        ingredient.setAmount(new BigDecimal("0.5"));
        ingredient.setUnitOfMeasure(unitOfMeasureRepository.findByDescription("Teaspoon").get());
        recipe.addIngredient(ingredient);

        ingredient = new Ingredient();
        ingredient.setDescription("salt");
        ingredient.setAmount(new BigDecimal("0.25"));
        ingredient.setUnitOfMeasure(unitOfMeasureRepository.findByDescription("Teaspoon").get());
        recipe.addIngredient(ingredient);

        ingredient = new Ingredient();
        ingredient.setDescription("large eggs");
        ingredient.setAmount(new BigDecimal("2"));
        recipe.addIngredient(ingredient);

        ingredient = new Ingredient();
        ingredient.setDescription("buttermilk");
        ingredient.setAmount(new BigDecimal("2"));
        ingredient.setUnitOfMeasure(unitOfMeasureRepository.findByDescription("Cup").get());
        recipe.addIngredient(ingredient);

        ingredient = new Ingredient();
        ingredient.setDescription("vegetable oil or melted butter");
        ingredient.setAmount(new BigDecimal("2"));
        ingredient.setUnitOfMeasure(unitOfMeasureRepository.findByDescription("Tablespoon").get());
        recipe.addIngredient(ingredient);

        ingredient = new Ingredient();
        ingredient.setDescription("honey");
        ingredient.setAmount(new BigDecimal("2"));
        ingredient.setUnitOfMeasure(unitOfMeasureRepository.findByDescription("Tablespoon").get());
        recipe.addIngredient(ingredient);

        ingredient = new Ingredient();
        ingredient.setDescription("vanilla extract");
        ingredient.setAmount(new BigDecimal("2"));
        ingredient.setUnitOfMeasure(unitOfMeasureRepository.findByDescription("Teaspoon").get());
        recipe.addIngredient(ingredient);

        ingredient = new Ingredient();
        ingredient.setDescription("Vegetable oil (for the skillet)");
        recipe.addIngredient(ingredient);

        recipeRepository.save(recipe);

    }
}
