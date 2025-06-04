import java.util.Scanner;

public class usingswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch(fruit){
            case "mango" -> System.out.println("king of fruit");
                case "apple" -> System.out.println(" red sweet fruit");
                case "orange" -> System.out.println("round khatta fruit");
                default -> System.out.println("brabr se choose karle bhai");
            }
        }
    }
// note while using switch case
// 1. cases have to be the same type as expressions, must be a constant or literal
// duplicate cases values are not allowed
// break is used to terminate the sequence 
// if break is not used, it will continue to next case
// default will execute when none of the above does
// if default is not at the end , put break after it 