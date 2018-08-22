package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.fragment.ClubsFragment;
import com.example.android.fragment.FunFragment;
import com.example.android.fragment.HotelsFragment;
import com.example.android.fragment.MuseumsFragment;

/**
 * Created by bodiy_000 on 18-Feb-18.
 */

public class TabAdapter extends FragmentPagerAdapter {

    private String[] tabTitle;

    public TabAdapter(FragmentManager fm, Context c) {
        super(fm);
        tabTitle = c.getResources().getStringArray(R.array.tabTitle);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0)
            return new ClubsFragment();
        else if (position == 1)
            return new MuseumsFragment();
        else if (position == 2)
            return new FunFragment();
        else
            return new HotelsFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitle[position];
    }
}
