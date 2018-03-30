package com.smrahmadi.a2insta.activity;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.smrahmadi.a2insta.R;

import java.util.HashMap;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        @SuppressLint("UseSparseArrays")
        HashMap<Integer,MyKey> hm= new HashMap<>();
        hm.put(0,new MyKey("a","b","c"));
        hm.put(1,new MyKey("d","e","f"));
        hm.put(2,new MyKey("g","h","i"));

    }



    public class MyKey {
        String subkey1; String subkey2; String subkey3;
        MyKey(String subkey1, String subkey2, String subkey3) {
            this.subkey1=subkey1; this.subkey2=subkey2; this.subkey3=subkey3 ;
        }
    }
}
