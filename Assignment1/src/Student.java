class InvalidPaymentException extends Exception {
    public InvalidPaymentException(String message) {
        super(message);
    }
}

public abstract class Student {
    String student_id;
    String name;
    String programm_name;
    double amount_paid ;

    Student(String student_id, String name, String programm_name, double amount_paid){
        this.student_id = student_id;
        this.name = name;
        this.programm_name = programm_name;
        this.amount_paid = amount_paid;
    }

    // abstract class
    abstract double calculateTutionFee();

    // Calculate outstanding balance
    double calculateBalance() {
        return calculateTutionFee() - amount_paid;
    }


    // payment processing
    void makePayment(double payment) throws InvalidPaymentException{
        try {
            if (payment <= 0) {
                throw new InvalidPaymentException("Payment must be greater than zero");
            }

            if (payment > calculateBalance()) {
                throw new InvalidPaymentException("Payment exceeds the outstanding balance.");
            }

            // Update amount paid
            amount_paid += payment;

            System.out.println("Payment successfully");
            System.out.println("Student Id: " + student_id);

            System.out.println("Payment Amount: " + payment);

            System.out.println("Total amount paid: " + amount_paid);
            System.out.println("Remaining Balance: " + calculateBalance());
        } catch (InvalidPaymentException e){
            System.out.println("Payment Failed");
            System.out.println("error: " + e.getMessage());
        }
        finally {
            System.out.println("Transaction completed.");
        }
    }



    // display information
    void display() throws InvalidPaymentException {
        System.out.println("Student id: " + student_id);
        System.out.println("Student name: " + name);
        System.out.println("Program Name: " + programm_name);

        System.out.println("Amount Paid: " + amount_paid);
        System.out.println("Tuition Fee: " + calculateTutionFee());
        System.out.println("Balance: " + calculateBalance());
        System.out.println();
    }
}

// sub classes
class UndergraduateStudent extends Student{
    double credit_hourse;

    UndergraduateStudent(String student_id, String name,double amount_paid, double credit_hourse) throws InvalidPaymentException {
        super(student_id, name, "Undergraduate", amount_paid);
        this.credit_hourse = credit_hourse;
        if (credit_hourse <0){
            throw  new IllegalArgumentException("Credit hourse can not accept negative");
        }
    }
    @Override
    double calculateTutionFee() {
        return credit_hourse * 25;
    }

}

class MasterStudent extends Student{
    double semester_fee;
//    double research_fee;

    MasterStudent(String student_id, String name, String programm_name, double amount_paid, double semester_fee, double research_fee) throws InvalidPaymentException {
        super(student_id, name, programm_name, amount_paid);
        this.semester_fee = semester_fee;

        if (semester_fee <0){
            throw  new IllegalArgumentException("Credit hourse can not accept negative");
        }

    }

    @Override
    double calculateTutionFee() {
        return semester_fee + 100;
    }

}

class DiplomaStudent extends Student{
    int number_of_courses;

    DiplomaStudent(String student_id, String name, String programm_name, double amount_paid, int number_of_courses) throws InvalidPaymentException {
        super(student_id, name, programm_name, amount_paid);
        this.number_of_courses = number_of_courses;

        if (number_of_courses <0){
            throw  new IllegalArgumentException("Credit hourse can not accept negative");
        }
    }

    @Override
    double calculateTutionFee() {
        return number_of_courses * 40;
    }
}
class Mainss{
    public static void main(String[] args) throws InvalidPaymentException {


        try{

            Student [] s = {
                    new UndergraduateStudent("U577", "Said-Omar", 100, 10),
                    new UndergraduateStudent("U578", "Ahmed Cabdullahi", 300, 30),

                    new MasterStudent("M111", "Ali ciise", "Data Analysis", 500, 1200, 900),
                    new MasterStudent("M222", "Xasan Faarax", "AI and Machine Learning", 1500, 2000, 1000),

                    new DiplomaStudent("D333", "Rahmo Cali", "Diploma of multimedia", 80, 5),
                    new DiplomaStudent("D444", "Fardowso Cabdi", "Diploma Of Photograph", 50, 2),
            };

            // display all
            for (Student std : s){
                std.display();
                System.out.println("");
            }

        } catch (IllegalArgumentException e){
            System.out.println("error: " + e.getMessage());
        }
        finally {
            System.out.println("Transaction completed.");
        }

        //






    }
}

