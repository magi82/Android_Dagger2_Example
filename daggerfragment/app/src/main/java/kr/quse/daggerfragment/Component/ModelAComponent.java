package kr.quse.daggerfragment.Component;

import javax.inject.Singleton;

import dagger.Component;
import kr.quse.daggerfragment.Module.ModelAModule;
import kr.quse.daggerfragment.Module.ModelBModule;
import kr.quse.daggerfragment.MyApp;

/**
 * Created by magi on 2017. 2. 28..
 */

@Singleton
@Component(
        modules = ModelAModule.class
)
public interface ModelAComponent {

    void inject(MyApp application);

    ModelBComponent plus(ModelBModule module);
}
