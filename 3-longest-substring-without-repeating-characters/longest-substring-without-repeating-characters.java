class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
		int windowStart = 0;
		int currentLength = 0;
		int maxLength = 0;
		char[] charArray = s.toCharArray();
		for(int windowEnd = 0; windowEnd < charArray.length; windowEnd++) {
			Character eachChar = Character.valueOf(charArray[windowEnd]);
			if(map.containsKey(eachChar)) {
                /*
                 * also handles below edge case:
                 * eachChar - part of Map but not part of the current window.
                 */
				windowStart = Math.max(windowStart, map.get(eachChar) + 1);
			}
			
			map.put(eachChar, windowEnd);
			currentLength = (windowEnd - windowStart) + 1;
			maxLength = Math.max(currentLength, maxLength);
		}
		
		return maxLength;
        
    }
}