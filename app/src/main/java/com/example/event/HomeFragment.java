package com.example.event;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        HomeBottomSheetDialog bottomSheetDialog = new HomeBottomSheetDialog();

        RecyclerView rv = view.findViewById(R.id.list_rv);

        List<com.example.event.Event> list = new ArrayList<>();
        list.add(new com.example.event.Event("Life Solatune", 4.9F, "15 mins walk"));
        list.add(new com.example.event.Event("Fish and Bread", 4.8F, "20 mins walk"));
        list.add(new com.example.event.Event("Life Solatune", 4.9F, "15 mins walk"));

        rv.setAdapter(new HomeAdapter(list));

//        bottomSheetDialog.show(getChildFragmentManager(), bottomSheetDialog.getTag());
//        bottomSheetDialog.setCancelable(false);

    }
}
