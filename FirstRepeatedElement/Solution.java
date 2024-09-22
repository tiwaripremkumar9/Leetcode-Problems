package FirstRepeatedElement;

import java.util.*;

/*
 * Given an array of integers arr[], 
 * The task is to find the index of first repeating element in it i.e. 
 * the element that occurs more than once and whose index of the first occurrence is the smallest. 
 */

class Solution {

    /*
     * Optimal Approach
     */
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,5,6,7,7,7,8,1,1,4,8};
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }
            else{
                result = arr[i];
                break;
            }
        }

        System.out.println(result);
        usingStreams();

    }

    /*
     * .filter(n -> !seen.add(n)) filters the stream to include only those elements that are already in the seen set. 
     * The add method of HashSet returns false if the element is already present, so !seen.add(n) will be true for duplicates.
     */

    public static void usingStreams(){
        int [] arr = {1,2,3,4,5,5,6,7,7,7,8,1,1,4,8};
        Set<Integer> set = new HashSet<>();
        int result = Arrays.stream(arr)
                            .filter(each -> !set.add(each))
                            .findFirst()
                            .orElse(-1);
        System.out.println("********** Using Streams ***********");
        System.out.println(result);
    }
    
}