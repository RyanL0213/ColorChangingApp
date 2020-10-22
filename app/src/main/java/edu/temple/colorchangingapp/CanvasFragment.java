package edu.temple.colorchangingapp;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class CanvasFragment extends Fragment {

    /* // TODO: Rename parameter arguments, choose names that match
     // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
     private static final String ARG_PARAM1 = "param1";
     private static final String ARG_PARAM2 = "param2";

     // TODO: Rename and change types of parameters
     private String mParam1;
     private String mParam2;

     */
    TextView textview;
    View l;




    /*
    public static CanvasFragment newInstance(String param1, String param2) {
        CanvasFragment fragment = new CanvasFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    */

    public CanvasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        l = inflater.inflate(R.layout.fragment_canvas, container, false);
        textview = l.findViewById(R.id.textView2);


        return l;
    }

    public void changename(int reference) {
        //l.setBackgroundColor(Color.BLUE);
        Resources res = getResources();
        String[]colorarray = res.getStringArray(R.array.color_array);

        switch (reference) {
            case 0:
                textview.setText(colorarray[0]);
                l.setBackgroundColor(Color.RED);
                break;
            case 1:
                textview.setText(colorarray[1]);
                l.setBackgroundColor(Color.BLACK);
                break;
            case 2:
                textview.setText(colorarray[2]);
                l.setBackgroundColor(Color.BLUE);
                break;
            case 3:
                textview.setText(colorarray[3]);
                l.setBackgroundColor(Color.CYAN);
                break;
            case 4:
                textview.setText(colorarray[4]);
                l.setBackgroundColor(Color.DKGRAY);
                break;
            case 5:
                textview.setText(colorarray[5]);
                l.setBackgroundColor(Color.WHITE);
                break;
            case 6:
                textview.setText(colorarray[6]);
                l.setBackgroundColor(Color.GREEN);
                break;
            case 7:
                textview.setText(colorarray[7]);
                l.setBackgroundColor(Color.LTGRAY);
                break;
            case 8:
                textview.setText(colorarray[8]);
                l.setBackgroundColor(Color.MAGENTA);
                break;
            case 9:
                textview.setText(colorarray[9]);
                l.setBackgroundColor(Color.YELLOW);
                break;
            case 10:
                textview.setText(colorarray[10]);
                l.setBackgroundColor(Color.rgb(0,120,255));
                break;
            case 11:
                textview.setText(colorarray[11]);
                l.setBackgroundColor(Color.rgb(255,150,100));
                break;

            default:
                break;
        }
    }
}