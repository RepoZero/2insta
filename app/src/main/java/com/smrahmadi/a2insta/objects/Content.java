package com.smrahmadi.a2insta.objects;

/**
 * Created by lincoln on 3/18/18.
 */

public class Content {

    private String userId ;
    private String postId ;
    private String imageUrl ;
    private boolean isVideo;
    private String videoImage;
    private String videoUrl ;

    public Content(String userId , String postId , String imageUrl,boolean isVideo){

        this.userId=userId;
        this.postId=postId;
        this.imageUrl=imageUrl;
        this.isVideo =isVideo;

    }

    public Content(String userId , String postId , String videoImage , String videoUrl , boolean isVideo){
        this.userId=userId;
        this.postId=postId;
        this.videoImage = videoImage;
        this.videoUrl = videoUrl ;
        this.isVideo = isVideo ;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isVideo() {
        return isVideo;
    }

    public void setVideo(boolean video) {
        this.isVideo = video;
    }

    public String getVideoImage() {
        return videoImage;
    }

    public void setVideoImage(String videoImage) {
        this.videoImage = videoImage;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
