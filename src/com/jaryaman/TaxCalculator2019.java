package com.jaryaman;

public class TaxCalculator2019 implements TaxCalculator {
    @Override
    public float calculateTax() {
        return 1;
    }

    /*
    Since we've implemented this class as an implementation of an interface, we are free to make changes to it
    and not impact the main method
    */
    public float calculateInsurance(){
        return 0;
    }
}
