package slidingWindow;

/**
 * Created by rameshroddam.
 * Date: 8/2/20
 * Time: 7:15 PM
 */
public class MaxSumSubArray {

    public static void main(String args[]) {
        MaxSumSubArray mssa= new MaxSumSubArray();
        System.out.println(mssa.findMax(new int[]{2,3,4,1,5},2));
    }

    int findMax(int[] nums, int k) {

        int windowStart = 0;
        int windowSum=0;

        int maxSum=0;
        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowSum+= nums[windowEnd];// Add the incoming element

            if(windowEnd>=k-1){
                if(maxSum<windowSum){
                    maxSum = windowSum;
                }
                windowSum-= nums[windowStart];// Substract the out going element
                windowStart++; // slide the window
            }

        }
        return maxSum;

    }
}
