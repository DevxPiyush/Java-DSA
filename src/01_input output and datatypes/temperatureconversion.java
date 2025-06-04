package lecture_1;
import java.util.Scanner;
public class temperatureconversion {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the temperature (in celcius) ");
    float celcius = sc.nextInt();
    float farenheit = (celcius * 9/5) + 32 ;
    System.out.print("The temperature in farenheit is " + farenheit);
    }
}
