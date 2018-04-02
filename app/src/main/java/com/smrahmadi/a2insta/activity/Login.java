package com.smrahmadi.a2insta.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.smrahmadi.a2insta.R;
import com.smrahmadi.a2insta.model.LoginModel;
import com.smrahmadi.a2insta.presenter.LoginPresenter;
import com.smrahmadi.a2insta.view.LoginView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Login extends AppCompatActivity implements View.OnClickListener,LoginView {

    @BindView(R.id.login_username)protected EditText edtUsername;
    @BindView(R.id.login_password)protected EditText edtPassword;
    @BindView(R.id.login_btn)protected Button btnLogin;


    private LoginModel mLoginPresenter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();

        mLoginPresenter = new LoginModel(this) ;

    }

    void initView(){
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        btnLogin.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        String userName = edtUsername.getText().toString();
        String password = edtPassword.getText().toString();

        if(v.getId()==R.id.login_btn){
            mLoginPresenter.performLogin(userName,password);
        }

    }

    @Override
    public void loginValidation() {
        Toast.makeText(this, "UserName or Password is Empty", Toast.LENGTH_SHORT).show();
        YoYo.with(Techniques.Tada).duration(500).playOn(edtUsername);
        YoYo.with(Techniques.Tada).duration(500).playOn(edtPassword);
    }

    @Override
    public void loginSuccess() {

    }

    @Override
    public void loginError() {

    }

    @Override
    public void onError(String error) {

    }

    @Override
    public void onInternetConnectionError() {

    }
}
