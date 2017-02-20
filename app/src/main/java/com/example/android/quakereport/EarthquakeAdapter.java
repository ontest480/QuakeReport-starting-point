package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by root on 2/18/2017.
 */
public class EarthquakeAdapter extends ArrayAdapter<Earthquake>{

    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes) {
        super(context,0, earthquakes);

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            }


        Earthquake currentEarthquake = getItem(position);

        TextView magnitudeview = (TextView) listItemView.findViewById(R.id.magnitudeshape);
        magnitudeview.setText(currentEarthquake.getmMagnitude());

        TextView locationview = (TextView)listItemView.findViewById(R.id.location);
        locationview.setText(currentEarthquake.getmLocation());



        TextView dateview = (TextView)listItemView.findViewById(R.id.date);
        dateview.setText(currentEarthquake.getmDate());

        TextView timeview = (TextView)listItemView.findViewById(R.id.time);




        return listItemView;
    }
}
