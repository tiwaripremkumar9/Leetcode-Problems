package RemoveDuplicates;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {

    public static int removeDuplicates(int[] nums) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int each: nums) {set.add(each);}
        int j = 0,res=0;
        for(Integer each : set){
            int element = each;
            nums[j] = element;
            j++;
            res++;
        }
        return res;
    }

    /*
     * O(n) approach
     */
    // int removeDuplicates(vector<int>& nums) {
    //     int ans=1,j=1;
    //     for(int i=1;i<nums.size();i++)
    //     {
    //        if(nums[i]!=nums[i-1])
    //        {
    //          nums[j]=nums[i];
    //          j++;
    //        }
    //     }
    //     // sort(nums.begin(),nums.end());
    //     return j;


    // }
    


    public static void main(String[] args) {
        int [] arr = {-3,-1,0,0,0,3,3};
        removeDuplicates(arr);
    }
}
