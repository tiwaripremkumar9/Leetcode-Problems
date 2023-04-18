import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int l = nums.length;
        boolean res = false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < l; i++){
            if(map.containsKey(nums[i])){
                // if map contains the current element and fulfils the condition return
                if(Math.abs(map.get(nums[i]) - i) <= k){
                    res = true;
                    break;
                }
                // if map contains the current element but doesn't fulfils the condition we will update the value with the current index of the element
                else{
                    map.replace(nums[i], i);
                }
            }
            else{
                map.put(nums[i],i);
            }
        }
        return res;
    }
}