package at.lestoph.wuwald;

/**
 * Created by Howl on 12/17/2015.
 */
import at.lestoph.wuwald.binder.DependencyBinder;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class JerseyApplication extends ResourceConfig {
    public JerseyApplication() {
        register(JacksonFeature.class);
        register(new DependencyBinder());
    }
}
