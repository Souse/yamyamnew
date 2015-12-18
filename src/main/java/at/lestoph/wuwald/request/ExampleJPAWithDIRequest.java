package at.lestoph.wuwald.request;

/**
 * Created by Howl on 12/18/2015.
 */

    import at.lestoph.wuwald.RecipeAdapter;
    import at.lestoph.wuwald.entity.RecipeEntity;
    import at.lestoph.wuwald.model.AddListModel;
    import at.lestoph.wuwald.pojo.Recipe;

    import java.util.List;

    import javax.inject.Inject;
    import javax.ws.rs.GET;
    import javax.ws.rs.Path;
    import javax.ws.rs.PathParam;
    import javax.ws.rs.Produces;
    import javax.ws.rs.core.MediaType;

    @Path("ingredients_jpa_di")
    public class ExampleJPAWithDIRequest {

        @Inject
        AddListModel mModel;
        @Inject
        RecipeAdapter mAdapter;

        @Path("{ingredients}/{instructions}")
        @GET
        @Produces(MediaType.APPLICATION_JSON)
        public List<Recipe> ingredients(@PathParam("ingredients") String ingredients, @PathParam("instructions") String instructions) {
            List<RecipeEntity> list = mModel.addAndList(ingredients,instructions);
            List<Recipe> resList = mAdapter.adapt(list);
            return resList;
        }
    }

