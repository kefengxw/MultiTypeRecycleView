package com.mtrv.displaydata;

import com.mtrv.displayutil.TypeFactory;
import com.mtrv.displayutil.Visitable;

public class DisplayDataInfoPicBoldtextText implements Visitable {

    public int mPicId;
    public String mBoldText;
    public String mText;

    public DisplayDataInfoPicBoldtextText(int mPicId, String mBoldText, String mText) {
        this.mBoldText = mBoldText;
        this.mText = mText;
        this.mPicId = mPicId;
    }

    @Override
    public int getType(TypeFactory typeFactory) {
        return typeFactory.getType(this);
    }
}
