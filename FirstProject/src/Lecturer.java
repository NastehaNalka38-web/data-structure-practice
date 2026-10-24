public class Lecturer extends Person{
    private String faculty;

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public String staffCard(){
        return "lecturer " + name + "( " + id + " ) " + faculty;
    }
}
