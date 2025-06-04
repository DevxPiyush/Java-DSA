

import java.util.Scanner;

public class Q1largestnumber {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int a = in.nextInt();
       int b = in.nextInt();
       int c = in.nextInt();
       // int max = a;
// if (b> max) {
//     max = b;
// }
// if (c > max) {
//     max = c;
// }
// System.out.println(max);

/* another way of solving this is  */

if ( a > b && a>c){
    System.out.println(a + "is max");
}
else if (b>a && b>c) {
    System.out.println(b + "is max");
}
else{
    System.out.println(c + " is highest");
}
    }
}
