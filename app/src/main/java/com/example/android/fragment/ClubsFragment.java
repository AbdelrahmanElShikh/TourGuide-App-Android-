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
public class ClubsFragment extends Fragment {

    public ClubsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> locationInfo = new ArrayList<Location>();
        locationInfo.add(new Location(getString(R.string.clubAhly), getString(R.string.clubAhlyAddress), R.drawable.ahli));
        locationInfo.add(new Location(getString(R.string.clubMkasa), getString(R.string.clubbMkasaAddress), R.drawable.misr_el_makasa_logo));
        locationInfo.add(new Location(getString(R.string.clubDegla), getString(R.string.clubDeglaAddress), R.drawable.wadidegla));
        locationInfo.add(new Location(getString(R.string.clubEnpi), getString(R.string.clubEnpiAddress), R.drawable.enpi));
        locationInfo.add(new Location(getString(R.string.clubIsmaily), getString(R.string.clubIsmailyAddress), R.drawable.ismaily));
        locationInfo.add(new Location(getString(R.string.clubSmouha), getString(R.string.clubSmouhaAddress), R.drawable.smouha));
        locationInfo.add(new Location(getString(R.string.clubGouna), getString(R.string.clubGounaAddress), R.drawable.el_gouna_logo));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locationInfo, R.color.white, false);

        ListView lv = rootView.findViewById(R.id.location_list);
        lv.setAdapter(locationAdapter);
        return rootView;
    }
}
