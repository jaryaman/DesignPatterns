package com.jaryaman;
// Source: https://www.youtube.com/watch?v=NU_1StN5Tkk&t=694s

import com.jaryaman.fundamentals.abstraction.AbstractionExample;
import com.jaryaman.fundamentals.encapsulation.EncapsulationExample;
import com.jaryaman.fundamentals.inheritance.InheritanceExample;
import com.jaryaman.fundamentals.interfaces.InterfaceExample;
import com.jaryaman.patterns.memento.MementoExample;
import com.jaryaman.fundamentals.polymorphism.PolymorphismExample;
import com.jaryaman.patterns.state.StateExample;

public class Main {

    public static void main(String[] args){
        fundamentals();
        MementoExample.main();
        StateExample.main();
    }

    public static void fundamentals(){
        /*First we cover 4 key Object-orientated principles: abstraction, inheritance, encapsulation, and polymorphism*/
        AbstractionExample.main();
        InterfaceExample.main();  // related to abstraction
        InheritanceExample.main();
        EncapsulationExample.main();
        PolymorphismExample.main();
    }

}
