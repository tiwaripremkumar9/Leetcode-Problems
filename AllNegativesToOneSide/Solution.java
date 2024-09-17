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

    public static int[] solveNegativeTowardsLeft(int [] arr){
        //take two pointers, one left and one right
        int l = 0;
        int r = arr.length - 1;
        while(l < r){
            //if left element is +ve and right is -ve then just increment left and decrememt right.
            if(arr[l] < 0 && arr[r] > 0){
                l++;
                r--;
            }
            //if left is positive and right is negative, swap the element then increment left and decremet positive
            if(arr[l] > 0 && arr[r] < 0){
                int temp = arr[r];
                arr[r] = arr[l];
                arr[l] = temp;

                l++;
                r--;
            }
            /*
             * if both are positive, that means right is at correct position but left is not
             * hence we should only worry about left element
             * so, keep left at it's current position but decrement right.
             */
            if(arr[l] > 0 && arr[r] > 0){
                r--;
            }
            /*
             * if both are negative, that means left is at correct position but right is not
             * hence we should only worry about right element
             * so, keep right at it's current position but increment left.
             */
            if(arr[l] < 0 && arr[r] < 0){
                l++;
            }
        }

        return arr;
    }

    public static int []  solveNegativeTowardsRight(int [] arr){
        int l = 0;
        int r = arr.length - 1;
        while(l < r){
            if(arr[l] > 0 && arr[r] < 0){
                l++;
                r--;
            }
            if(arr[l] < 0 && arr[r] > 0){
                int temp = arr[r];
                arr[r] = arr[l];
                arr[l] = temp;

                l++;
                r--;
            }
            if(arr[l] > 0 && arr[r] > 0){
                l++;
            }
            if(arr[r] < 0 && arr[l] < 0){
                r--;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1,-5,6,4,3,-9,-8,7,-11,4};
        //sortApproach(arr);
        //int [] resultArray = solveNegativeTowardsLeft(arr);
        int [] resultArray = solveNegativeTowardsRight(arr);
        System.out.println(Arrays.toString(resultArray));
    }
    
}
