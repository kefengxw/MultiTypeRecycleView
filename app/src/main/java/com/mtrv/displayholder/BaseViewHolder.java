package com.mtrv.displayholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.mtrv.displayutil.MultiTypeAdapter;

public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {

    public BaseViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public abstract void bindListData(T model, int position, MultiTypeAdapter adapter);
}
