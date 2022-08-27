package FairCandySwap;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sa = 0, sb = 0;  // sum of A, B respectively
        for (int each : bobSizes) {
            sa += each;
        }

        for (int each : aliceSizes) {
            sa += each;
        }
        int delta = (sb - sa) / 2;
        // If Alice gives x, she expects to receive x + delta

        Set<Integer> setB = new HashSet();
        for (int x: setB) setB.add(x);

        for (int x: aliceSizes)
            if (setB.contains(x + delta))
                return new int[]{x, x + delta};

        throw null;
    }
    
    public static void main(String[] args) {
        int [] aliceSizes = {2};
        int [] bobSizes = {1,3};
        System.out.println(fairCandySwap(aliceSizes, bobSizes));

    }
}
