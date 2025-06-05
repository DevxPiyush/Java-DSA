package IV_Array_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class vi_ArrayList {
    public static void main(String[] args) {

        /* ArrayList came into action because:
        * 1. Once you create an array in Java, you cannot change its size.
        * 2. You can store only primitives or one class type in an array:
        * Hence to resolve this cases, arraylist came into action*/

        /* Array List are dynamic in nature, means it grows or shrink at its own need
        * You can store objects, and with the help of Java’s generics, you can create lists of any type.
        * ArrayList also have builtin function unlike array.
        *  */

        // syntax of arraylist: ArrayList<datatype> var_name = new ArrayList<>(Size);

        ArrayList<Integer> roll_no = new ArrayList<>(10);
        roll_no.add(67);
        roll_no.add(67);
        roll_no.add(67);
        roll_no.add(67);
        roll_no.add(67);
        System.out.println(roll_no); // no need of making it into (.tostring) as it internally does everything
    Scanner in = new Scanner(System.in);

    //input
        for (int i = 0; i < 10 ; i++) { // hume size btana pdega vrna infinite loop jayega
            roll_no.add(in.nextInt());
        }
        System.out.println(roll_no);

    // get items from any list
        for (int i = 0; i <10; i++) {
            System.out.println(roll_no.get(i));
        }
    }
}
