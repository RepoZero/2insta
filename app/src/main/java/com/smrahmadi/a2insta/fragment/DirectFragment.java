package com.smrahmadi.a2insta.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;

import com.smrahmadi.a2insta.R;
import com.smrahmadi.a2insta.model.DirectFragmentModel;
import com.smrahmadi.a2insta.object.Person;
import com.smrahmadi.a2insta.presenter.DirectFragmentPresenter;
import com.smrahmadi.a2insta.view.DirectFragmentView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DirectFragment extends Fragment implements DirectFragmentView {

    @BindView(R.id.direct_search) protected EditText edtSearch;
    @BindView(R.id.direct_swipe) protected SwipeRefreshLayout swipe ;
    @BindView(R.id.direct_users) protected RecyclerView recyclerViewUsers ;


    DirectFragmentModel mDirectFragmentModel;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.direct_fragment,container,false);

        mDirectFragmentModel = new DirectFragmentModel(getContext(),this);

        initView(view);


        return view ;
    }

    private void  initView(View view){
        ButterKnife.bind(this, view) ;
        mDirectFragmentModel.setRecyclerData(recyclerViewUsers);
        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
    }


    @Override
    public void onError(String error) {

    }

    @Override
    public void onInternetConnectionError() {

    }

    @Override
    public void listReciveListener() {

    }
}
