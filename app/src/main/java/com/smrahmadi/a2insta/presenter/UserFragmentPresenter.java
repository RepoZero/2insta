package com.smrahmadi.a2insta.presenter;

import android.support.v7.widget.RecyclerView;


public interface UserFragmentPresenter {

    void getDataProfile();
    void setDataRecycler(RecyclerView recyclerView);
    void onClickItemPost(int position);

}
