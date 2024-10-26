/*
 * Definition: Method overriding occurs when a subclass provides a specific implementation
 *  of a method that is already defined in its superclass.
 * Purpose: It allows a subclass to customize  method inherited from the parent class.
 * Real-Time Example: In a Bank system, there could be a BankAccount class with a getInterestRate
 *  method. Each subclass (e.g., SavingsAccount, CurrentAccount) may override this method to provide
 *  different interest rates.
 * 
 * 
 * 
 */

class BankAccount {
    public double getInterestRate() {
        return 0.0;
    }
} 

class SavingsAccount extends BankAccount {
    @Override
    public double getInterestRate() {
        return 2.2;
    }
}

class CurrentAccount extends BankAccount {
    public double getInterestRate() {
        return 3.0;
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

        BankAccount savings = new CurrentAccount();
        BankAccount current = new SavingsAccount();

        /*
         * BankAccount is the superclass, and CurrentAccount and SavingsAccount are subclasses.
         *  In Java, it’s allowed to assign a subclass instance to a superclass reference because 
         * a CurrentAccount is a BankAccount and a SavingsAccount is a BankAccount 
         * (known as IS-A relationship).
         * 
         * for dynamic method dispatch (Polymorphism)
         * 
         * provides flexibility by using Polymorphism
         * 
         * 
         */

        System.out.println("Savings Account Interest Rate: " + savings.getInterestRate() + "%");
        System.out.println("Current Account Interest Rate: " + current.getInterestRate() + "%");
    }

}