package com.smrahmadi.a2insta.presenter;

import android.support.v7.widget.RecyclerView;

public interface DirectFragmentPresenter {

    void setRecyclerData(RecyclerView recyclerView);
    void serach(String s);
    void swipeDown();
    void setOnClickUser(int position);
}
