package kr.quse.daggerfragment.Components;

import dagger.Subcomponent;
import kr.quse.daggerfragment.MainActivity;
import kr.quse.daggerfragment.Modules.ModelBModule;
import kr.quse.daggerfragment.Modules.ModelCModule;
import kr.quse.daggerfragment.Scopes.ActivityScope;

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
