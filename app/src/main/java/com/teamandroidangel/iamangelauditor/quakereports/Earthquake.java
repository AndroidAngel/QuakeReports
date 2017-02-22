package com.teamandroidangel.iamangelauditor.quakereports;

import static com.teamandroidangel.iamangelauditor.quakereports.R.id.primary_location;

/**
 * Created by iamangelauditor on 2/19/17.
 */

public class Earthquake {

    private String mUrl;

    private Double mMagnitude;

    private String mLocation;

    private long mTimeInMilliseconds;

    public Earthquake(Double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;

    }
    public Double getMagnitude(){
        return mMagnitude;
    }
    public String getLocation(){
        return mLocation;
    }

    public long getTimeInMilliseconds(){
        return mTimeInMilliseconds;
    }
    public String getUrl(){
        return mUrl;
    }
}
