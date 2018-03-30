package com.smrahmadi.a2insta.objects;

import java.util.ArrayList;

/**
 * Created by lincoln on 3/18/18.
 */

public class Comment {

    private  String userId ;
    private String name ;
    private String text;
    private ArrayList<Like> like ;

    public Comment(String userId){
        this.userId=userId;
    }

    public Comment(String userId , String name , String text ){
        this.userId=userId;
        this.name=name;
        this.text=text;
    }
    public Comment(String userId, String name , String text, ArrayList<Like> like){
        this.userId=userId;
        this.name=name;
        this.text=text;
        this.like=like;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<Like> getLike() {
        return like;
    }

    public void setLike(ArrayList<Like> like) {
        this.like = like;
    }
}
