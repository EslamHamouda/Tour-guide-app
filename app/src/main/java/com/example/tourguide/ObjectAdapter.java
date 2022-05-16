package com.example.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ObjectAdapter extends ArrayAdapter<CustomObject> {

    public ObjectAdapter(@NonNull Context context, @NonNull List<CustomObject> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_list, parent, false);
        }
            CustomObject customObject=getItem(position);

            TextView title=(TextView) listItemView.findViewById(R.id.text_tital);
            title.setText(customObject.getmTitle());

            TextView desccriptian=(TextView) listItemView.findViewById(R.id.text_description);
            desccriptian.setText(customObject.getmDescription());

            ImageView imageView=(ImageView) listItemView.findViewById(R.id.image_item);
            imageView.setImageResource(customObject.getmImageResourceId());

        return listItemView;
    }
}
