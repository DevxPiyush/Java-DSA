package Algorithms.Lin_Search.Questions;

public class SearchInRange {
    public static void main(String[] args) {
    int[] arr = {10,20,30,40,50,60};
        System.out.println(linearSearchh(arr,30,1,4));
    }
    static int linearSearchh(int[] arr, int target, int start, int end){
        // search for array: return the index if found
        // if not then return -1

        for (int index = start; index <end; index++) {
            // check for element at every index of the array if it is = target
            int element = arr[index];
            if (element == target) {
                System.out.println(index);
            }
            if (end == 0) {
                System.out.println("no Element Found");
            }
        }
        return target;
    }
}
