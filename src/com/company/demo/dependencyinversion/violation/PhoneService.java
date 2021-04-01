package com.company.demo.dependencyinversion.violation;

public class PhoneService {
    private Phone phone1;

    // PhoneService take care of new iPhone. if another phone come, we need to modify code to run this introduce.
    public void introducePhone(){
        this.phone1 = new iPhone();
        phone1.introduce();
    }
}
