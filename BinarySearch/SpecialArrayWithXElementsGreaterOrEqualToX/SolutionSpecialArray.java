package SpecialArrayWithXElementsGreaterOrEqualToX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionSpecialArray {
    
    public static int specialArray(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int max =  nums[len-1];
        for(int i = 0;  i<= max;  i++){
            int a = findCeil(i,nums);
            if(len-a == i)
                return i;
        }
        return -1;
    }
    private static int findCeil(int a, int[] nums){
        int left = 0, right = nums.length-1;
        while(left<right){
            int mid = (left+right)/2;
            if(nums[mid]>= a){
                right = mid;
            }
            else left = mid+1;
        }
        return left;
    }
    public static void main(String[] args) {
        int [] nums = {3,6,7,7,0};
        System.out.println(specialArray(nums));
        
    }
}
