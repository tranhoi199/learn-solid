package com.company.demo.singleResponsive.solution;

public class PhoneBattery {
    private int maxCapacity;
    private int currentBattery;

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getCurrentBattery() {
        return currentBattery;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void setCurrentBattery(int currentBattery) {
        this.currentBattery = currentBattery;
    }

    public int chargingBattery(int unit){
        currentBattery += unit;
        return  currentBattery;
    }


    public int getRemainTime(){
        // example of how to calculate the remain time to use of battery.
        int a = currentBattery / 600;
        return a;
    }
}

