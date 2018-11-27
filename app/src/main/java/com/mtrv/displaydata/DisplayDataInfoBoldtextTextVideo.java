package com.mtrv.displaydata;

import com.mtrv.displayutil.TypeFactory;
import com.mtrv.displayutil.Visitable;

public class DisplayDataInfoBoldtextTextVideo implements Visitable {

    public String mBoldText;
    public String mText;
    public int mVideoId;

    public DisplayDataInfoBoldtextTextVideo(String mBoldText, String mText, int mVideoId) {
        this.mBoldText = mBoldText;
        this.mText = mText;
        this.mVideoId = mVideoId;
    }

    @Override
    public int getType(TypeFactory typeFactory) {
        return typeFactory.getType(this);
    }
}
