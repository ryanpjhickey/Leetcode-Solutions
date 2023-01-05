class Solution {
    public boolean isValid(String s) {

        HashMap<Character, Character> parenMap = new HashMap<>();

        parenMap.put('(',')');
        parenMap.put('[',']');
        parenMap.put('{','}');

        Stack<Character> parenStack = new Stack<>();

        for(int index = 0;index < s.length();index++){
            char currentChar = s.charAt(index);
            if(currentChar == '(' || currentChar == '{' || currentChar == '['){
                parenStack.push(currentChar);
            }
            else{
                if(parenStack.isEmpty()){
                    return false;
                }
                if(parenMap.get(parenStack.pop()).equals(currentChar)){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return parenStack.isEmpty();
    }
}