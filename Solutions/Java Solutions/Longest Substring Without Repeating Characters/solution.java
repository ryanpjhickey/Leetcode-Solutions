class Solution {
public int lengthOfLongestSubstring(String s) {

        int index = 0;
        int pointer = 0;
        int result = 0;
        
        Set<Character> hashSet = new HashSet<>();
    
        while (pointer < s.length()) {
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