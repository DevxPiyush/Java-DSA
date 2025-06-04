package Package.functions_methods;
// Que: print the sum of 2 numbers
import java.util.Scanner;
public class methodss {
    public static void main(String[] args) {
    sum();
    int ans = sum2();
    System.out.println(ans);
    }
    // return the value
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();
        int sum = num1 + num2 ;
        System.out.println("The sum is" + sum);
        return sum;
        // after return within the same function - no code will execute
    }
    // using void - no return
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt(); // this num1 is not accessible outside this method
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();
        int sum = num1 + num2 ;
        System.out.println("The sum is" + sum);
    }
}
