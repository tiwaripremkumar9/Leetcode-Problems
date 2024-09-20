package PairsWithGivenSumInUnsortedArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given two unsorted arrays of distinct elements, 
 * the task is to find all pairs from both arrays whose sum is equal to a given value X.
 */
public class Solution {

    public static List bruteForce(int[] arr1, int[] arr2, int targetSum){
        List<Integer> list = new ArrayList<>();
            for(int i = 0; i < arr1.length; i++){
                for(int j = 0; j < arr2.length; j++){
                    if(arr1[i] + arr2[j] == targetSum){
                        list.add(arr1[i]);
                        list.add(arr2[j]);
                    }
                }

            }
        return list;
    }

    /*
     * Using Sorting & Binary Search.
     * ime Complexity: O(n log n + m log n), where n is the length of the first array and m is the length of the second array.
Sorting the first array takes O(n log n).
For each element in the second array, binary search takes O(log n).
     */
    public static List<Integer> optimalApproach1(int [] arr1, int [] arr2, int targetSum){
        List<Integer> resultList = new ArrayList<>();
        //1. sort any one array
        Arrays.sort(arr2);
        for(int i = 0; i <= arr1.length - 1; i++){
            int complement = targetSum - arr1[i];
            // binary search the complement in the sorted array
            if(binarySearch(arr2, complement) != 0){
                resultList.add(arr1[i]);
                resultList.add(arr2[binarySearch(arr2, complement)]);
            }
        }

        return resultList;
    }

    public static int binarySearch(int [] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int result = 0;

        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid] == target){
               result = mid;
               break;
            }

            if(target > arr[mid]){
                low = mid + 1;
            }

            if(target < arr[mid]){
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int [] arr1 = {-1, -2, 4, -6, 5, 7};
        int [] arr2 = {6, 3, 4, 0};
        int targetSum = 8;
        //List<Integer> resultList = bruteForce(arr1, arr2, targetSum);
        List<Integer> resultList = optimalApproach1(arr1, arr2, targetSum);
        if(!resultList.isEmpty()){
            resultList.forEach(each -> System.out.println(each));
        }
        else{
            System.out.println("Empty");
        }

    }
    
}
