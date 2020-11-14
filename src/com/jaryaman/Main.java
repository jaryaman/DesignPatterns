package com.jaryaman;

public class Main {

    public static void main(String[] args){
        /*var interfaceExample = new InterfaceExample();
        interfaceExample.main();*/

        /*var encapsulation = new EncapsulationExample();
        encapsulation.main();*/

        // abstraction example
        var mail = new MailService();
        mail.sendEmail(); // the only available method -- this is the point for abstraction
    }



}
