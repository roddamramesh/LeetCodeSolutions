package sorting;

import Util.AppConstants;

/**
 * Created by rameshroddam.
 * Date: 8/1/20
 * Time: 10:16 PM
 */
public class QuickSort {

    public static void main(String args[]){


        int[] array = new int[]{8,3,5,2,9,1,4,7,4};
        QuickSort qs= new QuickSort();
        qs.sort(array,0,array.length-1);
        for (int i : array) {
            System.out.println(i);
        }


    }

    public void sort(int[] nums, int start, int end){
        if(start<end){
            int pi = partition(nums, start,end);
            sort(nums,start,pi-1);
            sort(nums,pi+1,end);
        }
    }

    private int partition(int[] nums, int start, int end) {
        int pivot= nums[end];

        int pIndex = start;
        for(int i=start;i<end;i++){

            if(nums[i]<=pivot){
                int temp= nums[i];
                nums[i]= nums[pIndex];
                nums[pIndex]=temp;
                pIndex++;
            }

        }

            int temp= nums[end];
            nums[end]= nums[pIndex];
            nums[pIndex]= temp;

        return pIndex;
    }
}
