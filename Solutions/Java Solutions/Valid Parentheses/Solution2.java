class Solution2 {
    public boolean isValid(String s) {


        Stack<Character> pStack = new Stack<>();

        for(int index = 0;index < s.length();index++){
            char currentChar = s.charAt(index);
            switch(currentChar) {
                case ']': if(pStack.isEmpty() || pStack.pop() != '[') return false; break;
                case ')': if(pStack.isEmpty() || pStack.pop() != '(') return false; break;
                case '}': if(pStack.isEmpty() || pStack.pop() != '{') return false; break;
                default: pStack.push(currentChar);
            }
        }
        return pStack.isEmpty();
    }
}


// Input: s = "()"
// Output: true
// Example 2:

// Input: s = "()[]{}"
// Output: true
// Example 3:

// Input: s = "(]"
// Output: false