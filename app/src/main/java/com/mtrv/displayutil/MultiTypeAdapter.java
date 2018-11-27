package com.mtrv.displayutil;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mtrv.displayholder.BaseViewHolder;

import java.util.ArrayList;
import java.util.List;

public class MultiTypeAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private List<Visitable> mListData = new ArrayList<>();
    private TypeFactory typeFactory;

    public MultiTypeAdapter() {
        this.typeFactory = new TypeFactoryForAdapter();
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        Context ctx = viewGroup.getContext();
        View itemView = LayoutInflater.from(ctx).inflate(viewType, viewGroup, false);

        return typeFactory.createViewHolder(itemView, viewType);
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder baseViewHolder, int position) {
        //depands on the type from GSON to distinguish the view holder type, or can be explicit define on GSON
        baseViewHolder.bindListData(mListData.get(position), position, this);
    }

    @Override
    public int getItemCount() {
        if (mListData == null) {
            return 0;
        }
        return mListData.size();//could be zero also.
    }

    @Override
    public int getItemViewType(int position) {
        //super.getItemViewType(position);
        return mListData.get(position).getType(typeFactory);
    }

    public void setListData(List<Visitable> it) {
        this.mListData = it;
        notifyDataSetChanged();//can be improved one holder by one holder
    }
}
