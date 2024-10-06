class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int windowStart = 0;
        int currentSum = 0;
        int currentLength = 0;
        int minLength = Integer.MAX_VALUE;

        for(int windowEnd = 0; windowEnd < nums.length; windowEnd++){
            currentSum += nums[windowEnd];
            while(currentSum >= target){
                currentSum -= nums[windowStart];
                currentLength = windowEnd - windowStart + 1;
                minLength = Math.min(currentLength, minLength);
                windowStart++;
            }

        }
        return minLength != Integer.MAX_VALUE ? minLength : 0;
        
    }
}