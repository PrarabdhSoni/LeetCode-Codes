//https://leetcode.com/problems/two-sum/description/

public class TwoSum {

        public static int[] twoSum(int[] nums, int target) {

            int[] set = new int[2];

            for (int i =0 ; i < nums.length ; i++){

                for( int j = i+1; j< nums.length; j ++){

                    if(nums[i] + nums[j] == target){
                        set[0] = i;
                        set[1] = j;
                    }

                }


            }

            return set;
        }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int[] result = twoSum(nums, 6);
    }


}
