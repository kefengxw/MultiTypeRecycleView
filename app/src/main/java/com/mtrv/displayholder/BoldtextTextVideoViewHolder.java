package com.mtrv.displayholder;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;
import com.mtrv.R;
import com.mtrv.displaydata.DisplayDataInfoBoldtextTextVideo;
import com.mtrv.displayutil.MultiTypeAdapter;

public class BoldtextTextVideoViewHolder extends BaseViewHolder<DisplayDataInfoBoldtextTextVideo> {

    public static final int LAYOUT = R.layout.item_boldtext_text_video;
    private View mItemView;
    public TextView mBoldText;
    public TextView mText;
    public VideoView mVideo;

    public BoldtextTextVideoViewHolder(@NonNull View itemView) {
        super(itemView);
        mItemView = itemView;

        mBoldText = itemView.findViewById(R.id.item_boldtext_text_video_cv_btext);
        mText = itemView.findViewById(R.id.item_boldtext_text_video_cv_text);
        mVideo = itemView.findViewById(R.id.item_boldtext_text_video_cv_video);
    }

    @Override
    public void bindListData(DisplayDataInfoBoldtextTextVideo model, int position, MultiTypeAdapter adapter) {

        mBoldText.setText(model.mBoldText);
        mText.setText(model.mText);
        //mVideo.setImageResource(R.drawable.ic_background_testing);
        mItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(itemView.getContext(), "Boldtext Text Video ViewHolder", Toast.LENGTH_SHORT).show();
            }
        });
    }
}