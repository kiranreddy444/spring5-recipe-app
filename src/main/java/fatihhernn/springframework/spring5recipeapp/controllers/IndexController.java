package fatihhernn.springframework.spring5recipeapp.controllers;

import fatihhernn.springframework.spring5recipeapp.domain.Category;
import fatihhernn.springframework.spring5recipeapp.domain.UnitOfMeasure;
import fatihhernn.springframework.spring5recipeapp.repository.CategoryRepository;
import fatihhernn.springframework.spring5recipeapp.repository.UnitOfMeasureRepository;
import fatihhernn.springframework.spring5recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.PushBuilder;
import java.security.PublicKey;
import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping
    public String getIndexPage(Model model){
        model.addAttribute("recipes",recipeService.getRecipes());
        return "index";
    }

    /*
    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getPageIndex(){

        Optional<Category> categoryOptional=categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional=unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Category id is : "+categoryOptional.get().getId());
        System.out.println("Unit of measure id is : "+unitOfMeasureOptional.get().getId());

        return "index";
    }

     */
}
