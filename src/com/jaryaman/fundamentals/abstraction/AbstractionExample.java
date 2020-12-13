package com.jaryaman.fundamentals.abstraction;

public class AbstractionExample {
    public static void main(){
        var mail = new MailService();
        // the only available method -- this is the point for abstraction
        // We don't want our users to worry about how to send an email in order to send an email
        mail.sendEmail();
    }
}
