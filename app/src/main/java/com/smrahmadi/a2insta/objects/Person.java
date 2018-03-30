package com.smrahmadi.a2insta.objects;

import android.graphics.Bitmap;

/**
 * Created by lincoln on 3/21/18.
 */

public class Person  {

    private String userId ;
    private String name ;
    private String bio ;
    private Bitmap profileImage;
    private double followersCount;
    private double followingCount;
    private int postCount;

    public Person(String userId, String name, String bio, Bitmap profileImage, double followersCount, double followingCount, int postCount) {
        this.userId = userId;
        this.name = name;
        this.bio = bio;
        this.profileImage = profileImage;
        this.followersCount = followersCount;
        this.followingCount = followingCount;
        this.postCount = postCount;
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

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Bitmap getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(Bitmap profileImage) {
        this.profileImage = profileImage;
    }

    public double getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(double followersCount) {
        this.followersCount = followersCount;
    }

    public double getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(double followingCount) {
        this.followingCount = followingCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public void setPostCount(int postCount) {
        this.postCount = postCount;
    }
}
