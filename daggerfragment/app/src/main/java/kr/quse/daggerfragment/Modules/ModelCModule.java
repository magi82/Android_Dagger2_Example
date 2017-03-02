package kr.quse.daggerfragment.Modules;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import kr.quse.daggerfragment.Models.IModel;
import kr.quse.daggerfragment.Models.ModelC;
import kr.quse.daggerfragment.Scopes.FragmentScope;

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
