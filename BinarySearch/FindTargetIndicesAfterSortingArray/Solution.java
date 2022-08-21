package FindTargetIndicesAfterSortingArray;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> result= new ArrayList<>();
          int equalCount=0,lessThanCount=0;
          for(int num:nums){
              if(num==target)equalCount++;
               if(num<target)lessThanCount++;
          }
          for(int i=0;i<equalCount;i++){
              result.add(lessThanCount+i);
          }
          return result;
          
      }
}
