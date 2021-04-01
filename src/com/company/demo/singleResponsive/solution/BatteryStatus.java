package com.company.demo.singleResponsive.solution;

public class BatteryStatus {
    public int timeToUse(PhoneBattery phoneBattery){
        // a is variable to get remain time to use of this phone device
        int a = phoneBattery.getCurrentBattery() / 600;
        return  a;
    }
}
