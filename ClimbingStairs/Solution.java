package ClimbingStairs;

public class Solution {
    public static int climbStairs(int n) {
            int start1 = 1;
            int start2 = 1;
            int current = 0; 
            for(int i = 2; i <= n; i++){
                current = start1 + start2;
                start1 = start2;
                start2 = current;
            }
            return start2;
        }
     
    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }
}
