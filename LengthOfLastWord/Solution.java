class Solution {
    public static int lengthOfLastWord(String s) {

        /*
         * trim all the leading and trailing spaces in the string
         */
        char [] charArray = s.trim().toCharArray();
        int length = 0;

        for(int i = charArray.length - 1; i >= 0; i--){
            
            Character each = Character.valueOf(charArray[i]);
            if(each.equals(" "))
                break;
            else{
                length = length + 1;
            }
        }

        return length;
    }
}