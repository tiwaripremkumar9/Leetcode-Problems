class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
         int n = colors.length;
        int group = 0;
        
        //for 0th Element
        if(colors[0] != colors[1] && colors[0] != colors[n - 1]) {
        	group++;
        }
        //for last element
        if(colors[n - 1] != colors[n - 2] && colors[n - 1] != colors[0]) {
        	group++;
        }
        //running loop to all the elements which can have last and prev -> 1 -------- colors.length - 2
		for(int i = 1; i < n - 1; i++) {
			if(colors[i] != colors[i - 1] && colors[i] != colors[i+1]) {
				group++;
			}
		}
		return group;
    }
}