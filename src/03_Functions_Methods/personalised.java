package Package.functions_methods;

public class personalised {
    public static void main(String[] args) {
    String personalised = myGreet("Nandini Jambhulkar");
    System.out.println(personalised);
    }
    static String myGreet(String name) {
        String message = " Hello" + name;
        return message;
    }
}
