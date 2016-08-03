package com.telpa.ecommerce.interfaces;

/**
 * Created by Gizem İlgar on 1.8.2016.
 */
public class Comment {
    int rating;
    int time;
    String userName;
    String comment;

    public Comment(int rating, int time, String userName, String comment) {
        this.rating = rating;
        this.time = time;
        this.userName = userName;
        this.comment = comment;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
