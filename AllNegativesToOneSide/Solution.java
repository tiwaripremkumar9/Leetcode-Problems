package AllNegativesToOneSide;
/*
 * Move all negative numbers to beginning and positive to end with constant extra space
 * 
 * An array contains both positive and negative numbers in random order. 
 * Rearrange the array elements so that all negative numbers appear before all positive numbers.
 */
import java.util.Arrays;
public class Solution {

    public static void sortApproach(int [] arr){
        /*
         * The Arrays.sort() method uses a Dual-Pivot Quicksort algorithm, which offers a time complexity of O(nlogn)
         */
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int[] solve(int [] arr){
        int l = 0;
        int r = arr.length - 1;
        while(l < r){
            if(arr[l] < 0 && arr[r] > 0){
                l++;
                r--;
            }
            if(arr[l] > 0 && arr[r] < 0){
                int temp = arr[r];
                arr[r] = arr[l];
                arr[l] = temp;

                l++;
                r--;
            }
            if(arr[l] > 0 && arr[r] > 0){
                r--;
            }
            if(arr[l] < 0 && arr[r] < 0){
                l++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1,-5,6,4,3,-9,-8,7,-11,4};
        //sortApproach(arr);
        int [] resultArray = solve(arr);
        System.out.println(Arrays.toString(resultArray));
    }
    
}
