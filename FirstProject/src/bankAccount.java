class bankAccount{
    private String accountNumber;
    protected double balance;

    //CONSTRUCTOR (((((

//            bankAccount(String accountNumber, double balance){
//                this.accountNumber = accountNumber;
//                this.balance = balance;
//            }

                //ABSTRACT
//                      abstract void withdraw(double amount);
//

//            void withdraw(double amount){
//                if(amount > balance) refuse("not enough money");
//                else balance -= amount;
//            }
//
//            void refuse(String why){
//                System.out.println(" " +accountNumber + "refused" + why);
//            }
//
//            void show(){
//                System.out.println(" " + accountNumber + " Balance $" +balance);
//            }

    // )))))))




    // USING GETTERS AND SETTERS
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("amount cannot lest than 0.");
            return;
        }
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}