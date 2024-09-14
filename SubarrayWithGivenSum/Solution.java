package SubarrayWithGivenSum;

public class Solution {

    public static int[] bruteForce(int [] arr, int sum){
        /*
         * TC - O(n*n)
         * Best Case TC - O(n) -> where the sum = arr[0] + arr[1]
         */
        int [] resultArray = new int[2];
        for(int i = 0; i < arr.length; i++){
            int currentSum = arr[i];
            for(int j = i+1; j < arr.length; j++){
                currentSum = currentSum + arr[j];
                if(currentSum == sum){
                    resultArray[0] = i;
                    resultArray[1] = j;
                    break;
                }
                if(currentSum > sum){
                    break;
                }
            }
            if(resultArray[0] != 0){
                break;
            }
        }

        return resultArray;
    }


    public static void main(String[] args) {
        int [] arr = {2,6,1,9,10,3,4};
        int [] resultArray = bruteForce(arr, 8);
        for (int i : resultArray) {
            System.out.println(i);
        }
    }
    
}
