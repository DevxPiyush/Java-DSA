package Algorithms.Lin_Search.Questions;
// https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCostWealth {
    public static void main(String[] args) {
    int[][] accounts = {
            {1,2,3},
            {5,6,7,8},
            {5,5,5,5,88}
    };
    int ans = maximumWealth(accounts);
        System.out.println(ans);
    }
    static int maximumWealth(int[][] accounts){
        // suppose person =  row
        // suppose account = column
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length ; account++) {
            sum = sum + accounts[person][account];
            }
            if (sum >ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
