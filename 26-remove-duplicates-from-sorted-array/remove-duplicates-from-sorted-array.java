class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int uniqueCount = 1; // Start with the first element being unique
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Check for duplicates
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }
        return uniqueCount;
    }
}