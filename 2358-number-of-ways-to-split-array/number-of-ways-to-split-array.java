class Solution {
    public int waysToSplitArray(int[] nums) {

        long[] prefixSumArray = new long[nums.length];
        prefixSumArray[0] = nums[0];
        int count = 0;

        for (int i = 1; i < nums.length; i++) {
            prefixSumArray[i] = prefixSumArray[i - 1] + nums[i];
        }


        long totalSum = prefixSumArray[nums.length - 1];

        for(int i = 0; i < nums.length - 1; i++){
            if(prefixSumArray[i] >= (totalSum - prefixSumArray[i])){
                count = count + 1;
            }
        }
        
        return count;
    }
}