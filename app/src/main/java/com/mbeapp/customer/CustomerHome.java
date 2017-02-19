package com.mbeapp.customer;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import mbe.com.mbeapp.R;

/**
 * Created by Sandli on 16-02-2017.
 */
public class CustomerHome extends Activity implements View.OnClickListener {

    ImageView imageView_home,imageView_subscribe,imageView_profile,imageView_unsubscribe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_home);
        imageView_home=(ImageView)findViewById(R.id.iv_activity_footer_home);
        imageView_subscribe=(ImageView)findViewById(R.id.iv_activity_footer_subscribe);
        imageView_profile=(ImageView)findViewById(R.id.iv_activity_footer_profile);
        imageView_unsubscribe=(ImageView)findViewById(R.id.iv_activity_footer_unsubscribe);
        imageView_home.setOnClickListener(this);
        imageView_subscribe.setOnClickListener(this);
        imageView_profile.setOnClickListener(this);
        imageView_unsubscribe.setOnClickListener(this);


        final ListView listview = (ListView) findViewById(R.id.activity_customer_home_listView);
        String[] values = new String[] { "Item 1", "Item 2", "Item 3"};

       /* final ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < values.length; ++i) {
            list.add(values[i]);
        }*/
        final CustomerListAdapter adapter = new CustomerListAdapter(this,values);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, final View view,
                                    int position, long id) {
                final String item = (String) parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(),"Work in progress",Toast.LENGTH_SHORT).show();
            }

        });
    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.iv_activity_footer_home:
                Toast.makeText(this,"Work In Progress",Toast.LENGTH_SHORT).show();
            break;

            case R.id.iv_activity_footer_subscribe:
                Toast.makeText(this,"Work In Progress",Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_activity_footer_profile:
                Toast.makeText(this,"Work In Progress",Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_activity_footer_unsubscribe:
                Toast.makeText(this,"Work In Progress",Toast.LENGTH_SHORT).show();
                break;

        }
    }

}
