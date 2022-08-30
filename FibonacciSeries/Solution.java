package FibonacciSeries;

public class Solution {
    public int fib(int n) {
        int start1 = 1;
        int start2 = 1;
        if(n==0)
            return 0;
        if(n == 1)
            return start1;
        if(n==2)
            return start2;
        else{
         for(int i = 3; i <= n; i++) {
             int current = start1 + start2;
             start1 = start2;
             start2 = current;
         }
        }
        return start2;
    }
}
