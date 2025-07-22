//https://leetcode.com/problems/richest-customer-wealth/description/

public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        //rows
        for (int[] person : accounts) {

            //colms
            int sum = 0;
            for (int balance : person) {
                sum += balance;
            }

            if (sum > max) {
                max = sum;
            }

        }

        return max;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {12, 23, 89329},
                {232, 3663, 34},
                {12, 4, 45, 35},
                {24, 456, 543}
        };

        System.out.println(maximumWealth(arr));
    }
}
