package com.company.demo.singleResponsive.solution;

public class ChargeBattery {
    public void chargeDevice(PhoneBattery phoneBattery, int chargeUnit){
        int currentBattery = phoneBattery.getCurrentBattery();
        phoneBattery.setCurrentBattery(currentBattery + chargeUnit);
    }
}
