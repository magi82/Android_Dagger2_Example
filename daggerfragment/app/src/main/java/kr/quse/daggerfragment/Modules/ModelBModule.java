package kr.quse.daggerfragment.Modules;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import kr.quse.daggerfragment.Models.IModel;
import kr.quse.daggerfragment.Models.ModelB;
import kr.quse.daggerfragment.Scopes.ActivityScope;

/**
 * Created by magi on 2017. 2. 28..
 */

@Module
public class ModelBModule {

    @Provides
    @ActivityScope
    @Named("ModelB")
    public IModel provideModelB() {
        return new ModelB();
    }
}
