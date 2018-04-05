package com.smrahmadi.a2insta.presenter;

import android.support.v7.widget.RecyclerView;

public interface StoryFragmentPresenter {

    void getFollowingStory(RecyclerView recyclerView, boolean isPopular);
}
