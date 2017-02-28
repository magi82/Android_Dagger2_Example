package kr.quse.daggerfragment.Module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import kr.quse.daggerfragment.Model.IModel;
import kr.quse.daggerfragment.Model.ModelA;

/**
 * Created by magi on 2017. 2. 28..
 */

@Module
public class ModelAModule {

    @Provides
    @Singleton
    public ModelA provideModelA() {
        return new ModelA();
    }
}
