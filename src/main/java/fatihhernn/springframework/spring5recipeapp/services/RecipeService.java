package fatihhernn.springframework.spring5recipeapp.services;

import fatihhernn.springframework.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
