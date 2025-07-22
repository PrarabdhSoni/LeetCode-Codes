
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/?envType=problem-list-v2&envId=array

public class FindNumbersWithEvenNumbersOfDigits {

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums){
            if(even(num)){
                count ++;
            }
        }

        return count;
    }

    public static boolean even(int num){

        int numberOfDigits = (int) Math.log10(num) + 1;

        return numberOfDigits % 2 == 0;
    }

    public static void main(String[] args) {
        int[] nums = {12, 344, 34431, 53223, 4567};

        System.out.println(findNumbers(nums));
    }

}
