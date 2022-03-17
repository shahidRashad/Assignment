package com.example.assignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomGrid extends BaseAdapter {

    Context c;
    String [] country;
    int [] countrypic;
    LayoutInflater inflater;


    public CustomGrid(Context applicationContext, String[] country, int[] countrypic) {
        c=applicationContext;
        this.country=country;
        this.countrypic=countrypic;
    }

    @Override
    public int getCount() {
        return country.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        inflater = LayoutInflater.from(c);
        view = inflater.inflate(R.layout.countrycust,null);
        ImageView iv = (ImageView) view.findViewById(R.id.imageView);
        TextView tv = (TextView) view.findViewById(R.id.textView12);
        iv.setImageResource(countrypic[i]);
        tv.setText(country[i]);
        return view;
    }
}
