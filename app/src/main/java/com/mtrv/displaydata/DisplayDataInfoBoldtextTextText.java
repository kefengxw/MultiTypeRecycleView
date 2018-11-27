package com.mtrv.displaydata;

import com.mtrv.displayutil.TypeFactory;
import com.mtrv.displayutil.Visitable;

public class DisplayDataInfoBoldtextTextText implements Visitable {

    public String mBoldText;
    public String mText1;
    public String mTextTime;

    public DisplayDataInfoBoldtextTextText(String mBoldText, String mText1, String mTextTime) {
        this.mBoldText = mBoldText;
        this.mText1 = mText1;
        this.mTextTime = mTextTime;
    }

    @Override
    public int getType(TypeFactory typeFactory) {
        return typeFactory.getType(this);
    }
}
