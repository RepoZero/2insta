package com.smrahmadi.a2insta.model;

import android.widget.Toast;

import com.smrahmadi.a2insta.presenter.LoginPresenter;
import com.smrahmadi.a2insta.view.LoginView;

public class LoginModel implements LoginPresenter {

    private LoginView mLoginView;

    public LoginModel(LoginView mLoginView){
        this.mLoginView = mLoginView;

    }


    @Override
    public void performLogin(String userName, String password) {

        if(userName.equals("") || password.equals("")){
            mLoginView.loginValidation();
        }else{

            //// connect to server


        }


    }
}
