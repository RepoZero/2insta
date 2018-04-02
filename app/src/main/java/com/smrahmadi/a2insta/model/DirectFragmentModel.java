package com.smrahmadi.a2insta.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.smrahmadi.a2insta.adapter.DirectAdapter;
import com.smrahmadi.a2insta.object.Person;
import com.smrahmadi.a2insta.presenter.DirectFragmentPresenter;
import com.smrahmadi.a2insta.view.DirectFragmentView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.util.ArrayList;

public class DirectFragmentModel implements DirectFragmentPresenter {

    Context context ;
    DirectFragmentView mDirectFragmentView ;

    public DirectFragmentModel(Context context, DirectFragmentView mDirectFragmentView) {
        this.context = context;
        this.mDirectFragmentView = mDirectFragmentView;
    }

    @Override
    public void setRecyclerData(RecyclerView recyclerView) {

        final ArrayList<Person> people  = new ArrayList<>();






        Picasso.get().load("https://scontent-frt3-2.cdninstagram.com/vp/98d9ee9bde6ca3d0b9dae028b089612c/5B396830/t51.2885-19/s150x150/14156145_1612323229060517_462362610_a.jpg").into(new Target() {
            @Override
            public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {


                Person person = new Person("smr_amd" , "Mohammad Reza",bitmap);
                people.add(person);

            }

            @Override
            public void onBitmapFailed(Exception e, Drawable errorDrawable) {

            }

            @Override
            public void onPrepareLoad(Drawable placeHolderDrawable) {

            }
        });


        Picasso.get().load("https://scontent-frt3-2.cdninstagram.com/vp/d270c1f6ff89a04fff8d4d79e238c7ae/5B575DCF/t51.2885-19/s150x150/17439079_430068337335946_8126556720827727872_a.jpg").into(new Target() {
            @Override
            public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {


                Person person = new Person("smr_amd" , "Mohammad Reza",bitmap);
                people.add(person);

            }

            @Override
            public void onBitmapFailed(Exception e, Drawable errorDrawable) {

            }

            @Override
            public void onPrepareLoad(Drawable placeHolderDrawable) {

            }
        });



        Picasso.get().load("https://scontent-frt3-2.cdninstagram.com/vp/3a9e4937fef05497ec0df3220ac98584/5B590667/t51.2885-19/s150x150/26869925_464924967237716_4779614609726242816_n.jpg").into(new Target() {
            @Override
            public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {


                Person person = new Person("smr_amd" , "Mohammad Reza",bitmap);
                people.add(person);

            }

            @Override
            public void onBitmapFailed(Exception e, Drawable errorDrawable) {

            }

            @Override
            public void onPrepareLoad(Drawable placeHolderDrawable) {

            }
        });


        DirectAdapter adapter = new DirectAdapter(context,people);



        recyclerView.setLayoutManager(new LinearLayoutManager(context));


        recyclerView.setAdapter(adapter);







    }

    @Override
    public void serach(String s) {

    }

    @Override
    public void swipeDown() {

    }

    @Override
    public void setOnClickUser(int position) {

    }
}
