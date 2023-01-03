class Solution {
    public String longestPalindrome(String s) {
        int stringLength = s.length();
        int maxLength = 1;
        int start = 0;
        // int result = s.substring(start,start+maxLength);

        for (int index=0; index < stringLength; index++) {
            int left = index;
            int right = index;
            while (left >= 0 && right < stringLength && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            int length = right-left-1;
            if (length > maxLength) {
                maxLength = length;
                start = left+1;
            }
        }
        for (int index=0; index < stringLength; index++) {
        int left = index;
        int right = index+1;
        while (left >= 0 && right < stringLength && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        int length = right-left-1;
        if (length > maxLength) {
            maxLength = length;
            start = left+1;
        }
    }
        return s.substring(start,start+maxLength);
    }
}