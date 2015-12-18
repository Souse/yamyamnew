package at.lestoph.wuwald.entity;

/**
 * Created by Howl on 12/18/2015.
 */
public class RecipeEntity {
    private long id;
    private String ingredients;
    private String instructions;

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}
