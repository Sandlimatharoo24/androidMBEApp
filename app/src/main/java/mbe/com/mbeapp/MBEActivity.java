package mbe.com.mbeapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.mbeapp.customer.CustomerHome;
import com.mbeapp.customer.CustomerRegisteration;

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
        button_customer_submit.setOnClickListener(this);
        button_vendor_submit.setOnClickListener(this);
        textView_customer_registerhere.setOnClickListener(this);
        textView_vendor_registerhere.setOnClickListener(this);
        textView_customer_forgotpassword.setOnClickListener(this);
        textView_vendor_forgotpassword.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.activity_mbe_customer_submitbutton:
                Intent intent_customer_home=new Intent(this,CustomerHome.class);
                startActivity(intent_customer_home);
                finish();
                //Toast.makeText(this.getApplicationContext(),"Work in progress",Toast.LENGTH_SHORT).show();
                break;
            case R.id.activity_mbe_vendor_submitbutton:
                Toast.makeText(this.getApplicationContext(),"Work in progress",Toast.LENGTH_SHORT).show();
                break;
            case R.id.activity_mbe_customer_registerhere:
                Intent intent_customer_registration=new Intent(this,CustomerRegisteration.class);
                startActivity(intent_customer_registration);
                finish();
                break;
            case R.id.activity_mbe_vendor_registerhere:
                Intent intent_vendor_registration=new Intent(this,CustomerRegisteration.class);
                startActivity(intent_vendor_registration);
                finish();
                break;
            case R.id.activity_mbe_customer_forgot_password:
                Toast.makeText(this.getApplicationContext(),"Work in progress",Toast.LENGTH_SHORT).show();
                break;
            case R.id.activity_mbe_vendor_forgotpassword:
                Toast.makeText(this.getApplicationContext(),"Work in progress",Toast.LENGTH_SHORT).show();
            break;


        }
    }
}
