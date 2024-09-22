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
    

    public static void main(String[] args) {
        int [] arr = {4,5,2,1,3,-6, 9,7,6};
        System.out.println(Arrays.toString(bruteForce(arr)));
    }
}
