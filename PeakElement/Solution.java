package PeakElement;

/**
 * Given an unsorted array, find a peak element in it. 
 * An element is considered to be peak if its value is greater than or equal to the values of its adjacent elements (if they exist). 
 * There can be more than one peak elements in an array, we return any of them,
 */
public class Solution {

    public static void main(String[] args) {
        int [] arr = new int[]{5, 10, 20, 15};
        int peakElement = 0;
        if(arr.length == 1){
            peakElement = arr[0];
            return;
        }
        if(arr.length == 2){
            peakElement = arr[0] > arr[1] ? arr[0] : arr[1];
            return;
        }
        for(int i = 1; i <= arr.length - 2; i++){
            int current = arr[i];
            if(arr[i - 1] <=  current && arr[i + 1] <= current){
                peakElement = current;
            }
        }

        System.out.println("Peak Element : "+peakElement);
    }
}