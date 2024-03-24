import java.util.HashMap;
import java.util.Map;

class RemoveDuplicatesFromSortedArray{


    public static int removeDuplicatesFromSortedArray(int [] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer each:nums){
            if(!map.containsKey(each)){
                map.put(each, 1);
            }
            else{
                Integer value = map.get(each) + 1;
                map.put(each, value);
            }
        }
        return map.size();
        
    }



    public static void main(String[] args) {

        int [] arr = {1,1,2};

        RemoveDuplicatesFromSortedArray.removeDuplicatesFromSortedArray(arr);
        
    }
}