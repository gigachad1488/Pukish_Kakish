package com.example.pukish_kakish;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class LakeAdapter extends ArrayAdapter<Lake> {
    private LayoutInflater inflater;
    private int layout;
    private List<Lake> lakes;

    public LakeAdapter(Context context, int resource, List<Lake> lak) {
        super(context, resource, lak);
        lakes = lak;
        layout = resource;
        inflater = LayoutInflater.from(context);
    }



    public View getView(int position, View convertView, ViewGroup parent) {

        View view=inflater.inflate(this.layout, parent, false);


        ImageView indas = view.findViewById(R.id.indus20);
        TextView nam = view.findViewById(R.id.servak);
        TextView tehutex1 = view.findViewById(R.id.author);

        Lake laks = lakes.get(position);

        indas.setImageResource(laks.ImageID);
        nam.setText(laks.Name);
        tehutex1.setText(laks.Location);

        return view;
    }

}
