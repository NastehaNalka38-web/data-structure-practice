class savingAccount extends bankAccount{
    double minimamBalance = 50;

    //CONSTRUCTOR <<<<<<

//            savingAccount(String n, double b){
//                super(n, b);
//            }
//
//            @Override
//            void withdraw(double amount){
//                if(balance - amount < 50) refuse ("must keep at least 50");
//                else balance -= amount;
//            }
    //>>>>>


    //WITH GETTER METHOD
    public double getMinimamBalance() {
        return minimamBalance;
    }
}