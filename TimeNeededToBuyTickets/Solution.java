package TimeNeededToBuyTickets;

public class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int res = 0; // let us take a temporary result variable to store result
        for(int i = 0; i < tickets.length; i++) {
            
            /*let us take an example of [4,5,6], k = 2
                3,4,5  -----> 2,3,4 -------> 1,2,3 -------> 0, 1, 2 ------> -, 0, -
                if the current element (i) is smaller than the required element (k), it will always run i times irrespective of k's value, because it is
                smaller than k and will reach 0 after i turns.
                in above array element's value at last index doesn't matter after 5 turns of tickets[k] i.e 5, because before  5 becomes 0, prior to 6' turn.
                that means the last element makes  i - 1 turns, if it comes after k. 
            */
            if(tickets[i] < tickets[k]){
                res = res + tickets[i];
            }
            if(tickets[i] > tickets[k]) {
                // concerned part is if the current element (i) will be greater than kth element , in two scenarios , if kth element comes before i, and if                     after i
                if( i < k)
                    /*eg: 3,5,4 ----> 2,4,3, ----> 1,3,2 ----> 0, 2, 1 -----> -,1,0   hence, elment 5 turned for 4 times(equals to kth value) till k becomes 0                      */
                    res = res + tickets[k]; // if ith element (which is greater than kth element comes before k, it will run k  turns till k becomes 0)
                if(i > k)
                    // if k is smaller than i , that means kth element comes before the ith element , in this case, i will run for k - 1 times, because in kth                     turn , k becomes 0 without moving further
                    res = res + (tickets[k] - 1);
            }
            if(tickets[i] == tickets[k]){
                // if Kth element == ith element, but ith element comes before kth element. then ith element will takes i turns to become 0.
                if(i < k)
                    res = res + tickets[k];
                // if Kth element == ith element, but ith element comes after kth element, i will run k - 1 times, because when K will become 0 , it won't                        move further 
                if(i > k)
                    res = res + tickets[k] - 1;
                if(i == k)
                    res = res + tickets[k];
            }
        }
        return res;
    }
} 
