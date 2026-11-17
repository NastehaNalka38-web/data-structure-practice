public class Main {
    public static void main(String[] args) {

        Registration r1 = new Registration("Ahmed");

        r1.addCourse("CA101");
        r1.addCourse("CA102");
        r1.addCourse("CA103");

        r1.undoLastCourse();
        r1.undoLastCourse();
    }
}