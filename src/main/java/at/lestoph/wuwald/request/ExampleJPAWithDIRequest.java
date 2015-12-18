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

    @Path("example_jpa_di")
    public class ExampleJPAWithDIRequest {

        @Inject
        AddListModel mModel;
        @Inject
        RecipeAdapter mAdapter;

        @Path("{example}/{example2}")
        @GET
        @Produces(MediaType.APPLICATION_JSON)
        public List<Recipe> example(@PathParam("example") String example, @PathParam("example2") String example2) {
            List<RecipeEntity> list = mModel.addAndList(example,example2);
            List<Recipe> resList = mAdapter.adapt(list);
            return resList;
        }
    }

