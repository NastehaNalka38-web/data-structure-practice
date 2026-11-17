class CurrentAccount extends BankAccount {

    CurrentAccount(String n, double b) {
        super(n, b);
    }

    @Override
    void withdraw(double amount) {

        if (balance - amount < -200)
            refuse("overdraft limit is 200");
        else
            balance -= amount;
    }
}