package com.mtrv.displayholder;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.mtrv.R;
import com.mtrv.displaydata.DisplayDataInfoPicBoldtextText;
import com.mtrv.displayutil.MultiTypeAdapter;

public class PicBoldtextTextViewHolder extends BaseViewHolder<DisplayDataInfoPicBoldtextText> {

    public static final int LAYOUT = R.layout.item_pic_boldtext_text;
    private View mItemView;
    public ImageView mPicture;
    public TextView mBoldText;
    public TextView mText;

    public PicBoldtextTextViewHolder(@NonNull View itemView) {
        super(itemView);
        mItemView = itemView;

        mPicture = itemView.findViewById(R.id.item_pic_boldtext_text_cv_pic);
        mBoldText = itemView.findViewById(R.id.item_pic_boldtext_text_cv_btext);
        mText = itemView.findViewById(R.id.item_pic_boldtext_text_cv_text);
    }

    @Override
    public void bindListData(DisplayDataInfoPicBoldtextText model, int position, MultiTypeAdapter adapter) {

        mPicture.setImageResource(model.mPicId);
        mBoldText.setText(model.mBoldText);
        mText.setText(model.mText);
        mItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(itemView.getContext(), "Pic Boldtext Text ViewHolder", Toast.LENGTH_SHORT).show();
            }
        });
    }
}