package com.t3ch.shaj.android_customspinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.ContentHandler;

/**
 * Created by Shakil Ahmed Shaj on 9/21/2018
 */

public class CustomAdapter extends BaseAdapter {

    private String[] planetNames;
    private String[] diameter;
    int[] planets;
    Context context;
    private LayoutInflater inflater;

    public CustomAdapter(Context context, int[] planets, String[] planetNames, String[] diameter) {
        this.planetNames = planetNames;
        this.diameter = diameter;
        this.planets = planets;
        this.context = context;
    }

    @Override
    public int getCount() {
        return planetNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.sample_layout, null, false);
        }

        ImageView imageView = convertView.findViewById(R.id.planetImageID);
        TextView diameterTextView = convertView.findViewById(R.id.diameter_ID);
        TextView planetNameTextView = convertView.findViewById(R.id.planetName_ID);

        imageView.setImageResource(planets[position]);
        diameterTextView.setText(diameter[position]);
        planetNameTextView.setText(planetNames[position]);


        return convertView;
    }
}
