package kr.quse.daggerfragment;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import javax.inject.Inject;
import javax.inject.Named;

import kr.quse.daggerfragment.Components.ModelBComponent;
import kr.quse.daggerfragment.Models.IModel;
import kr.quse.daggerfragment.Modules.ModelBModule;

public class MainActivity extends AppCompatActivity {

    private ModelBComponent mModelBComponent;

    @Inject
    @Named("ModelA")
    IModel mModelA;

    @Inject
    @Named("ModelB")
    IModel mModelB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mModelBComponent = ((MyApp) getApplication()).getModelAComponent()
                .plus(new ModelBModule());

        mModelBComponent.inject(this);

        // Scope Test
        mModelB.setName("ModelB Scope Test");
        Log.d("Dagger2", mModelA.getName());
        Log.d("Dagger2", mModelB.getName());
    }

    public ModelBComponent getModelBComponent() {
        return this.mModelBComponent;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
