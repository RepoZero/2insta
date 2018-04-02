package com.smrahmadi.a2insta.view;

import android.graphics.Bitmap;

import com.smrahmadi.a2insta.object.User;

public interface UserFragmentView  extends InternetView {

    void onGetProfileData(User user , Bitmap blurBackground);
    void onPostSuccessGetData();


}
