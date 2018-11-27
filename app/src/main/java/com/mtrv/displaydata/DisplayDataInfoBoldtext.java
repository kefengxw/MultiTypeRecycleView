package com.mtrv.displaydata;

import com.mtrv.displayutil.TypeFactory;
import com.mtrv.displayutil.Visitable;

public class DisplayDataInfoBoldtext implements Visitable {

    public String mBoldText;

    public DisplayDataInfoBoldtext(String mBoldText) {
        this.mBoldText = mBoldText;
    }

    @Override
    public int getType(TypeFactory typeFactory) {
        return typeFactory.getType(this);
    }
}
