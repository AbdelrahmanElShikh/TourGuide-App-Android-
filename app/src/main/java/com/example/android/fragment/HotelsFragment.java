package com.example.android.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.tourguide.HotelActivity;
import com.example.android.tourguide.Location;
import com.example.android.tourguide.LocationAdapter;
import com.example.android.tourguide.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locationInfo = new ArrayList<Location>();
        locationInfo.add(new Location(getString(R.string.hotelRamsesHilton), getString(R.string.hotelRamsesHiltonInfo), R.drawable.hiltonramses));
        locationInfo.add(new Location(getString(R.string.hotelConradCairo), getString(R.string.hotelConradCairoInfo), R.drawable.conrad));
        locationInfo.add(new Location(getString(R.string.hotelHeliopolis), getString(R.string.hotelRamsesHiltonInfo), R.drawable.helioplestower));
        locationInfo.add(new Location(getString(R.string.hotelPyramids), getString(R.string.hotelPyramidsInfo), R.drawable.hiltonpyramids));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locationInfo, R.color.white, true);

        ListView lv = rootView.findViewById(R.id.location_list);
        lv.setAdapter(locationAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent i = new Intent(getActivity(), HotelActivity.class);
                i.putExtra(getString(R.string.name), locationInfo.get(position).getLocationName());
                i.putExtra(getString(R.string.image), locationInfo.get(position).getLocationImageId());
                i.putExtra(getString(R.string.info), locationInfo.get(position).getLocationInfo());
                startActivity(i);
            }
        });
        return rootView;
    }
}
