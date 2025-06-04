public class while_dowhileloop {
    public static void main(String[] args) {
       
        /* syntax of for loop
       
        while( condition){
        //body of code
        }
       
        */
        int num = 1;
        while (num<=5) {
            System.out.println(num);
            num++;
        }

        /* syntax of do while loop

         * do{
         * // body
         * } while(condition);
         
        */
        int jkl = 1;
        do {
            System.out.println(jkl);
            jkl++;
        } while (jkl<=10);
    }
}
// When to use while and when to use for?
/*while - when you dont know how many times
 the loop is going to run*/
/* for loop is for known resources and how many times the loop will run */

// what's the difference between do while and while loop?
/* in do while loop - the loop will execute atleast once 
 * eventhough the condition isn't meet in while but the do part
 will occur */