package com.smrahmadi.a2insta.presenter;

import android.support.v7.widget.RecyclerView;

import com.smrahmadi.a2insta.view.InternetView;

public interface SearchFragmentPresenter  {

    void peopleSearch(String text , RecyclerView recyclerView);
    void tagSearch(String text , RecyclerView recyclerView);
    void placeSeach(String text , RecyclerView recyclerView);

}
