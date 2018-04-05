package com.smrahmadi.a2insta.object;

import java.util.ArrayList;

public class Story {

   private String userId ;
   private String name ;
   private String imageProfile;
   private ArrayList<String> imagesOrVideoUrl ;

    public Story(String userId, String name, String imageProfile, ArrayList<String> imagesOrVideoUrl) {
        this.userId = userId;
        this.name = name;
        this.imageProfile = imageProfile;
        this.imagesOrVideoUrl = imagesOrVideoUrl;
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

    public String getImageProfile() {
        return imageProfile;
    }

    public void setImageProfile(String imageProfile) {
        this.imageProfile = imageProfile;
    }

    public ArrayList<String> getImagesOrVideoUrl() {
        return imagesOrVideoUrl;
    }

    public void setImagesOrVideoUrl(ArrayList<String> imagesOrVideoUrl) {
        this.imagesOrVideoUrl = imagesOrVideoUrl;
    }
}
