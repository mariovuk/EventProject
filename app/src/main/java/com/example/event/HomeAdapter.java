package com.example.event;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<com.example.event.Event> events;

    private static final int TYPE_HORIZONTAL = 1;
    private static final int TYPE_VERTICAL = 2;

    public HomeAdapter(List<com.example.event.Event> list) {
        events = list;
    }

    @Override
    public int getItemViewType(int position) {
        return position == 0 ? TYPE_HORIZONTAL : TYPE_VERTICAL;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == TYPE_HORIZONTAL) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            View view = inflater.inflate(R.layout.item_horizontal, parent, false);
            return new ViewHolderHorizontal(view);
        } else {
            LayoutInflater inflate = LayoutInflater.from(parent.getContext());
            View view = inflate.inflate(R.layout.item_vertical, parent, false);
            return new ViewHolderVertical(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (position == 0) {
            ((ViewHolderHorizontal) holder).bind();
        }
    }

    @Override
    public int getItemCount() {
        return events.size() + 1;
    }

    public class ViewHolderHorizontal extends RecyclerView.ViewHolder {

        public ViewHolderHorizontal(View view) {
            super(view);
        }

        public void bind() {
            RecyclerView rv = itemView.findViewById(R.id.horizontal_rv);

            List<com.example.event.Event> list = new ArrayList<com.example.event.Event>();

            list.add(new com.example.event.Event("jhsajd", 3.4f, "12 km"));
            list.add(new com.example.event.Event("jddf", 3.8f, "11 km"));

            rv.setAdapter(new HorizontalAdapter(list));
        }
    }
}
