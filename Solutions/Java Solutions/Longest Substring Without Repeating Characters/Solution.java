class Solution {
public int lengthOfLongestSubstring(String s) {

        int index = 0; //create our useful vars
        int pointer = 0;
        int result = 0;
        
        Set<Character> hashSet = new HashSet<>(); //create our hashSet
    
        while (pointer < s.length()) { //while pointer is less than s.length, check if hashSet contains a character at the pointer value, and then update our max substring
            if (!hashSet.contains(s.charAt(pointer))) {
                hashSet.add(s.charAt(pointer++));
                result = Math.max(result, hashSet.size());
            } else { 
                hashSet.remove(s.charAt(index++));
            }
        }
    
        return result;
    }
}