package com.telpa.ecommerce.models;

import java.util.Date;

/**
 * Created by Gizem İlgar on 1.8.2016.
 */
public class Comment {
    private int rating;
    private Date date;
    private String userName;
    private String comment;

    public Date getTime() {
        return date;
    }

    public void setTime(Date date) {
        this.date = date;
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
