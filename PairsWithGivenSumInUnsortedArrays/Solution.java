package PairsWithGivenSumInUnsortedArrays;

import java.util.ArrayList;
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

    public static void main(String[] args) {
        int [] arr1 = {-1, -2, 4, -6, 5, 7};
        int [] arr2 = {6, 3, 4, 0};
        int targetSum = 8;
        List<Integer> resultList = bruteForce(arr1, arr2, targetSum);
        if(!resultList.isEmpty()){
            resultList.forEach(each -> System.out.println(each));
        }

    }
    
}
