package com.mtrv.displayutil;

import android.view.View;
import com.mtrv.displaydata.*;
import com.mtrv.displayholder.BaseViewHolder;

public interface TypeFactory {
    int getType(DisplayDataInfoBoldtextTextPic it);

    int getType(DisplayDataInfoBoldtextTextVideo it);

    int getType(DisplayDataInfoBoldtext it);

    int getType(DisplayDataInfoBoldtextTextText it);

    int getType(DisplayDataInfoPicBoldtextText it);

    int getType(DisplayDataInfoVideo it);

    int getType(DisplayDataInfoVideoBoldtextText it);

    BaseViewHolder createViewHolder(View itemView, int viewType);
}
