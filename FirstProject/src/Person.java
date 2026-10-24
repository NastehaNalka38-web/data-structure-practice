public class Person {
    protected String name;
    protected String  id;

    //CONSTRUCTOR ((((
//            Person(String name){
//                this.name = name;
//                System.out.println("1. person" + name);
//            }
    //)))))))

    //SETTER METHOD
    public void setDetails(String name, String id){
        this.name = name;
        this.id = id;
    }

    public String describe(){
        return name + " ( " + id + ")" ;
    }
}
