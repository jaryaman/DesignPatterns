package com.jaryaman;

public class EncapsulationExample {
    public static void main() {
        var account = new Account();
        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());
    }
}
