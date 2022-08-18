package DivideArrayInTwoEqualPairs;

import java.util.Arrays;

public class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        boolean result = false;
        for(int i = 0; i < nums.length; i = i + 2){
            if(nums[i] == nums[i+1])
                ++count;
        }
        if(count == nums.length/2)
            result = true;
        return result;
        
    }
}
