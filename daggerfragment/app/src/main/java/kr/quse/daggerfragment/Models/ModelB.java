package kr.quse.daggerfragment.Models;

/**
 * Created by magi on 2017. 2. 28..
 */

public class ModelB implements IModel {
    public String mName = "ModelB";

    @Override
    public void setName(String strName) {
        this.mName = strName;
    }

    @Override
    public String getName() {
        return this.mName;
    }
}
