package com.smrahmadi.a2insta.objects;

/**
 * Created by lincoln on 3/18/18.
 */

public class Like {

    private String userId ;
    private String name ;

    public Like(String UserId){
        this.userId = userId ;

    }


    public Like(String UserId,String name ){
        this.userId = userId ;
        this.name = name ;

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
}
