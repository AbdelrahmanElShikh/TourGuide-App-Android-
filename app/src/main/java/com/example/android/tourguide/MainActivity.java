package com.example.android.tourguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        TabAdapter tabAdapter = new TabAdapter(getSupportFragmentManager(), getApplicationContext());
        viewPager.setAdapter(tabAdapter);
        viewPager.setPageTransformer(true, new ZoomOutPageTransformer());
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
