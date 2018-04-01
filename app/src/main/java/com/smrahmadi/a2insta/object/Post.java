package com.smrahmadi.a2insta.object;

import java.util.HashMap;

/**
 * Created by lincoln on 3/18/18.
 */

public class Post {

    private String userId ;
    private String postId ;
    private HashMap<Integer,Content> content ;
    private HashMap<Integer,Like> like;
    private HashMap<Integer,Comment> comment;

    public Post(String userId , String postId , HashMap<Integer,Content> content ,HashMap<Integer,Like> like ,HashMap<Integer,Comment> comment ){
        this.userId=userId;
        this.postId=postId;
        this.content=content;
        this.like =like;
        this.comment=comment;
    }

    public Post(String userId, String postId, HashMap<Integer, Content> content) {
        this.userId = userId;
        this.postId = postId;
        this.content = content;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public HashMap<Integer, Content> getContent() {
        return content;
    }

    public void setContent(HashMap<Integer, Content> content) {
        this.content = content;
    }

    public HashMap<Integer, com.smrahmadi.a2insta.object.Like> getLike() {
        return like;
    }

    public void setLike(HashMap<Integer, com.smrahmadi.a2insta.object.Like> like) {
        this.like = like;
    }

    public HashMap<Integer, Comment> getComment() {
        return comment;
    }

    public void setComment(HashMap<Integer, Comment> comment) {
        this.comment = comment;
    }
}
