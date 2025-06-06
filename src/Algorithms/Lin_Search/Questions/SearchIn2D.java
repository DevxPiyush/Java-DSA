package Algorithms.Lin_Search.Questions;

public class SearchIn2D {
    public static void main(String[] args) {
    int[][] arr = {
            {1,2,3},
            {4,5,19,6},
            {7,8,9,45,35,13}
    };
    search(arr,19);
    }
    static int search(int[][] arr, int target){
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col < arr[row].length ; col++) {
                if (arr[row][col] == target) {
                    System.out.println("element found at row: "+row+" and Column: "+col);
                }
            }
        }
        return target;
    }
}
