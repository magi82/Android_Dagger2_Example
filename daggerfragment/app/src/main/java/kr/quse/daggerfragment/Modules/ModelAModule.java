package kr.quse.daggerfragment.Modules;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import kr.quse.daggerfragment.Models.IModel;
import kr.quse.daggerfragment.Models.ModelA;

/**
 * Created by magi on 2017. 2. 28..
 */

@Module
public class ModelAModule {

    @Provides
    @Singleton
    @Named("ModelA")
    public IModel provideModelA() {
        return new ModelA();
    }
}
