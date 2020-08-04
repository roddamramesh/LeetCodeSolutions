package slidingWindow;

/**
 * Created by rameshroddam.
 * Date: 8/2/20
 * Time: 4:14 PM
 */
public class ContinuesSubArray {

    public static void main(String args[]) {
        int[] nums = new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;
        ContinuesSubArray cs = new ContinuesSubArray();
        double[] arrOfAvg = cs.findAverage(nums, k);

        for (double v : arrOfAvg) {
            System.out.println(v);
        }
    }

    /**
     *
     * @param nums
     * @param k
     * @return Average of continues sub array of size 5
     */
    public double[] findAverage(int[] nums, int k) {
        double[] arrOfAvg = new double[nums.length - k + 1];

        double windowSum=0;
        int windowStart=0;

        /**
         * start with windowEnd index 0 and when you reach to the size k. if statement starts executing
         * And store the average of first five numbers and substract the nums[windowStart] index and increment windowStart
         */
        for(int windowEnd=0; windowEnd<nums.length;windowEnd++){
            windowSum +=nums[windowEnd];

            if(windowEnd>=k-1){
                arrOfAvg[windowStart]= windowSum/k;
                windowSum -= nums[windowStart];
                windowStart++;
            }

        }
        return arrOfAvg;
    }
}
