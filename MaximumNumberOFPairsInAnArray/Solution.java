package MaximumNumberOFPairsInAnArray;

import java.util.*;

class Solution {
    public static int[] numberOfPairs(int[] nums) {
        int pair = 0;
        int remain = 0;
        int arr[] = new int[101];
        int count = 1;
        
		for(int item: nums){
            System.out.println(count+" iteration");
            count = count+1;
            System.out.println(arr[item]);
            arr[item]++;
            System.out.println(arr[item]);
            if(arr[item] == 2){
                pair++;
                arr[item] = 0;
            }
        }
        return new int[]{pair, nums.length-2*pair};
    }

    public static void main(String[] args) {
        int [] nums = {1,3,2,1,3,2,2};
        numberOfPairs(nums);
    }
}