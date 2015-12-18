package at.lestoph.wuwald;

import at.lestoph.wuwald.pojo.Recipe;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;


// The Java class will be hosted at the URI path "/helloworld"
@Path("/helloworld")
public class HelloWorld {
    // The Java method will process HTTP GET requests

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Recipe> example() {
        ArrayList<Recipe> resList = new ArrayList<>();
        Recipe exampleItem = new Recipe();
        exampleItem.setIngredients("Some stuff");
        resList.add(exampleItem);
        Recipe exampleItem1 = new Recipe();
        exampleItem1.setIngredients("Some more stuff");
        resList.add(exampleItem1);
        return resList;
    }
}
