package com.telpa.ecommerce.activities.activityM;

/**
 * Created by musta on 17.08.2016.
 */
public interface IScreenMView {
    void proceedClick();
    void itemUp(int price);
    void itemDown(int price);
    void setTexts(int price,int number);
}
