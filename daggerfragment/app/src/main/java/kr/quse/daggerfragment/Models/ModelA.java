package kr.quse.daggerfragment.Models;

/**
 * Created by magi on 2017. 2. 28..
 */

public class ModelA implements IModel {
    public String mName = "ModelA";

    @Override
    public void setName(String strName) {
        this.mName = strName;
    }

    @Override
    public String getName() {
        return this.mName;
    }
}
