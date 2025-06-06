package Algorithms.Lin_Search.Questions;
//find minumum element of the array
public class FindMinimum {

    public static void main(String[] args) {
    int[] arr = {19,20,-4,-7,56,99,101};
        System.out.println(min(arr));
    }
    static int min(int[] arr) {
        int element = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<element) {
                element = arr[i];
            }
        }
        return element;
    }
}
