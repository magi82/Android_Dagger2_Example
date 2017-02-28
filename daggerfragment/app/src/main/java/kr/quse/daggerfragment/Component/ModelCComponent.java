package kr.quse.daggerfragment.Component;

import dagger.Subcomponent;
import kr.quse.daggerfragment.MainActivityFragment;
import kr.quse.daggerfragment.Module.ModelCModule;
import kr.quse.daggerfragment.Scope.FragmentScope;

/**
 * Created by magi on 2017. 2. 28..
 */

@FragmentScope
@Subcomponent(
        modules = ModelCModule.class
)
public interface ModelCComponent {

    void inject(MainActivityFragment fragment);
}
