package com.mtrv.displayholder;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;
import com.mtrv.R;
import com.mtrv.displaydata.DisplayDataInfoVideoBoldtextText;
import com.mtrv.displayutil.MultiTypeAdapter;

public class VideoBoldtextTextViewHolder extends BaseViewHolder<DisplayDataInfoVideoBoldtextText> {

    public static final int LAYOUT = R.layout.item_video_boldtext_text;
    private View mItemView;
    public VideoView mVideo;
    public TextView mBoldText;
    public TextView mText;

    public VideoBoldtextTextViewHolder(@NonNull View itemView) {
        super(itemView);
        mItemView = itemView;

        mVideo = itemView.findViewById(R.id.item_video_boldtext_text_cv_video);
        mBoldText = itemView.findViewById(R.id.item_video_boldtext_text_cv_btext);
        mText = itemView.findViewById(R.id.item_video_boldtext_text_cv_text);
    }

    @Override
    public void bindListData(DisplayDataInfoVideoBoldtextText model, int position, MultiTypeAdapter adapter) {

        //mVideo.setImageResource(R.drawable.ic_background_testing);
        mBoldText.setText(model.mBoldText);
        mText.setText(model.mText);
        mItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(itemView.getContext(), "Video Boldtext Text ViewHolder", Toast.LENGTH_SHORT).show();
            }
        });
    }
}