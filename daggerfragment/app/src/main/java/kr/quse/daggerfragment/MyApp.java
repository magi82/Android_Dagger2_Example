package kr.quse.daggerfragment;

import android.app.Application;
import android.util.Log;

import javax.inject.Inject;

import kr.quse.daggerfragment.Component.DaggerModelAComponent;
import kr.quse.daggerfragment.Component.ModelAComponent;
import kr.quse.daggerfragment.Model.IModel;
import kr.quse.daggerfragment.Model.ModelA;
import kr.quse.daggerfragment.Module.ModelAModule;

/**
 * Created by magi on 2017. 2. 28..
 */

public class MyApp extends Application {

    private ModelAComponent mModelAComponent;

    @Inject
    ModelA mModelA;

    @Override
    public void onCreate() {
        super.onCreate();

        mModelAComponent = DaggerModelAComponent.builder()
                .modelAModule(new ModelAModule())
                .build();

        mModelAComponent.inject(this);

        // Scope Test
        mModelA.setName("ModelA Scope Test");
        Log.d("Dagger2", mModelA.getName());
    }

    public ModelAComponent getModelAComponent() {
        return this.mModelAComponent;
    }
}
