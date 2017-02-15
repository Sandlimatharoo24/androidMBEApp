package mbe.com.mbeapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Sandli on 13-02-2017.
 */
public class MBEActivity extends Activity implements View.OnClickListener {

    Button button_customer_submit, button_vendor_submit;
    TextView textView_customer_registerhere, textView_customer_forgotpassword, textView_vendor_registerhere, textView_vendor_forgotpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbe);
        button_customer_submit=(Button)findViewById(R.id.activity_mbe_customer_submitbutton);
        button_vendor_submit=(Button)findViewById(R.id.activity_mbe_vendor_submitbutton);
        textView_customer_registerhere=(TextView)findViewById(R.id.activity_mbe_customer_registerhere);
        textView_vendor_registerhere=(TextView)findViewById(R.id.activity_mbe_vendor_registerhere);
        textView_customer_forgotpassword=(TextView)findViewById(R.id.activity_mbe_customer_forgot_password);
        textView_vendor_forgotpassword=(TextView)findViewById(R.id.activity_mbe_vendor_forgotpassword);
    }

    @Override
    public void onClick(View v) {

    }
}
