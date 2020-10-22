package edu.temple.colorchangingapp;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {
    int colors[];
    Context context;
    String[]color;


    public GridAdapter(Context context, String[] color){
        this.context = context;
        this.color = color;

        colors = new int[12];
        colors[0] = Color.RED;
        colors[1] = Color.BLACK;
        colors[2] = Color.BLUE;
        colors[3] = Color.CYAN;
        colors[4] = Color.DKGRAY;
        colors[5] = Color.WHITE;
        colors[6] = Color.GREEN;
        colors[7] = Color.LTGRAY;
        colors[8] = Color.MAGENTA;
        colors[9] = Color.YELLOW;
        colors[10]= Color.rgb(0,120,255);
        colors[11]= Color.rgb(255,150,100);


    }

    @Override
    public int getCount() {
        return color.length;
    }

    @Override
    public Object getItem(int i) {
        return color[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup){

        TextView textview;
        if(view==null){
            textview = new TextView(context);
            textview.setTextSize(20);
            textview.setPadding(20,20,20,20);
        }
        else
            textview = (TextView)view;

        textview.setText(getItem(i).toString());
        textview.setBackgroundColor(colors[i%colors.length]);

        return textview;
    }
}
