package ReverseArray;

class Solution {

    /*
     * Solving Reversing an array
     */

    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5,6,7,90};
        int j = 0;
        int k = arr.length - 1;

        while(j < k || j == k){
            int temp = 1;
            temp = arr[j];
            arr[j] = arr[k];
            arr[k] = temp;
            j++;
            k--;
        }
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }


    }
    
}