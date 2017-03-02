package kr.quse.daggerfragment.Module;

import javax.inject.Named;

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
    @Named("ModelC")
    public IModel provideModelC() {
        return new ModelC();
    }
}
