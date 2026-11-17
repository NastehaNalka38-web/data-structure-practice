class StudentAccount extends BankAccount {

    StudentAccount(String n, double b) {
        super(n, b);
    }

    @Override
    void withdraw(double amount) {
        if (amount > 100)
            refuse("max 100 per withdrawal");
        else if (amount > balance)
            refuse("not enough money");
        else
            balance -= amount;
    }
}