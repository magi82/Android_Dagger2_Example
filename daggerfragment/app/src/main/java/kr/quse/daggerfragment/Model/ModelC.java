package kr.quse.daggerfragment.Model;

/**
 * Created by magi on 2017. 2. 28..
 */

public class ModelC implements IModel {
    public String mName = "ModelC";

    @Override
    public void setName(String strName) {
        this.mName = strName;
    }

    @Override
    public String getName() {
        return this.mName;
    }
}
