public class PostGraduate extends Student{
    private String thesisTitle;

    //POST GRAD CONSTRUCTOR (((((
//        PostGraduate(String name, double gpa, String thesisTitle){
//            super(name, gpa);
//            this.thesisTitle = thesisTitle;
//            System.out.println("3. Postgraduate: " + thesisTitle);
//        }
//
//        String card(){
//            return super.describe() + " | " + gpa + " | " + thesisTitle;
//        }
    // ))))))


    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    public String postGradCard(){
        return StudentCard() + ", thesis  \"" + thesisTitle + "\"" ;
    }
}
