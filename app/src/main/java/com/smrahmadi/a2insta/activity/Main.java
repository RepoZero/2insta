package com.smrahmadi.a2insta.activity;


import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.smrahmadi.a2insta.R;
import com.smrahmadi.a2insta.fragment.DirectFragment;
import com.smrahmadi.a2insta.fragment.HomeFragment;
import com.smrahmadi.a2insta.fragment.SearchFragment;
import com.smrahmadi.a2insta.fragment.StoryFragment;
import com.smrahmadi.a2insta.fragment.UserFragment;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import eu.long1.spacetablayout.SpaceTabLayout;


public class Main extends AppCompatActivity {

    @BindView(R.id.spaceTabLayout) protected SpaceTabLayout spaceTabLayout ;
    @BindView(R.id.viewPager) protected ViewPager viewPager ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();


        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new UserFragment());
        fragmentList.add(new DirectFragment());
        fragmentList.add(new SearchFragment());
        fragmentList.add(new HomeFragment());
        fragmentList.add(new StoryFragment());

        spaceTabLayout.initialize(viewPager, getSupportFragmentManager(), fragmentList,savedInstanceState);

        spaceTabLayout.setTabFourIcon(R.drawable.home);
        spaceTabLayout.setTabFiveIcon(R.drawable.story);

        spaceTabLayout.setButtonColor(getResources().getColor(R.color.colorPrimaryDark));




    }
    void initView(){
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        spaceTabLayout.saveState(outState);
        super.onSaveInstanceState(outState);
    }
}
