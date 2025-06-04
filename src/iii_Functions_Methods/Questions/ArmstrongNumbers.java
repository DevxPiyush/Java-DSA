package Package.functions_methods.Questions;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    System.out.println(isArmstrong(n));
        for (int i = 100; i < 1000 ; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        if (sum == original){
            return true;
        }
        return false;
    }
}
// armstrong number
/* example - 153
* armstrong number of 153 is
* cube of 1 + cube of 5 + cube of 3 = 153
* if addition = provided number then the digit is armstrong digit
* */
