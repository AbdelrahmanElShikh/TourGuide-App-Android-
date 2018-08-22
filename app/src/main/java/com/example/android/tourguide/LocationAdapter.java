package com.example.android.tourguide;

import android.app.Activity;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by bodiy_000 on 17-Feb-18.
 */

public class LocationAdapter extends ArrayAdapter<Location> {
    private int colorResourceId;
    private boolean displayImageAsListItem;

    public LocationAdapter(Activity context, ArrayList<Location> locations, int colorResourseId, boolean displayImageAsListItem) {
        super(context, 0, locations);
        this.colorResourceId = colorResourseId;
        this.displayImageAsListItem = displayImageAsListItem;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.location_item, parent, false);

        Location current = getItem(position);
        TextView locationName = convertView.findViewById(R.id.name);
        TextView locationInfo = convertView.findViewById(R.id.info);
        TextView imageCaption = convertView.findViewById(R.id.imageCaption);
        ImageView locationImage = convertView.findViewById(R.id.image);
        View textContainer = convertView.findViewById(R.id.container);

        if (!displayImageAsListItem) {
            locationName.setText(current.getLocationName());

            locationInfo.setText(current.getLocationInfo());

            if (current.hasImage()) {
                locationImage.setImageResource(current.getLocationImageId());
                locationImage.setVisibility(View.VISIBLE);
            } else {
                locationImage.setVisibility(View.GONE);
            }

            textContainer.setBackgroundResource(colorResourceId);
            imageCaption.setVisibility(View.GONE);
        } else {
            if (current.hasImage()) {
                locationImage.setImageResource(current.getLocationImageId());
                locationImage.setVisibility(View.VISIBLE);
                locationImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else {
                locationImage.setImageResource(R.drawable.no_image_available);
            }
            textContainer.setVisibility(View.GONE);
            locationImage.getLayoutParams().width = Resources.getSystem().getDisplayMetrics().widthPixels;
            locationImage.getLayoutParams().height = Resources.getSystem().getDisplayMetrics().heightPixels / 3;
            imageCaption.setText(current.getLocationName());
        }
        return convertView;
    }
}

