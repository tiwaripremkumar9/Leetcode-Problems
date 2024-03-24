public class Solution{

    public static int searchInsert(int[] nums, int target) {
        int result = 0;
        int prevDiff = Integer.MAX_VALUE;
        if(target == 0)
            return 0;
        if(nums.length == 1){
            if(target > nums[0])
                return 1;
            else
                return 0;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                result = i;
                break;
            }
            int currentdiff = Math.abs(target - nums[i]);
            if(currentdiff > prevDiff){
                result = i - 1;
                break;
            }
            else
                prevDiff = currentdiff;

        }
        if(result == 0)
            result = nums.length;
        return result;
    }

    public static void main(String[] args) {
        int [] arr = {1,3,};
        Solution.searchInsert(arr,1);
    }
}


//2,3,5,7,9  ...... target = 1
/*
 * i == 0
 * prevDiff = some max value
 * currentDiff = 1
 * condition fails
 * i == 1
 * prevDiff = 1
 * currentDiff = 2
 * result = 0;
 */

/*
 * Test case 2 - 1,3,5,6 .... target = 2
 * i == 0
 * prevDiff = some max value
 * currentDiff = 1
 * condition fails
 * 
 * i==1
 * prevDiff = 1
 * currentDiff = 1
 * condition fails
 * 
 * i ==2
 * prevDiff = 1
 * currentDiff = 3
 * conditons satisfies
 * result = 1
 */

 /*
  * Test case 3: 1,3,5,6 .... target = 9

  */