package arrays;

import Util.AppConstants;

import java.util.*;

/**
 * Created by rameshroddam.
 * Date: 12/31/19
 * Time: 4:39 PM
 */
public class ThreeSum {

    public static void main(String args[]) {
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> lstOfList= new ArrayList<List<Integer>>();
        List<List<Integer>> lstOfSumValues = threeSum.getSumArray(AppConstants.THREE_SUM_ARRAY);
        lstOfSumValues.forEach(obj->{
            obj.forEach(obj1->{
                System.out.print(obj1 +", ");
            });
            System.out.println();
        });
    }

    List<List<Integer>>  getSumArray(int[] nums) {
        Arrays.sort(nums);
        StringBuilder sbf = new
                StringBuilder("");
        List<List<Integer>> lstOfSumValues= new ArrayList<List<Integer>>();
        int b=1,c=2;
        Set<String> hs= new HashSet<String>();
        for(int i=0;i<nums.length-2;i++){
            int low=b,high=c;
            while(high>low &&high<nums.length){
                if(nums[i]+nums[low]+nums[high]==0){
                    List lst= new ArrayList<Integer>();
                    lst.add(nums[i]);
                    lst.add(nums[low]);
                    lst.add(nums[high]);

                    if(!hs.contains(sbf.append(nums[i]).append(nums[low]).append(nums[high]).toString())){
                        lstOfSumValues.add(lst);
                        hs.add(sbf.toString()) ;

                    }
                    sbf.setLength(0);

                }
                high++;
                if(high==nums.length){
                    high=low+2;
                    low=low+1;
                }
            }
            b++;c++;
        }

        return lstOfSumValues;

    }
}
