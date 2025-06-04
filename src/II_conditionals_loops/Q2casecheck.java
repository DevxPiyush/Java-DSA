import java.util.Scanner;
/*Question to check if the input is Lowercase or Uppercase*/
public class Q2casecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        // trimm here trims or removes the unnecessary spaces from the input
        // charAt(0) is used to get the first character of the input
        if (ch>='a' && ch<='z') {
          System.out.println("Letter is lowercase");  
        }
        else {
            System.out.println("The provided letter is uppercase");
        }
    }
}
