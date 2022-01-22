package fatihhernn.springframework.spring5recipeapp.services;

import fatihhernn.springframework.spring5recipeapp.domain.Recipe;
import fatihhernn.springframework.spring5recipeapp.repository.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @Before
    public void setUp(){

        MockitoAnnotations.openMocks(this);

        recipeService=new RecipeServiceImpl(recipeRepository);

    }


    @Test
    public void getRecipes() {

        Recipe recipe=new Recipe();

        HashSet recipesData=new HashSet();

        recipesData.add(recipe);

        when(recipeService.getRecipes()).thenReturn(recipesData);

        Set<Recipe> recipeSet = recipeService.getRecipes();

        assertEquals(recipeSet.size(),1);

        verify(recipeRepository,times(1)).findAll();
    }
}