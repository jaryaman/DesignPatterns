package com.jaryaman;

public class EncapsulationExample {
    public void main() {
        var account = new Account();
        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());
    }
}
