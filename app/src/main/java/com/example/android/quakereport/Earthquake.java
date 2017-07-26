package com.example.android.quakereport;

/**
 * Created by ZhengHong on 22/07/2017.
 */

public class Earthquake {
    // Location of the earthquake
    private String mLocation;

    // Magnitude of the earthquake
    private double mMagnitude;

    // Date of the earthquake
    private long mTimeInMilliseconds;

    // Website URl of the earthquake
    private String mURL;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude          is the magnitude of the earthquake.
     * @param location           is the city of the earthquake.
     * @param timeInMilliseconds is the time in milliseconds when the earthquake happened.
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mURL = url;
    }

    /**
     * Returns the magnitude of the earthquake.
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Returns the location of the earthquake.
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website url that has more information about the earthquake.
     */
    public String getURL() { return mURL; }
}
