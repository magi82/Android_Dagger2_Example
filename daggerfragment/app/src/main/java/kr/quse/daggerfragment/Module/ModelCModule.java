package kr.quse.daggerfragment.Module;

import dagger.Module;
import dagger.Provides;
import kr.quse.daggerfragment.Model.IModel;
import kr.quse.daggerfragment.Model.ModelC;
import kr.quse.daggerfragment.Scope.FragmentScope;

/**
 * Created by magi on 2017. 2. 28..
 */

@Module
public class ModelCModule {

    @Provides
    @FragmentScope
    public ModelC provideModelC() {
        return new ModelC();
    }
}
