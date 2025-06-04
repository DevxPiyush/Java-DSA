import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        // Q: Print numbers from 1 to 5
       for (int i = 1; i <= 30; i++) {
        System.out.println(i);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int j = 0; j < n; j++) {
            System.out.println("hello world");
        }
       }
    }
} 