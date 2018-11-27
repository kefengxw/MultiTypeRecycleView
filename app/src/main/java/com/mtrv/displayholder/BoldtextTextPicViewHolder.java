package com.mtrv.displayholder;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.mtrv.R;
import com.mtrv.displaydata.DisplayDataInfoBoldtextTextPic;
import com.mtrv.displayutil.MultiTypeAdapter;

public class BoldtextTextPicViewHolder extends BaseViewHolder<DisplayDataInfoBoldtextTextPic> {

    public static final int LAYOUT = R.layout.item_boldtext_text_pic;
    private View mItemView;
    private TextView mBoldText;
    private TextView mText;
    private ImageView mPicture;

    public BoldtextTextPicViewHolder(@NonNull View itemView) {
        super(itemView);
        mItemView = itemView;

        mBoldText = itemView.findViewById(R.id.item_boldtext_text_pic_cv_btext);
        mText = itemView.findViewById(R.id.item_boldtext_text_pic_cv_text);
        mPicture = itemView.findViewById(R.id.item_boldtext_text_pic_cv_pic);
    }

    @Override
    public void bindListData(DisplayDataInfoBoldtextTextPic model, int position, MultiTypeAdapter adapter) {

        mBoldText.setText(model.mBoldText);
        mText.setText(model.mText);
        mPicture.setImageResource(R.drawable.ic_background_testing);
        mItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(itemView.getContext(), "Boldtext Text Pic ViewHolder", Toast.LENGTH_SHORT).show();
            }
        });
    }
}