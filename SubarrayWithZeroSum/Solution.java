package SubarrayWithZeroSum;
import java.util.*;

public class Solution {

    /*
     * Brute-Force Approach
     * T.C -> O(n*n)
     */

    public static int[] bruteForce(int [] arr){
        int [] resultArray = {-1,-1};
        for(int i = 0; i < arr.length; i++){
            int sum = arr[i];
            for(int j = i+1; j < arr.length; j++ ){
                sum += arr[j];
                if(sum == 0){
                    resultArray[0] = i;
                    resultArray[1] = j;
                    break;      
                }
            }
        }
        return resultArray;
    }

    public static List<int[]> findZeroSumSubarrays(int[] nums) {
        // Create a HashMap to store the cumulative sum and corresponding indices
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();
        int sum = 0;

        // Initialize the map with sum 0 at index -1
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            // If the sum is seen before, it means there is a zero-sum subarray
            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    result.add(new int[]{start + 1, i});
                }
            }

            // Add the current sum to the map
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }

        return result;
    }

    

    public static void main(String[] args) {
        int [] arr = {4,5,2,1,3,-6, 9,7,6};
        //System.out.println(Arrays.toString(bruteForce(arr)));
        List<int[]> resultList = findZeroSumSubarrays(arr);
        resultList.forEach(each -> System.out.println(Arrays.toString(each)));

    }
}
