package com.jaryaman;

/*
* The idea in abstraction is to hide away complicated implementation details from users
* */

public class MailService {
    public void sendEmail() {
        connect(1);
        authenticate();
        // send email
        disconnect();
    }

    private void connect(int timeout){
        System.out.println("Connect");
    }

    private void disconnect(){
        System.out.println("Disconnect");
    }

    private void authenticate(){
        System.out.println("Authenticate");
    }
}
