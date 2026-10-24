public class Main {
    public static void main(String[] args) {
        // SAVING ACCOUNT
        savingAccount saving = new savingAccount();
        saving.setAccountNumber("222");
        saving.deposit(200);
        saving.deposit(-33);

        //CURRENT ACCOUNT
        currentAccount current = new currentAccount();
        current.setAccountNumber("3002");
        current.deposit(190);

        //DISPLAY SAVING ACCOUNT
        System.out.println(saving.getAccountNumber() + "balance $" + saving.getBalance()
        + "( minimum " + saving.getMinimamBalance() + " )");

        //DISPLAY CURRENT ACCOUNT
        System.out.println(current.getAccountNumber() + "balance $" + saving.getBalance() +
                "available overdraft " + current.availableBalance());

        //SAVING ACCOUNT...
        System.out.println("saving is a bank acount" + (saving instanceof bankAccount));
        System.out.println("saving is a Object" + (saving instanceof Object));


        //STUDENT CLASS
        Student Nasteha = new Student();
        Nasteha.setDetails("Nasteha Nalka", "C1240397");
        Nasteha.setGpa(3.9);

        //LECTURER CLASS

        Lecturer Wireless = new Lecturer();
        Wireless.setDetails("Sharmake", "C1950225");
        Wireless.setFaculty("Computer & IT");

        //POST GRADUATE CLASS
        PostGraduate hodan = new PostGraduate();
        hodan.setDetails("Hodan Ali", "P2300117");
        hodan.setGpa(3.8);
        hodan.setThesisTitle("Somali Text Classification");


        //DISPLAY ALL INFORMATIONS
        System.out.println(Nasteha.StudentCard());
        System.out.println(Wireless.staffCard());
        System.out.println(hodan.postGradCard());

        //CONSTRUCTOR CHAINING

//        PostGraduate sowdo = new PostGraduate("sowdo ", 3.8 , "somali NLP");
//        System.out.println(sowdo.card());




//        //OVERRIDING EXAMPLES
//        savingAccount s = new savingAccount("SAV-1", 200);
//        currentAccount c = new currentAccount("CUR-1", 200);
//        studentAccount t = new studentAccount("STD-1", 200);
//
//        //display overriding examples
//        System.out.println("Each Account has 200.");
//        s.withdraw(300);
//        c.withdraw(300);
//        t.withdraw(300);
//
//        System.out.println("student tries to withdraw 80");
//        t.withdraw(80);
//        t.show();
    }
}



