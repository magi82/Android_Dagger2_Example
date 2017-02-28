package kr.quse.daggerfragment.Component;

import dagger.Subcomponent;
import kr.quse.daggerfragment.MainActivity;
import kr.quse.daggerfragment.Module.ModelBModule;
import kr.quse.daggerfragment.Module.ModelCModule;
import kr.quse.daggerfragment.Scope.ActivityScope;

/**
 * Created by magi on 2017. 2. 28..
 */

@ActivityScope
@Subcomponent(
        modules = ModelBModule.class
)
public interface ModelBComponent {

    void inject(MainActivity activity);

    ModelCComponent plus(ModelCModule module);
}
