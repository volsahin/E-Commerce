package com.telpa.ecommerce.activities.activityJ_Form;
import java.util.ArrayList;

/**
 * Created by Mert on 11.08.2016.
 */
public interface IScreenJView {

    void onSuccess();
    void onFail();
    void setAdapters(ArrayList<String[]> list);

}
