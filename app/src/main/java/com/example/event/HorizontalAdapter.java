package com.example.event;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HorizontalAdapter extends RecyclerView.Adapter<ViewHolderVertical> {
    private List items;

    public HorizontalAdapter(List list) {
        items = list;
    }

    @NonNull
    @Override
    public ViewHolderVertical onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_vertical, parent, false);
        return new ViewHolderVertical(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderVertical holder, int position) {

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
