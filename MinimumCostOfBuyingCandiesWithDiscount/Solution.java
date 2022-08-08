package MinimumCostOfBuyingCandiesWithDiscount;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;



/**
 * Solution
 */
/* Optiomized Solution */
public class Solution {

    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int mincost = 0;
        int count = 0;
        for (int i = cost.length - 1; i >= 0; i--) 
        {
            if (count != 2)
            {
                mincost += cost[i];
                count++;
            } else
            {
                count = 0;
            }
        }
        return mincost;
    }
}
/* Kind of Brute Force I did with Priority Queue */
/*public class Solution {
    public static int minimumCost(int[] cost) {
        int res = 0;
        boolean flag = false;
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer> (Collections.reverseOrder());
        for(int i = 0; i < cost.length; i++) {
            pq.add(cost[i]);
        }
        
        while(!pq.isEmpty()) {
            if(!flag){
                System.out.println(pq.peek());
                res = res+pq.poll();
                count = count + 1;
                if(count == 2)
                    flag = true;
            }
            if(flag) {
                pq.poll();
                count = 0;
                flag = false;
            }
            
        }
        return res;
        
    }

    public static void main(String[] args) {
        int [] cost = {6,5,7,9,2,2};
        System.out.println(minimumCost(cost));
    }
}*/
