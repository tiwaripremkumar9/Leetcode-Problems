class Solution {
    public int minSubArrayLen(int target, int[] nums) {
  int currentSum = 0;
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        for(int end = 0; end < nums.length; end++) {
        	currentSum += nums[end];
        	
        	while(currentSum >= target) {
        		currentSum -= nums[start];
        		minLength = Math.min(minLength, end - start + 1);
        		start++;
        	}
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}