import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /*
     * Brute force
     */
    public static int [] solution(int [] nums, int target){

        int [] resultArr = new int [2];

        for(int i = 0; i < nums.length; i++){
            boolean flag = false;
            int currentElement = nums[i];
            int sum = target - currentElement;
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] == sum){
                    resultArr[0] = i;
                    resultArr[1] = j;
                    flag = true;
                    break;
                }
            }
            if(flag)
                break;
        }

        return resultArr;

    }

    /*
     * Optimized approach using Maps
     * T.C - O(n)
     */
    public static int [] solution2(int [] nums, int target){

        int [] resultArr = new int [2];

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int sum = ( target - nums[i]);
            if(map.containsKey(sum)){
                resultArr[0] = (map.get(sum).intValue());
                resultArr[1] = i;
                break;
            }
            map.put(nums[i], i);
        
        }

        return resultArr;

    }


    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        TwoSum.solution2(nums, 9);
    }
}