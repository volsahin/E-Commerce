package com.telpa.ecommerce.activities.form;
import java.util.ArrayList;

/**
 * Created by Mert on 11.08.2016.
 */
public interface IFormView {

    void onSuccess();
    void onFail();
    void setAdapters(ArrayList<String[]> list);

}
