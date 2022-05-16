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

public class Cultural extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_list, container, false);

        final ArrayList<CustomObject> customObjectArrayList=new ArrayList<CustomObject>();

        customObjectArrayList.add(new CustomObject(R.drawable.temple, R.string.Temple_of_Karnak, R.string.DTemple_of_Karnak));
        customObjectArrayList.add(new CustomObject(R.drawable.the_museum,R.string.Temple_of_Karnak,R.string.DTemple_of_Karnak));
        customObjectArrayList.add(new CustomObject(R.drawable.pyramids,R.string.Pyramids,R.string.DPyramids));
        customObjectArrayList.add(new CustomObject(R.drawable.valley_of_the_kings,R.string.Valley_of_kings,R.string.DValley_of_kings));
        customObjectArrayList.add(new CustomObject(R.drawable.abu_simbel_temple,R.string.Abu_simble,R.string.DAbu_simble));
        ObjectAdapter adapter = new ObjectAdapter(getActivity(), customObjectArrayList);

        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return view;

    }
}