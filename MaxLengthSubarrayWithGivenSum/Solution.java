package MaxLengthSubarrayWithGivenSum;

import java.util.*;

public class Solution {

    public static int[] maxLengthSubarrayWithGivenSum(int [] arr, int targetSum){
        int sum = 0;
        int maxLength = 0;
        int [] resultArray = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            int complementSum = sum - targetSum;
            if(!map.containsKey(complementSum)){
                map.put(sum, i);
            }
            else{
                int length = i - (map.get(sum) + 1);
                if(length > maxLength){
                    maxLength = length;
                    resultArray[0] = map.get(sum) + 1;
                    resultArray[1] = i;
                }
            }
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 7, 5};
        System.out.println(Arrays.toString(maxLengthSubarrayWithGivenSum(arr, 12)));

        
    }
    
}
