package com.smrahmadi.a2insta.fragment;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.smrahmadi.a2insta.R;
import com.smrahmadi.a2insta.model.SearchFragmentModel;
import com.smrahmadi.a2insta.view.SearchFragmentView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchFragment extends Fragment implements View.OnClickListener,SearchFragmentView{


    @BindView(R.id.search_text) protected EditText text ;
    @BindView(R.id.search_people) protected Button people ;
    @BindView(R.id.search_tags) protected Button tags ;
    @BindView(R.id.search_places) protected Button places ;

    SearchFragmentModel mSearchFragmentModel ;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.search_fragment,container,false);

        initView(view);


        return view;
    }

    void initView(View view){
        ButterKnife.bind(this,view);
        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        people.setOnClickListener(this);
        tags.setOnClickListener(this);
        places.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.search_people){

            btnEnableDisable(people,tags,places);
            text.setCompoundDrawablesWithIntrinsicBounds( R.drawable.people, 0, R.drawable.search, 0);

        }else if (v.getId()==R.id.search_tags){

            btnEnableDisable(tags,people,places);
            text.setCompoundDrawablesWithIntrinsicBounds( R.drawable.tag, 0, R.drawable.search, 0);

        }else if (v.getId()==R.id.search_places) {

            btnEnableDisable(places,tags,people);
            text.setCompoundDrawablesWithIntrinsicBounds( R.drawable.place, 0, R.drawable.search, 0);

        }

        YoYo.with(Techniques.Bounce).duration(300).playOn(text) ;

    }

    @Override
    public void setOnGetSearch() {

    }

    @Override
    public void onError(String error) {

    }

    @Override
    public void onInternetConnectionError() {

    }

   private void btnEnableDisable(Button btnEnable , Button btnDisable1 , Button btnDisable2 ){

        btnEnable.setBackground(getActivity().getResources().getDrawable(R.drawable.btn_search_solid));
        btnEnable.setTypeface(null, Typeface.BOLD);
        btnEnable.setTextColor(getActivity().getResources().getColor(R.color.white));

        YoYo.with(Techniques.Pulse).duration(300).playOn(btnEnable);

        btnDisable1.setBackground(getActivity().getResources().getDrawable(R.drawable.btn_search));
        btnDisable1.setTypeface(null,Typeface.NORMAL);
        btnDisable1.setTextColor(getActivity().getResources().getColor(R.color.black));
//        YoYo.with(Techniques.Bounce).duration(500).playOn(btnDisable1);


       btnDisable2.setBackground(getActivity().getResources().getDrawable(R.drawable.btn_search));
       btnDisable2.setTypeface(null,Typeface.NORMAL);
       btnDisable2.setTextColor(getActivity().getResources().getColor(R.color.black));
//       YoYo.with(Techniques.Bounce).duration(500).playOn(btnDisable2);


   }

}
