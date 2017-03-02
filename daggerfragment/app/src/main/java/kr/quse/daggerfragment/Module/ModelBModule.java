package kr.quse.daggerfragment.Module;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import kr.quse.daggerfragment.Model.IModel;
import kr.quse.daggerfragment.Model.ModelB;
import kr.quse.daggerfragment.Scope.ActivityScope;

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
