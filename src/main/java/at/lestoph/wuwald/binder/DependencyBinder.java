package at.lestoph.wuwald.binder;

/**
 * Created by Howl on 12/18/2015.
 */
import at.lestoph.wuwald.RecipeAdapter;
import at.lestoph.wuwald.model.AddListModel;
import at.lestoph.wuwald.model.impl.AddListModelImpl;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

public class DependencyBinder extends AbstractBinder {

    @Override
    protected void configure() {
        bind(AddListModelImpl.class).to(AddListModel.class);
        bind(RecipeAdapter.class).to(RecipeAdapter.class);
    }

}