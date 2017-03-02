package kr.quse.daggerfragment.Components;

import dagger.Subcomponent;
import kr.quse.daggerfragment.MainActivityFragment;
import kr.quse.daggerfragment.Modules.ModelCModule;
import kr.quse.daggerfragment.Scopes.FragmentScope;

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
