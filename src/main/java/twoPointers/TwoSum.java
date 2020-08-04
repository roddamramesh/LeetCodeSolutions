package twoPointers;

/**
 * Created by rameshroddam.
 * Date: 8/4/20
 * Time: 11:11 AM
 */

import util.AppConstants;

/**
 * Given an array of Sorted integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {

    public static void main(String args[]) {

        TwoSum twoSum = new TwoSum();
        int[] pair = twoSum.targetSumPair(AppConstants.TWO_SUM_SORTED, 30);
        System.out.println("Indices for the sum of two numbers are: ");
        for (int i : pair) {
            System.out.println(i);
        }
    }


    int[] targetSumPair(int[] nums, int target) {
        int lp = 0, rp = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[lp] + nums[rp] == target){
                return new int[]{lp,rp};
            }
                if (nums[lp] + nums[rp] > target) {
                    rp--;
                } else {
                    lp++;
                }
        }
        return new int[]{};
    }


}
