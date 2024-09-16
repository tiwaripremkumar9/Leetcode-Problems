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

    /*
     * Test
     */

    public static void main(String[] args) {
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        sortApproach(arr);
    }
    
}
