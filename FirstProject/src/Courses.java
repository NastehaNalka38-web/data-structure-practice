public class Courses {
    int sub1;
    int sub2;
    int sub3;

    Courses(int cSub1, int cSub2, int cSub3){
        sub1 = cSub1;
        sub2 = cSub2;
        sub3 = cSub3;
    }

    void  printCourse(){
        System.out.println("subject1: " + sub1 + "\nsubject2: "+ sub2 + "\nsubject3: "+sub3);
    }
}
