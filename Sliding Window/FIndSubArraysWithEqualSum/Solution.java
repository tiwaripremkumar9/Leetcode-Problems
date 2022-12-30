import java.util.*;

// Sliding Window solution

/*
 * Runtime: 1 ms, faster than 99.46% of Java online submissions for Find Subarrays With Equal Sum.
Memory Usage: 40.1 MB, less than 97.46% of Java online submissions for Find Subarrays With Equal Sum.
 */
class Solution {
    public boolean findSubarrays(int[] nums) {
        int l = nums.length;
        int count = 0;
        int k = 2;
        boolean res = false;
        Set<Integer> s = new HashSet<Integer>();
        // find sum of first K elements [1st Window]
        for(int i = 0; i < k-1; i++){
            count = count + nums[i];
        }
        s.add(count);
        
        //find sum of remaining windows of size K
        for(int i = k; i < l; i++) {
            count = (count + nums[i]) - nums[i - k];
            if(!s.contains(count))
                s.add(count); //if the sum of current subarray is new sum, put into set
            else{
                res = true; // if the sum of current subarray is already present means there was a sub array with the same sum
                break;
            }
        }
        return res;
    }
}