package com.mtrv.displaydata;

import com.mtrv.displayutil.TypeFactory;
import com.mtrv.displayutil.Visitable;

public class DisplayDataInfoVideo implements Visitable {

    private int mVideoId;

    public DisplayDataInfoVideo(int mVideoId) {
        this.mVideoId = mVideoId;
    }

    @Override
    public int getType(TypeFactory typeFactory) {
        return typeFactory.getType(this);
    }
}
