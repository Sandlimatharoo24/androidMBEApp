package com.mbeapp.utils;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/**
 * Created by Sandli on 16-02-2017.
 */
public class Utility {

    /**
     * Hides the soft keyboard
     */
    public static void hideSoftKeyboard(Context context) {
       /* if(getCurrentFocus()!=null) {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(INPUT_METHOD_SERVICE);
            inputMethodManager.hideSoftInputFromWindow(context.getCurrentFocus().getWindowToken(), 0);
        }*/
    }

    /**
     * Shows the soft keyboard
     */
    public static void showSoftKeyboard(View view, Context context) {
      /*  InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(INPUT_METHOD_SERVICE);
        view.requestFocus();
        inputMethodManager.showSoftInput(view, 0);*/
    }
}
