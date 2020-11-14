package com.jaryaman; // a namespace

public class InterfaceExample {
    /*
     * An interface is a contract specifying a set of methods, fields, and properties which will be available on any
     * implementing object of a class. This allows us to *decouple* elements of our system.
     *
     * In this example, we make a TaxCalculator interface, which specifies the signature of any implementation of a
     * TaxCalculator
     * */

    // public = accessible anywhere in the codebase
    // static = method can be called directly in InterfaceExample without making an instance of the class
    // void = return type
    public static void main() { // a method

        TaxCalculator calculator = getCalculator(); // creates a coupling to the interface getCalculator()
        /*
         * As long as we keep the *signature* of calcuateTax the same, changes to how we implement any single
         * implementation will not require recompilation of other classes. Each implementation is loosely coupled
         */
        calculator.calculateTax();

    }

    /*
     * A lightweight class which just returns the implementation of TaxCalculator that we want. In a real enterprise
     * application we would use a dependency injection framework to give real implementations of an interface so that
     * you don't have to e.g. recompile Main every time you make a change to a dependency
     * */
    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }
}
