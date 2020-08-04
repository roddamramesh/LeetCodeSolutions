package sorting;

import util.AppConstants;

/**
 * Created by rameshroddam.
 * Date: 8/1/20
 * Time: 4:12 PM
 */
public class InsertionSort {


    public static void main(String args[]){

        InsertionSort ins= new InsertionSort();



        int[] sortedData = ins.sort(AppConstants.SORT_INPUT);


        for (int data : sortedData) {
            System.out.println(data);
        }
    }

    /**
     *  Replace nums[j+1] with num[j] till while loop condition is true. For every iteration check with the predecessor number with key and replace the nums[j+1)] value with predecessor number.
     * Example: [5,6,7,8,2] j=3 and i=4,  store nums[i] into key.  i.e.., key = 2
     * on while loop iteration
     *      [5,6,7,8,8]
     *      [5,6,7,7,8]
     *      [5,6,6,7,8]
     *      [5,5,6,7,8]
     *  while j<0  while loop breaks and nums[0]=key. i.e.., nums[0] = 2;
     *  now the array would look like [2,5,6,7,8]
     */
    public int[] sort(int[] nums){

        long start = System.currentTimeMillis();
        for(int i=1;i<nums.length;i++){
            int key =nums[i];
            int j=i-1;


            while(j>=0 && nums[j]>key){
                nums[j+1]= nums[j];
                j--;
            }
            nums[j+1]= key;
        }
        long time = System.currentTimeMillis() - start;
        System.out.println("Execution Time: " + time);
        return nums;
    }
}
