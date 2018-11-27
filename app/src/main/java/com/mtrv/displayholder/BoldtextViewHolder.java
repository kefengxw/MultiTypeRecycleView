package com.mtrv.displayholder;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.mtrv.R;
import com.mtrv.displaydata.DisplayDataInfoBoldtext;
import com.mtrv.displayutil.MultiTypeAdapter;

public class BoldtextViewHolder extends BaseViewHolder<DisplayDataInfoBoldtext> {

    public static final int LAYOUT = R.layout.item_boldtext;
    private View mItemView;
    public TextView mBoldText;

    public BoldtextViewHolder(@NonNull View itemView) {
        super(itemView);
        mItemView = itemView;

        mBoldText = itemView.findViewById(R.id.item_boldtext_cv_btext);
    }

    @Override
    public void bindListData(DisplayDataInfoBoldtext model, int position, MultiTypeAdapter adapter) {

        mBoldText.setText(model.mBoldText);
        mItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(itemView.getContext(), "Boldtext ViewHolder", Toast.LENGTH_SHORT).show();
            }
        });
    }
}