public class Q4countingoccurences {
    // this question counts the occurences of any digit
    public static void main(String[] args) {
        int n = 455555678;
        int count = 0;
        while (n>0) {
            int rem = n % 10;
            if (rem == 5){
                count++;
            }
            n=n/10; // n = n / 10 → Removes the last digit from n to check the next one.
        }
        System.out.println(count);
    }
}

