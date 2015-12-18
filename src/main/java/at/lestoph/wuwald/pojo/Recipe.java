package at.lestoph.wuwald.pojo;

/**
 * Created by Howl on 12/17/2015.
 */
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Recipe {

    private String ingredients;
    private String instructions;

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}