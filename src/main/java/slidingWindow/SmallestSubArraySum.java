package slidingWindow;

/**
 * Created by rameshroddam.
 * Date: 8/3/20
 * Time: 7:43 AM
 */
public class SmallestSubArraySum {
    public static void main(String args[]) {
        int[] arr = new int[]{2,3,1,2,4,3};
        SmallestSubArraySum smallestSubArraySum = new SmallestSubArraySum();
        smallestSubArraySum.findSmallestArraySum(arr, 7);

    }

    public int findSmallestArraySum(int[] nums, int k) {

        int windowStart = 0;
        int maxSum = 0;
        int smallestSubArray = 0;
        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            maxSum += nums[windowEnd];

            while (maxSum >= k) {
                if(smallestSubArray==0){
                    smallestSubArray = windowEnd - windowStart+1;
                }

                if (smallestSubArray > windowEnd - windowStart+1) {
                    smallestSubArray = windowEnd - windowStart+1;
                }
                maxSum -= nums[windowStart];
                windowStart++;

            }
        }
        return smallestSubArray;
    }

}
