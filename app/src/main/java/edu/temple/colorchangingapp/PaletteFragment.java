package edu.temple.colorchangingapp;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PaletteFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PaletteFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    private static final String ITEM_KEY = "items";


    // TODO: Rename and change types of parameters
    private String [] items;

    ItemPickedInterface parentActivity;

    public PaletteFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof  ItemPickedInterface)
            parentActivity = (ItemPickedInterface) context;
        else
            throw new RuntimeException("Error: no implementation of interface");
    }

    // TODO: Rename and change types and number of parameters
    public static PaletteFragment newInstance(String[] items) {
        PaletteFragment fragment = new PaletteFragment();
        Bundle args = new Bundle();
        args.putStringArray(ITEM_KEY, items);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            items = getArguments().getStringArray(ITEM_KEY);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View l = inflater.inflate(R.layout.fragment_palette, container, false);
        /*ListView listview = l.findViewById(R.id.listview);
        listview.setAdapter(new ArrayAdapter<>((Context)parentActivity,android.R.layout.simple_list_item_1,items));

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                parentActivity.itemPicked(i);
            }
        });

         */
        GridView gridview = l.findViewById(R.id.gridview);

        final GridAdapter adapter = new GridAdapter((Context)parentActivity,items);
        gridview.setAdapter(adapter);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                parentActivity.itemPicked(i);
            }
        });



        return l;
    }

    interface ItemPickedInterface{
        void itemPicked(int index);
    }
}