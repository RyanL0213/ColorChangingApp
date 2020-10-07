package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CanvasActivity extends AppCompatActivity {

    TextView colorname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        Intent getintent = getIntent();

        String colorselected = getIntent().getStringExtra("colorinput");

        View currentLayout = findViewById(R.id.canvaslayout);

        colorname = findViewById(R.id.colorname);
        colorname.setText(colorselected);
       /* if(colorselected.equalsIgnoreCase("Red")){
            currentLayout.setBackgroundColor(Color.RED);

        }
        */
        switch(colorselected){
            case "Red":
                currentLayout.setBackgroundColor(Color.RED);
            break;
            case "Black":
                currentLayout.setBackgroundColor(Color.BLACK);
                break;
            case "Blue":
                currentLayout.setBackgroundColor(Color.BLUE);
                break;
            case "Cyan":
                currentLayout.setBackgroundColor(Color.CYAN);
                break;
            case "Dark Grey":
                currentLayout.setBackgroundColor(Color.DKGRAY);
                break;
            case "White":
                currentLayout.setBackgroundColor(Color.WHITE);
                break;
            case "Green":
                currentLayout.setBackgroundColor(Color.GREEN);
                break;
            case "Light Grey":
                currentLayout.setBackgroundColor(Color.LTGRAY);
                break;
            case "Magenta":
                currentLayout.setBackgroundColor(Color.MAGENTA);
                break;
            case "Yellow":
                currentLayout.setBackgroundColor(Color.YELLOW);
                break;
            case "Light Blue":
                currentLayout.setBackgroundColor(Color.rgb(0,120,255));
                break;
            case "Orange":
                currentLayout.setBackgroundColor(Color.rgb(255,150,100));
                break;
            default:
                break;





        }




    }
}