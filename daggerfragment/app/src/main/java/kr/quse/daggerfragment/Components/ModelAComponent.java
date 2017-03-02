package kr.quse.daggerfragment.Components;

import javax.inject.Singleton;

import dagger.Component;
import kr.quse.daggerfragment.Modules.ModelAModule;
import kr.quse.daggerfragment.Modules.ModelBModule;
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
