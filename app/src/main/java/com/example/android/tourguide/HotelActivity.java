package com.example.android.tourguide;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class HotelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
        Intent i = getIntent();
        String hotelNameIntent = i.getStringExtra(getString(R.string.name));
        int hotelImageIntent = i.getIntExtra(getString(R.string.image), 0);
        String hotelInfoIntent = i.getStringExtra(getString(R.string.info));
        ImageView hotelImage = (ImageView) findViewById(R.id.hotelImage);
        TextView hotelName = (TextView) findViewById(R.id.hotelName);
        TextView hotelInfo = (TextView) findViewById(R.id.hotelInfo);
        hotelImage.setImageResource(hotelImageIntent);
        hotelName.setText(hotelNameIntent);
        hotelInfo.setText(hotelInfoIntent);
        hotelImage.getLayoutParams().width = Resources.getSystem().getDisplayMetrics().widthPixels;
        hotelImage.getLayoutParams().height = Resources.getSystem().getDisplayMetrics().heightPixels / 3;

    }
}
