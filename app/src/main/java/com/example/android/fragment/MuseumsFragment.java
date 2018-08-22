package com.example.android.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.tourguide.Location;
import com.example.android.tourguide.LocationAdapter;
import com.example.android.tourguide.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> locationInfo = new ArrayList<Location>();
        locationInfo.add(new Location(getString(R.string.museumEgyptian), getString(R.string.museumEgyptianInfo)));
        locationInfo.add(new Location(getString(R.string.museumCoptic), getString(R.string.museumCopticInfo)));
        locationInfo.add(new Location(getString(R.string.museumAbdeen), getString(R.string.museumAbdeenInfo)));
        locationInfo.add(new Location(getString(R.string.museumManial), getString(R.string.museumManialInfo)));
        locationInfo.add(new Location(getString(R.string.museumPyramids), getString(R.string.museumPyramidsInfo)));
        locationInfo.add(new Location(getString(R.string.museumTower), getString(R.string.museumTowerInfo)));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locationInfo, R.color.white, false);

        ListView lv = rootView.findViewById(R.id.location_list);
        lv.setAdapter(locationAdapter);

        return rootView;
    }
}
