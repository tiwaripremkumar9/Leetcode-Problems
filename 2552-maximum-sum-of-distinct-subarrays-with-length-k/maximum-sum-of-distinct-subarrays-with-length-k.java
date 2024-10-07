class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        int start = 0;
    long currentSum = 0;
    long maxSum = 0;
    Set<Integer> set = new HashSet<>();

    for (int end = 0; end < nums.length; end++) {
        // If we encounter a duplicate, move the start pointer to remove duplicates
        while (set.contains(nums[end])) {
            currentSum -= nums[start];
            set.remove(nums[start]);
            start++;
        }

        // Add the current element to the set and update the current sum
        set.add(nums[end]);
        currentSum += nums[end];

        // If the window size exceeds k, shrink the window from the start
        if (end - start + 1 > k) {
            currentSum -= nums[start];
            set.remove(nums[start]);
            start++;
        }

        // If the window size is exactly k, update the maximum sum
        if (end - start + 1 == k) {
            maxSum = Math.max(maxSum, currentSum);
        }
    }

    return maxSum;

        
    }
}