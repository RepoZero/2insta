package com.smrahmadi.a2insta.model;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.smrahmadi.a2insta.adapter.StoryAdapter;
import com.smrahmadi.a2insta.object.Story;
import com.smrahmadi.a2insta.presenter.StoryFragmentPresenter;
import com.smrahmadi.a2insta.view.StoryFragmentView;

import java.util.ArrayList;

public class StoryFragmentModel implements StoryFragmentPresenter {

    private Context context ;
    private StoryFragmentView mStoryFragmentView ;

    public StoryFragmentModel(Context context, StoryFragmentView mStoryFragmentView) {
        this.context = context;
        this.mStoryFragmentView = mStoryFragmentView;
    }

    @Override
    public void getFollowingStory(RecyclerView recyclerView, boolean isPopular) {

        ArrayList<String> urls = new ArrayList<>();

        Story story1 = new Story("a","Mohammad Reza","https://scontent-frt3-2.cdninstagram.com/vp/98d9ee9bde6ca3d0b9dae028b089612c/5B396830/t51.2885-19/s150x150/14156145_1612323229060517_462362610_a.jpg",urls);
        Story story2 = new Story("a","Ali","https://scontent-frt3-2.cdninstagram.com/vp/d270c1f6ff89a04fff8d4d79e238c7ae/5B575DCF/t51.2885-19/s150x150/17439079_430068337335946_8126556720827727872_a.jpg",urls);
        Story story3 = new Story("a","A422","https://scontent-frt3-2.cdninstagram.com/vp/3a9e4937fef05497ec0df3220ac98584/5B590667/t51.2885-19/s150x150/26869925_464924967237716_4779614609726242816_n.jpg",urls);
        Story story4 = new Story("a","MR","https://scontent-frx5-1.cdninstagram.com/vp/e6c42f958aa4aef03b57e979159cc896/5B6C7A1A/t51.2885-19/s150x150/27878282_218892278658420_7118024766807605248_n.jpg",urls);


        ArrayList<Story> stories = new ArrayList<>();


        stories.add(story1);
        stories.add(story2);
        stories.add(story3);
        stories.add(story4);

        StoryAdapter adapter = new StoryAdapter(context,stories);


        int numberOfColumns = 3 ;
        recyclerView.setLayoutManager(new GridLayoutManager(context, numberOfColumns));

        recyclerView.setAdapter(adapter);


    }


}
