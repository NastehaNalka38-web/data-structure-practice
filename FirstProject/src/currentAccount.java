class currentAccount extends bankAccount{
    private double overdraftLimit = 200;

    //CONSTRUCTOR <<<
//    currentAccount(String n, double b){
//                super(n, b);
//            }
//
//            @Override
//            void withdraw(double amount){
//                if(balance - amount < -200) refuse ("overdraft limit is 200");
//                else balance -= amount;
//            }

    //>>>




    //GETTER AND SETTER METHODS
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
    public double availableBalance(){
        return balance + overdraftLimit;
    }
}