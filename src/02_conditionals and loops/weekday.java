import java.util.Scanner;

public class weekday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println(" the Day is monday");
                case 2 -> System.out.println("The day is tuesday");
                case 3 -> System.out.println("The day is wednesday");
                case 4 -> System.out.println("The day is thursday");
                case 5 -> System.out.println("The day is friday");
                case 6 -> System.out.println("The day is saturday");
                case 7 -> System.out.println("The day is sunday");
            default -> System.out.println(" enter a valid number");
        }
    }
}
