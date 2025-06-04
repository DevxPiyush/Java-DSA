import java.util.Scanner;

public class nestedswitchcase {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int empID = sc.nextInt();
    String department = sc.next();

    switch (empID) {
        case 1:
            System.out.println("piyush agroya");
        break;
        case 2:
        System.out.println("Nandini Jambhulkar");
        break;
        case 3:
        System.out.println(" employ number 3");
        switch (department) {
            case "IT":
                System.out.println(" it department");
                break;
            case "cse":
            System.out.println("CSE Department");
            case "Management":
            System.out.println("management department");
            break;
            default:
            System.out.println(" enter proper department");
            break;
        }
        default:
        break;
    }
}
}
