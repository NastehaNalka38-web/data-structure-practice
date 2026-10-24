class Student extends Person{

    protected double gpa;

    //STUDENT CONSTRUCTOR (((((

//            Student (String name, double gpa){
//                super(name);
//                this.gpa = gpa;
//                System.out.println("2. student : GPA " + gpa);
//            }

    //)))))))

    //SETTER METHODS
    public void setGpa(double gpa) {
        if(gpa >0 & gpa <=4)
            this.gpa = gpa;
    }
    public String StudentCard(){
        return "student " + describe() + "gpa " + gpa;
    }

}



