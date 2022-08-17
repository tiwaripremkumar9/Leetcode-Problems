package ClimbingTheLeaderboard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Solution
 */
public class Solution {

    public static List<Integer> ClimbingTheLeaderboard(List<Integer> ranked, List<Integer> player) {
        Map<Integer, Integer> rankedMap = new HashMap<>();
        List<Integer> resltList = new ArrayList<>();
        int rank = 1;
        for(Integer eachScore: ranked){
            if(!rankedMap.containsKey(eachScore))
                rankedMap.put(eachScore, rank++);
                //rank = rank + 1;
                System.out.println(rankedMap.get(eachScore));
        }
        
        int initial = ranked.size()-1;
        for(int eachScore: player){
            for(int i = initial; i >= 0; i--) {
                if(eachScore >= ranked.get(i)){
                    rank = rankedMap.get(ranked.get(i));
                    initial = i -1;
                }
                resltList.add(rank);
                break;
            }
            }
            return resltList;
        }


    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(100);
        arr1.add(100);
        arr1.add(50);
        arr1.add(40);
        arr1.add(40);
        arr1.add(20);
        arr1.add(10);
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(5);
        arr2.add(25);
        arr2.add(50);
        arr2.add(120);
     System.out.println(ClimbingTheLeaderboard(arr1, arr2));
    }
}
