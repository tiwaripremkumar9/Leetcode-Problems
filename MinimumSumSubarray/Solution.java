package MinimumSumSubarray;

public class Solution {

    public static int minimumSumSubarray(int [] arr){
        int currentSum = arr[0];
        int minSum = arr[0];
        for(int i = 1; i < arr.length; i++){
            currentSum = Math.min(arr[i], currentSum + arr[i]);
            minSum = Math.min(minSum, currentSum);
        }

        return minSum;
    }

    public static int kadanesAlgoForMinSumSubarray(int [] arr){
        int minSum = Integer.MAX_VALUE;
        int currentSum = 0;
        for(int i = 1; i < arr.length; i++){
            currentSum += arr[i];
            if(currentSum > 0){
                currentSum = 0;
            }
            if(currentSum < minSum){
                minSum = currentSum;
            }
        }
        return minSum;
    }
    

    public static void main(String[] args) {
        int [] arr = {8,-3,4,-10,3,-15,-11,6,11};
        // System.out.println(minimumSumSubarray(arr));
        System.out.println(kadanesAlgoForMinSumSubarray(arr));
    }
}
