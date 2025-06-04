import java.util.*;

public class weekends {
    public static void main(String[] args) {
 {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println(" weekday");
            case 6, 7 -> System.out.println(" weekends");
            default -> System.out.println(" insert proper value");
        }
        }
    }
}

