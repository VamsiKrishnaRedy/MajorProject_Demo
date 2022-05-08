package com.example.majorproject_demo;

public class DriverAdapter {

   double Lat;
   double Long;

    public DriverAdapter() {
    }

    public DriverAdapter(double lat, double aLong) {
        Lat = lat;
        Long = aLong;
    }

    public double getLat() {
        return Lat;
    }

    public void setLat(double lat) {
        Lat = lat;
    }

    public double getLong() {
        return Long;
    }

    public void setLong(double aLong) {
        Long = aLong;
    }
}
