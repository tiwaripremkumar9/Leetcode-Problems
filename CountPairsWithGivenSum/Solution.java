package CountPairsWithGivenSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int[] arr = {1, 5, 7,4, -1, 5, -2, 8,2};
        int target = 6;
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                count++;
            }
            else{
                map.put(arr[i], complement);
            }

        }

        System.out.println(count);
    }
    
}
