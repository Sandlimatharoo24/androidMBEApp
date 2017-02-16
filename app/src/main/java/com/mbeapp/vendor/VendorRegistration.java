package com.mbeapp.vendor;

import android.app.Activity;
import android.os.Bundle;

import mbe.com.mbeapp.R;

/**
 * Created by Sandli on 14-02-2017.
 */
public class VendorRegistration extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor_registeration);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}
