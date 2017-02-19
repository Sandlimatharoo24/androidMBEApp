package com.mbeapp.customer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import mbe.com.mbeapp.R;

/**
 * Created by Sandli on 19-02-2017.
 */
public class CustomerListAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;

    public CustomerListAdapter(Context context, String[] values) {
        super(context, -1, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.activity_customer_home_rowadapter, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.firstLine);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        textView.setText(values[position]);
        // change the icon for Windows and iPhone
        String s = values[position];
       /* if (s.startsWith("iPhone")) {
            imageView.setImageResource(R.d);
        } else {
            imageView.setImageResource(R.drawable.ok);
        }
*/
        return rowView;
    }
}