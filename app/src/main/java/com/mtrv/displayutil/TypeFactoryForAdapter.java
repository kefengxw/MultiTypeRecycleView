package com.mtrv.displayutil;

import android.view.View;
import com.mtrv.displaydata.*;
import com.mtrv.displayholder.*;

public class TypeFactoryForAdapter implements TypeFactory {
    @Override
    public int getType(DisplayDataInfoBoldtextTextPic car) {
        return BoldtextTextPicViewHolder.LAYOUT;
    }

    @Override
    public int getType(DisplayDataInfoBoldtextTextVideo duck) {
        return BoldtextTextVideoViewHolder.LAYOUT;
    }

    @Override
    public int getType(DisplayDataInfoBoldtext it) {
        return BoldtextViewHolder.LAYOUT;
    }

    @Override
    public int getType(DisplayDataInfoBoldtextTextText it) {
        return BoldtextTextTextViewHolder.LAYOUT;
    }

    @Override
    public int getType(DisplayDataInfoPicBoldtextText it) {
        return PicBoldtextTextViewHolder.LAYOUT;
    }

    @Override
    public int getType(DisplayDataInfoVideo it) {
        return VideoViewHolder.LAYOUT;
    }

    @Override
    public int getType(DisplayDataInfoVideoBoldtextText it) {
        return VideoBoldtextTextViewHolder.LAYOUT;
    }

    @Override
    public BaseViewHolder createViewHolder(View itemView, int viewType) {
        BaseViewHolder viewHolder = null;

        switch (viewType) {
            case BoldtextTextPicViewHolder.LAYOUT:
                viewHolder = new BoldtextTextPicViewHolder(itemView);
                break;
            case BoldtextTextVideoViewHolder.LAYOUT:
                viewHolder = new BoldtextTextVideoViewHolder(itemView);
                break;
            case BoldtextViewHolder.LAYOUT:
                viewHolder = new BoldtextViewHolder(itemView);
                break;
            case BoldtextTextTextViewHolder.LAYOUT:
                viewHolder = new BoldtextTextTextViewHolder(itemView);
                break;
            case PicBoldtextTextViewHolder.LAYOUT:
                viewHolder = new PicBoldtextTextViewHolder(itemView);
                break;
            case VideoViewHolder.LAYOUT:
                viewHolder = new VideoViewHolder(itemView);
                break;
            case VideoBoldtextTextViewHolder.LAYOUT:
                viewHolder = new VideoBoldtextTextViewHolder(itemView);
                break;
            default:
                //log here, throw exception
        }
        return viewHolder;
    }
}
