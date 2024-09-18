package RotateAnArray;

import java.util.Arrays;

/*
 * Given an array, the task is to cyclically rotate the array clockwise by one time. 
 */
public class Solution {

    public static int[] rotateArray(int [] arr){
        int temp = arr[arr.length - 1];
        for(int i = arr.length - 2; i >= 0 ; i--){

            arr[i + 1] = arr[i];
        }

        arr[0] = temp;
        return arr;
    }


    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11};
        System.out.println(Arrays.toString(rotateArray(arr)));

    }
    
}
