package arrays;
/**
 * Created by IntelliJ IDEA.
 * User: rameshroddam
 * Date: 12/30/19
 * Time: 10:46 PM
 */

import Util.AppConstants;

import java.sql.SQLOutput;
import java.util.HashMap;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
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
        int[] arrayOfIndexes = twoSum.twoSum(AppConstants.TWO_SUM_ARRAY, 9);
        System.out.println("Indexes of Array are " + arrayOfIndexes[0] + " and " + arrayOfIndexes[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mapOfIndex = new HashMap<>();
        int[] arrOfIndexes = new int[2];
        for (int i = 0; i < nums.length; i++) {

            if (mapOfIndex.containsKey(nums[i])) {
                arrOfIndexes[0] = i;
                arrOfIndexes[1] = mapOfIndex.get(nums[i]);
                return arrOfIndexes;
            } else {
                mapOfIndex.put(target - nums[i], i);
            }


        }
        return arrOfIndexes;
    }
}
