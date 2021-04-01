package com.company.demo.dependencyinversion.solution;

@Container
public class PhoneService {
    @Autowired
    private Phone phone1;

    //Let Spring Bean take care of inject value to phone1.
    public void introducePhone(){
        phone1.introduce();
    }
}
