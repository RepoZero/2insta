package com.smrahmadi.a2insta.model;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.smrahmadi.a2insta.adapter.UserAdapter;
import com.smrahmadi.a2insta.object.Content;
import com.smrahmadi.a2insta.object.Post;
import com.smrahmadi.a2insta.object.User;
import com.smrahmadi.a2insta.presenter.UserFragmentPresenter;
import com.smrahmadi.a2insta.utils.BitmapFactory;
import com.smrahmadi.a2insta.view.UserFragmentView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;

public class UserFragmentModel implements UserFragmentPresenter {

    private Context context ;
    private UserFragmentView  mUserFragmentView;

    public UserFragmentModel(Context context,UserFragmentView mUserFragmentView) {
        this.context = context ;
        this.mUserFragmentView = mUserFragmentView;
    }



    @Override
    public void setDataRecycler(RecyclerView recyclerView) {

        Content c1 = new Content(
                "ok",
                "ok",
                "https://www.gettyimages.ca/gi-resources/images/Homepage/Hero/UK/CMS_Creative_164657191_Kingfisher.jpg",
                false);




        Content c2 = new Content(
                "ok",
                "ok",
                "https://image.freepik.com/free-photo/cute-cat-picture_1122-449.jpg",
                false);



        Content c3 = new Content(
                "ok",
                "ok",
                "https://cloud.netlifyusercontent.com/assets/344dbf88-fdf9-42bb-adb4-46f01eedd629/68dd54ca-60cf-4ef7-898b-26d7cbe48ec7/10-dithering-opt.jpg",
                false);


        Content c4 = new Content(
                "ok",
                "ok",
                "https://cdn.vox-cdn.com/thumbor/7SjQ8-Tnta4Ycj6ii1BQsZXvios=/0x0:3975x2640/920x613/filters:focal(1670x1002:2306x1638):format(webp)/cdn.vox-cdn.com/uploads/chorus_image/image/58641295/913011958.jpg.0.jpg",
                false);



        Content c5 = new Content(
                "ok",
                "ok",
                "https://i.kinja-img.com/gawker-media/image/upload/s--r_Wnfisn--/c_scale,fl_progressive,q_80,w_800/bftynezk3phlj4qf0fpm.jpg",
                false);




        @SuppressLint("UseSparseArrays") HashMap <Integer,Content> hashMap = new HashMap<>();
        @SuppressLint("UseSparseArrays") HashMap <Integer,Content> hashMap2 = new HashMap<>();
        @SuppressLint("UseSparseArrays") HashMap <Integer,Content> hashMap3 = new HashMap<>();
        @SuppressLint("UseSparseArrays") HashMap <Integer,Content> hashMap4 = new HashMap<>();
        @SuppressLint("UseSparseArrays") HashMap <Integer,Content> hashMap5 = new HashMap<>();

        hashMap.put(0,c1);
        hashMap2.put(0,c2);
        hashMap3.put(0,c3);
        hashMap4.put(0,c4);
        hashMap5.put(0,c5);

        Post p = new Post("a","a",hashMap);
        Post p2 = new Post("a","v",hashMap2);
        Post p3 = new Post("a","v",hashMap3);
        Post p4 = new Post("a","v",hashMap4);
        Post p5 = new Post("a","v",hashMap5);
        ArrayList<Post> f = new ArrayList<>();

        f.add(p);
        f.add(p2);
        f.add(p3);
        f.add(p4);
        f.add(p5);

        f.add(p4);
        f.add(p);
        f.add(p3);
        f.add(p5);
        f.add(p2);



        UserAdapter userAdapter = new UserAdapter(context,f);


        int numberOfColumns = 3 ;
        recyclerView.setLayoutManager(new GridLayoutManager(context, numberOfColumns));

        recyclerView.setAdapter(userAdapter);


        mUserFragmentView.onPostSuccessGetData();



    }



    @Override
    public void getDataProfile() {



        Picasso.get().load("https://scontent-frx5-1.cdninstagram.com/vp/e6c42f958aa4aef03b57e979159cc896/5B6C7A1A/t51.2885-19/s150x150/27878282_218892278658420_7118024766807605248_n.jpg").into(new com.squareup.picasso.Target() {
            @Override
            public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {

                Bitmap blurBackground = BitmapFactory.blur(context,bitmap) ;
                Bitmap circleProfile = BitmapFactory.Cropped(bitmap) ;

                User user = new User("smr_amd","Mohammad Reza","<Programmer/>",circleProfile,
                        999,15,10);

                mUserFragmentView.onGetProfileData(user,blurBackground);
            }

            @Override
            public void onBitmapFailed(Exception e, Drawable errorDrawable) {

            }

            @Override
            public void onPrepareLoad(Drawable placeHolderDrawable) {

            }
        });



    }

    @Override
    public void onClickItemPost(int position) {

    }


}
