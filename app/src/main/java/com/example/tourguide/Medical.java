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

public class Medical extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_list, container, false);

        final ArrayList<CustomObject> customObjectArrayList=new ArrayList<CustomObject>();

        customObjectArrayList.add(new CustomObject(R.drawable.kharga_oasis, R.string.Kharga_Oasis, R.string.DKharga_Oasis));
        customObjectArrayList.add(new CustomObject(R.drawable.bahariya_oasis,R.string.Bahariya_Oasis,R.string.DBahariya_Oasis));
        customObjectArrayList.add(new CustomObject(R.drawable.aswan_city,R.string.Aswan_City,R.string.DAswan_City));
        customObjectArrayList.add(new CustomObject(R.drawable.siwa_oasis,R.string.Siwa_Oasis,R.string.DSiwa_Oasis));
        customObjectArrayList.add(new CustomObject(R.drawable.ras_sedr,R.string.Ras_Sedr,R.string.DRas_Sedr));
        ObjectAdapter adapter = new ObjectAdapter(getActivity(), customObjectArrayList);

        ListView listView = (ListView) view.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return view;
    }
}