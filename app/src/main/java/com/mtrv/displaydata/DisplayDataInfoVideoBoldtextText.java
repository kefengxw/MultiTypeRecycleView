package com.mtrv.displaydata;

import com.mtrv.displayutil.TypeFactory;
import com.mtrv.displayutil.Visitable;

public class DisplayDataInfoVideoBoldtextText implements Visitable {

    public int mVideoId;
    public String mBoldText;
    public String mText;

    public DisplayDataInfoVideoBoldtextText(int mVideoId, String mBoldText, String mText) {
        this.mBoldText = mBoldText;
        this.mText = mText;
        this.mVideoId = mVideoId;
    }

    @Override
    public int getType(TypeFactory typeFactory) {
        return typeFactory.getType(this);
    }
}
