package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Leisure extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_list, container, false);

        final ArrayList<CustomObject> customObjectArrayList=new ArrayList<CustomObject>();

        customObjectArrayList.add(new CustomObject(R.drawable.dahab, R.string.Dahab, R.string.DDahab));
        customObjectArrayList.add(new CustomObject(R.drawable.river_nile_cruise,R.string.River_Nile_Cruise,R.string.DRiver_Nile_Cruise));
        customObjectArrayList.add(new CustomObject(R.drawable.red_sea_reef,R.string.Red_Sea_Reef,R.string.DRed_Sea_Reef));
        customObjectArrayList.add(new CustomObject(R.drawable.sharm_el_sheikh,R.string.Sharm_el_Sheikh,R.string.DSharm_el_Sheikh));
        customObjectArrayList.add(new CustomObject(R.drawable.fjord_bay_taba,R.string.Fjord_Bay,R.string.DFjord_Bay));
        ObjectAdapter adapter = new ObjectAdapter(getActivity(), customObjectArrayList);

        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return view;
    }
}