// Java Solution using Hash Sets

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> set = new HashSet<>();
        
        for(int i : nums1){
            set.add(i);
        }
        
        Set<Integer> set2 = new HashSet<>();
        for(int j : nums2){
            if(set.contains(j)){
                set2.add(j);
            }
        }
        
        //convert set2 into result array i.e intersection array
        
        int [] resultArray = new int[set2.size()]; //initialising result array
        int index = 0;
        //iterate each element of set2(contains intersection elements into      resultant(intersection) array)
        for(int k : set2){
            resultArray[index++] = k;
        }
        
        return resultArray;
}
}