class SavingsAccount extends BankAccount {

    SavingsAccount(String n, double b) {
        super(n, b);
    }

    @Override
    void withdraw(double amount) {

        if (balance - amount < 50)
            refuse("must keep at least 50");
        else
            balance -= amount;
    }
}