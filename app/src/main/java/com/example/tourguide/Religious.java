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

public class Religious extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_list, container, false);

        final ArrayList<CustomObject> customObjectArrayList=new ArrayList<CustomObject>();

        customObjectArrayList.add(new CustomObject(R.drawable.temple_of_medinat_habu, R.string.Medinet_Habu, R.string.DMedinet_Habu));
        customObjectArrayList.add(new CustomObject(R.drawable.st_catherines_monastery,R.string.St_Catherines_Monastery,R.string.DSt_Catherines_Monastery));
        customObjectArrayList.add(new CustomObject(R.drawable.mosque_and_madrasa_of_sultan_hassan,R.string.Mosque_and_Madrasa_of_Sultan_Hassan,R.string.DMosque_and_Madrasa_of_Sultan_Hassan));
        customObjectArrayList.add(new CustomObject(R.drawable.temple_of_philae,R.string.Philae_Temple,R.string.DPhilae_Temple));
        customObjectArrayList.add(new CustomObject(R.drawable.mosque_of_muhammad_ali,R.string.Mosque_of_Muhammad,R.string.DMosque_of_Muhammad));
        ObjectAdapter adapter = new ObjectAdapter(getActivity(), customObjectArrayList);

        ListView listView = (ListView) view.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return view;
    }
}