package com.example.majorproject_demo;

public class Bus_Data1 {
   String BusNo;
   String Password;

    public Bus_Data1() {
    }

    public Bus_Data1(String busNo, String password) {
        BusNo = busNo;
        Password = password;
    }


    public String getBusNo() {
        return BusNo;
    }

    public void setBusNo(String busNo) {
        BusNo = busNo;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
