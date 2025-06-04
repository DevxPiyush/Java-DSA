

public class conditional2 {
    public static void main(String[] args) {
        int salary = 53000;
        if (salary>10000) {
            salary+=2000;
            System.out.println(salary);
        }
        else if (salary>20000) {
            salary+=5000;
            System.out.println(salary);
        }
        else {
            System.out.println("no bonus");

        }
    }
}
