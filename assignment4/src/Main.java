public class Main {
    public static void main(String[] args) {

        Reverser r1 = new Reverser();

        String result = r1.reverse("HELLO");

        System.out.println("Original String: HELLO");
        System.out.println("Reversed String: " + result);
    }
}