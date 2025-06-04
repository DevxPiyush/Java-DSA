package lecture_1;
import java.util.*;
public class typecasting {
    public static void main(String[] args) {
        //type casting ( explicit )
        int num = (int) (67.997f);
        System.out.println(num);
        // automatic type promoition in expressions
        int a = 257;
        byte b = (byte)a; //257%256 = 1
        System.out.println(b);
        // op is 1 = bcozmax range of byte is 256 
        //and o/p is remainder of 257 by 256 i.e 1

        byte x = 40;
        byte y = 50;
        byte c = 100;
        int w = x*y/c; // x and y and c are byte but the result is being stored as a int value
        System.out.println(w);
        
        // automatic type conversion
        int noom = 'a';
        System.out.println(noom); // will print the number whose ascii value is a 
    }
}

// java follows unicode value - koi bhi bhasha me print kr skte ho
