package com.smrahmadi.a2insta.model;

import android.content.Context;
import android.support.v7.widget.RecyclerView;


import com.smrahmadi.a2insta.presenter.SearchFragmentPresenter;
import com.smrahmadi.a2insta.view.SearchFragmentView;

public class SearchFragmentModel implements SearchFragmentPresenter {

    Context context ;
    SearchFragmentView mSearchFragmentView;

    public SearchFragmentModel(Context context, SearchFragmentView mSearchFragmentView) {
        this.context = context;
        this.mSearchFragmentView = mSearchFragmentView;
    }



    @Override
    public void peopleSearch(String text, RecyclerView recyclerView) {

    }

    @Override
    public void tagSearch(String text, RecyclerView recyclerView) {

    }

    @Override
    public void placeSeach(String text, RecyclerView recyclerView) {

    }
}
