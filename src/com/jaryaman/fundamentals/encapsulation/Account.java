package com.jaryaman.fundamentals.encapsulation;

public class Account {
    private float balance;
    /*
    * Encapsulation: Bundling the data, and methods that operate on the data, into one unit (class) and hiding the
    * values (i.e. the state of the object) inside of the class. This allows us to build robust applications, preventing
    * our objects from going into an invalid state
    * */

    public void deposit(float amount){
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(float amount){
        if (amount <= balance)
            balance -= amount;
    }

    public void setBalance(float balance) {
        if (balance > 0) // this is the point -- suppose our application does not allow a negative balance
            this.balance = balance;
    }

    public float getBalance(){
        return this.balance;
    }
}
