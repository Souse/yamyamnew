package at.lestoph.wuwald;

import at.lestoph.wuwald.entity.RecipeEntity;
import at.lestoph.wuwald.pojo.Recipe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Howl on 12/18/2015.
 */
public class RecipeAdapter {

    public List<Recipe> adapt(List<RecipeEntity> list) {
        ArrayList<Recipe> resList = new ArrayList<Recipe>();
        for (RecipeEntity recipeEntity : list) {
            Recipe recipe = new Recipe();
            recipe.setIngredients(recipeEntity.getIngredients());
            recipe.setInstructions(recipeEntity.getInstructions());
            resList.add(recipe);
        }
        return resList;
    }


}