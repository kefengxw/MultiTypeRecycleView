package com.mtrv.displaydata;

import com.mtrv.displayutil.TypeFactory;
import com.mtrv.displayutil.Visitable;

public class DisplayDataInfoBoldtextTextPic implements Visitable {

    public String mBoldText;
    public String mText;
    public int mPicId;

    public DisplayDataInfoBoldtextTextPic(String mBoldText, String mText, int mPicId) {
        this.mBoldText = mBoldText;
        this.mText = mText;
        this.mPicId = mPicId;
    }

    @Override
    public int getType(TypeFactory typeFactory) {
        return typeFactory.getType(this);
    }
}
