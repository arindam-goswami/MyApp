package com.mymenu.freshmenu;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TabMain extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    FoodItem images[]={new FoodItem(R.drawable.one,"main1"),
            new FoodItem(R.drawable.two,"main2"),
            new FoodItem(R.drawable.three,"main3"),
            new FoodItem(R.drawable.four,"main4")};
    Activity myCurrentActivity;

    public void setCurrentActivity(Activity currentActivity) {
        myCurrentActivity = currentActivity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_main, container, false);
        setHasOptionsMenu(true);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MyAdapter(images, getActivity());
        mRecyclerView.setAdapter(mAdapter);
        return view;
    }
}