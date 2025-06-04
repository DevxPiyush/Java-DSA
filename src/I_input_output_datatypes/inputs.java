package lecture_1;

import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your roll number");
        int rollno = input.nextInt();
        System.out.println("your roll no is "+ rollno);
        int a = 234_000_000;
        System.out.println(a); // op = 234000000
        //String name = input.nextLine();
        //System.out.println(name);
    }
}
