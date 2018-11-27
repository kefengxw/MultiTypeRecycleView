package com.mtrv.displayholder;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Toast;
import android.widget.VideoView;
import com.mtrv.R;
import com.mtrv.displaydata.DisplayDataInfoVideo;
import com.mtrv.displayutil.MultiTypeAdapter;

public class VideoViewHolder extends BaseViewHolder<DisplayDataInfoVideo> {

    public static final int LAYOUT = R.layout.item_video;
    private View mItemView;
    public VideoView mVideo;

    public VideoViewHolder(@NonNull View itemView) {
        super(itemView);
        mItemView = itemView;

        mVideo = itemView.findViewById(R.id.item_video_cv_video);
    }

    @Override
    public void bindListData(DisplayDataInfoVideo model, int position, MultiTypeAdapter adapter) {

        //mVideo.setText("VideoViewHolder mBoldText");
        mItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(itemView.getContext(), "Video ViewHolder", Toast.LENGTH_SHORT).show();
            }
        });
    }
}