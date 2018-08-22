package com.example.android.tourguide;

/**
 * Created by bodiy_000 on 17-Feb-18.
 */

public class Location {
    private String locationName;
    private String locationInfo;
    private int locationImageId;
    private boolean hasImageLocation = false;

    /*Default Constructor */
    public Location(String locationName, String locationInfo) {
        this.locationName = locationName;
        this.locationInfo = locationInfo;
    }

    /* Constructor for Sport Locations */
    public Location(String clubName, String clubAddress, int imageId) {
        this.locationName = clubName;
        this.locationInfo = clubAddress;
        this.locationImageId = imageId;
        hasImageLocation = true;
    }

    public String getLocationName() {
        return locationName;
    }

    public String getLocationInfo() {
        return locationInfo;
    }

    public int getLocationImageId() {
        return locationImageId;
    }

    public boolean hasImage() {
        return hasImageLocation;
    }
}
