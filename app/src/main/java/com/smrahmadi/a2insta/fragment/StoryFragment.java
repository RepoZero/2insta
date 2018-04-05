package com.smrahmadi.a2insta.fragment;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.smrahmadi.a2insta.R;
import com.smrahmadi.a2insta.model.StoryFragmentModel;
import com.smrahmadi.a2insta.view.StoryFragmentView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StoryFragment extends Fragment implements View.OnClickListener,StoryFragmentView {


    @BindView(R.id.story_following) protected Button following;
    @BindView(R.id.story_popular) protected Button popular;
    @BindView(R.id.story_list) protected RecyclerView reList ;

    private StoryFragmentModel mStoryFragmentModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.story_fragment,container,false);

        mStoryFragmentModel = new StoryFragmentModel(getContext(),this);
        initView(view);

        return view ;
    }

    void initView(View view){
        ButterKnife.bind(this,view);

        following.setOnClickListener(this);
        popular.setOnClickListener(this);

        mStoryFragmentModel.getFollowingStory(reList,false);
    }



    private void btnEnableDisable(Button btnEnable , Button btnDisable ){

        btnEnable.setBackground(getActivity().getResources().getDrawable(R.drawable.btn_search_solid));
        btnEnable.setTypeface(null, Typeface.BOLD);
        btnEnable.setTextColor(getActivity().getResources().getColor(R.color.white));

        YoYo.with(Techniques.Pulse).duration(300).playOn(btnEnable);

        btnDisable.setBackground(getActivity().getResources().getDrawable(R.drawable.btn_search));
        btnDisable.setTypeface(null,Typeface.NORMAL);
        btnDisable.setTextColor(getActivity().getResources().getColor(R.color.black));

    }


    @Override
    public void onClick(View v) {

        if(v.getId()==following.getId()){
            btnEnableDisable(following,popular);
        }else if (v.getId()==popular.getId()){
            btnEnableDisable(popular,following);
        }

    }

    @Override
    public void setOnGetList() {

    }

    @Override
    public void onError(String error) {

    }

    @Override
    public void onInternetConnectionError() {

    }
}
