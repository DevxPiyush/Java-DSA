import java.util.Scanner;

public class Q6calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // take input from user until user doesn't press X or x

        System.out.print("enter the operator ");
        while (true) {
            // take operator as input
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '%') {
                // input two numbers
                System.out.print("Enter the number 1 ");
                int num1 = in.nextInt();
                System.out.print("Enter the number 2 ");
                int num2 = in.nextInt();

                if (op == '+') {
                    System.out.println(" the addition is " + (num1 + num2));
                }
                if (op == '-') {
                    System.out.println("the substraction is" + (num1 - num2));
                }
                if (op == '*') {
                    System.out.println(num1 * num2);
                }
                if (op == '/') {
                    if (num2!=0) {
                        System.out.println(num1 / num2);
                    }
                }
                if (op == '%') {
                    System.out.println(num1 % num2);
                }
            }
        }
    }
}
