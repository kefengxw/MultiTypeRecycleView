package com.mtrv.displayholder;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.mtrv.R;
import com.mtrv.displaydata.DisplayDataInfoBoldtextTextText;
import com.mtrv.displayutil.MultiTypeAdapter;

public class BoldtextTextTextViewHolder extends BaseViewHolder<DisplayDataInfoBoldtextTextText> {

    public static final int LAYOUT = R.layout.item_boldtext_text_text;
    private View mItemView;
    public TextView mBoldText;
    public TextView mText;
    public TextView mTextTime;

    public BoldtextTextTextViewHolder(@NonNull View itemView) {
        super(itemView);
        mItemView = itemView;

        mBoldText = itemView.findViewById(R.id.item_boldtext_text_text_cv_btext);
        mText = itemView.findViewById(R.id.item_boldtext_text_text_cv_text);
        mTextTime = itemView.findViewById(R.id.item_boldtext_text_text_cv_text_time);
    }

    @Override
    public void bindListData(DisplayDataInfoBoldtextTextText model, int position, MultiTypeAdapter adapter) {

        mBoldText.setText(model.mBoldText);
        mText.setText(model.mText1);
        mTextTime.setText(model.mTextTime);
        mItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(itemView.getContext(), "Boldtext Text Text ViewHolder", Toast.LENGTH_SHORT).show();
            }
        });
    }
}