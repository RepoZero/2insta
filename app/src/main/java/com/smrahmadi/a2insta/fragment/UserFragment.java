package com.smrahmadi.a2insta.fragment;


import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bartoszlipinski.recyclerviewheader2.RecyclerViewHeader;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.smrahmadi.a2insta.R;
import com.smrahmadi.a2insta.model.UserFragmentModel;
import com.smrahmadi.a2insta.object.User;
import com.smrahmadi.a2insta.presenter.UserFragmentPresenter;
import com.smrahmadi.a2insta.view.UserFragmentView;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import jp.wasabeef.picasso.transformations.BlurTransformation;
import jp.wasabeef.picasso.transformations.CropCircleTransformation;


public class UserFragment extends Fragment implements View.OnClickListener,UserFragmentView {



    @BindView(R.id.profile_Background) protected ImageView profileBackground;
    @BindView(R.id.profile_image) protected ImageView profileImage;

    @BindView(R.id.profile_name) protected TextView txtName;
    @BindView(R.id.profile_bio) protected TextView txtBio;

    @BindView(R.id.profile_edit) protected Button edit;

    @BindView(R.id.profile_posts) protected TextView txtPosts;
    @BindView(R.id.profile_followers) protected TextView txtFollowers;
    @BindView(R.id.profile_following) protected TextView txtFollowing;

    @BindView(R.id.profile_bookmarks) protected ImageView bookmarks;
    @BindView(R.id.profile_extensions) protected ImageView extensions;
    @BindView(R.id.profile_addPost) protected ImageView addPost;


    @BindView(R.id.user_profile) protected RecyclerViewHeader userProfile ;
    @BindView(R.id.user_Posts) protected RecyclerView userPosts ;


    private UserFragmentModel mUserFragmentModel ;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.user_fragment,container,false);

        mUserFragmentModel = new UserFragmentModel(getContext(),this);
        initView(view);





        return view;
    }

    public void initView(View view){
        ButterKnife.bind(this,view);

        mUserFragmentModel.getDataProfile();
        mUserFragmentModel.setDataRecycler(userPosts);



        userProfile.attachTo(userPosts);


        profileImage.setOnClickListener(this);
        txtName.setOnClickListener(this);
        txtBio.setOnClickListener(this);
        edit.setOnClickListener(this);
        txtPosts.setOnClickListener(this);
        txtFollowers.setOnClickListener(this);
        txtFollowing.setOnClickListener(this);
        bookmarks.setOnClickListener(this);
        extensions.setOnClickListener(this);
        addPost.setOnClickListener(this);
    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onGetProfileData(User user) {




        Picasso.get().load(user.getProfileImage())
                .transform(new BlurTransformation(getContext(),25,1))
                .into(profileBackground);


        Picasso.get().load(user.getProfileImage())
                .transform(new CropCircleTransformation())
                .into(profileImage);



        txtName.setText(user.getName());
        txtBio.setText(user.getBio());

        txtPosts.setText((user.getPostCount()) + "\n Posts");
        txtFollowers.setText(((int)user.getFollowersCount()) + "k \n Followers");
        txtFollowing.setText((int)(user.getFollowingCount()) + "\n Following");
    }

    @Override
    public void onPostSuccessGetData() {

    }

    @Override
    public void onError(String error) {

    }

    @Override
    public void onInternetConnectionError() {

    }

    @Override
    public void onClick(View v) {

        YoYo.with(Techniques.Pulse).duration(500).playOn(v) ;

    }
}
