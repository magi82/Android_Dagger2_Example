package kr.quse.daggerfragment;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;
import javax.inject.Named;

import kr.quse.daggerfragment.Model.IModel;
import kr.quse.daggerfragment.Model.ModelA;
import kr.quse.daggerfragment.Model.ModelB;
import kr.quse.daggerfragment.Model.ModelC;
import kr.quse.daggerfragment.Module.ModelBModule;
import kr.quse.daggerfragment.Module.ModelCModule;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    @Inject
    @Named("ModelA")
    IModel mModelA;

    @Inject
    @Named("ModelB")
    IModel mModelB;

    @Inject
    @Named("ModelC")
    IModel mModelC;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ((MainActivity) getActivity()).getModelBComponent()
                .plus(new ModelCModule())
                .inject(this);

        // Scope Test
        mModelC.setName("ModelC Scope Test");
        Log.d("Dagger2", mModelA.getName());
        Log.d("Dagger2", mModelB.getName());
        Log.d("Dagger2", mModelC.getName());
    }
}
