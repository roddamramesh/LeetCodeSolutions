package sorting;

import Util.AppConstants;


/**
 * Created by rameshroddam.
 * Date: 8/1/20
 * Time: 8:11 PM
 */
public class MergeSort {

    public static void main(String args[]) {

        long start = System.currentTimeMillis();
        MergeSort ms = new MergeSort();
        int[] arr =AppConstants.SORT_INPUT;
       ms.sort(AppConstants.SORT_INPUT, 0, AppConstants.SORT_INPUT.length-1);
        long time = System.currentTimeMillis() - start;
        System.out.println("Execution Time: " + time);
        for (int data : arr) {
            System.out.println(data);
        }

    }

    /**
     *     Sort Method divides the array till  start < end and then passsed into merge method with start, mid and end indexes merge method.
     *     Merge method divides the elements into sub arrays, sort and merge back to the large array(nums).
      */
    public void sort(int[] nums, int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2;
            sort(nums, start, mid);
            sort(nums, mid + 1, end);

            //Sort and merge elements
            merge(nums, start, mid, end);
        }


    }

    /**
     *     create two new sub arrays and copy the elements from large array and then compare elements of sub arrays.
     *     After comparing if the element in ra[j] is smaller push that element into large array else push the the la[i] into large array
     */
    public void merge(int[] nums, int start, int mid, int end) {

        // find the length of two sub arrays to be merged
        int lenOfFirstSubArr = mid - start + 1;
        int lenOfSecondSubArr = end - mid;

        // create sub arrays
        int[] lA = new int[lenOfFirstSubArr];
        int[] rA = new int[lenOfSecondSubArr];

        // Copy data to sub arrays
        for (int x = 0; x < lenOfFirstSubArr ; x++) {
            lA[x] = nums[x+start];
        }
        for (int y = 0; y < lenOfSecondSubArr; y++) {
            rA[y] = nums[y+mid+1];
        }

        //Merge into large array
        int i = 0, j = 0, k = start;
        while (i<lenOfFirstSubArr && j<lenOfSecondSubArr) {
            if (j<lenOfSecondSubArr && rA[j] < lA[i]) {
                nums[k] = rA[j];
                j++;
            } else {
                nums[k] = lA[i];
                i++;
            }
            k++;
        }

        //copy the remaining elements from left Sub Array
        while(i<lenOfFirstSubArr){
            nums[k] = lA[i];
            i++;
            k++;

        }
        //copy the remaining elements from Right Sub Array
        while(i<lenOfSecondSubArr){
            nums[k] = rA[j];
            j++;
            k++;

        }


    }


}
