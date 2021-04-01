package com.company.demo.openclose.violation;

public class Phone {
    private Object chipDevice;
    public void initialize(){
        if(chipDevice instanceof Snapdragon){
            ((Snapdragon) chipDevice).hello();
        }
        else if(chipDevice instanceof A13){
            ((A13) chipDevice).hello();
        }
        throw new Error("I'm not in above");
    }
}
