package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements PaletteFragment.ItemPickedInterface {
   /* GridView gridview;
    ArrayList<String> color;
    String color_select = "";
    */
    String [] colors={"red","yellow","blue","green","1","2","3","4","5","6","7","8"};
    FragmentManager fm;
    CanvasFragment detailsFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm = getSupportFragmentManager();
        detailsFragment = new CanvasFragment();
        fm
                .beginTransaction()
                .add(R.id.container_1,PaletteFragment.newInstance(getResources().getStringArray(R.array.color_array)))
                .add(R.id.container_2,detailsFragment)
                .commit();














       /* Resources res = getResources();
        String[]color = res.getStringArray(R.array.color_array);
        String title = res.getString(R.string.Color_Changing_App);

        getSupportActionBar().setTitle(title);
        gridview = findViewById(R.id.colorgrid);

        /*color = new ArrayList<>();

        color.add("Red");
        color.add("Black");
        color.add("Blue");
        color.add("Cyan");
        color.add("Dark Grey");
        color.add("White");
        color.add("Green");
        color.add("Light Grey");
        color.add("Magenta");
        color.add("Yellow");
        color.add("Light Blue");
        color.add("Orange");




        final BaseAdapter adapter = new GridAdapter(this,color);
        gridview.setAdapter(adapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                color_select = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(MainActivity.this, color_select, Toast.LENGTH_SHORT);
                Intent CanvasActivity = new Intent(MainActivity.this,CanvasActivity.class);
                CanvasActivity.putExtra("colorinput",color_select);
                startActivity(CanvasActivity);



            }
        });

*/

    }

    @Override
    public void itemPicked(int index) {
            detailsFragment.changename(index);
    }
}