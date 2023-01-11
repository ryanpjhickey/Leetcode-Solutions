class Solution {
    public boolean isValid(String s) {

        HashMap<Character, Character> pMap = new HashMap<>();

        pMap.put('(',')');
        pMap.put('[',']');
        pMap.put('{','}');

        Stack<Character> pStack = new Stack<>();

        for(int index = 0;index < s.length();index++){
            char currentChar = s.charAt(index);
            if(currentChar == '(' || currentChar == '{' || currentChar == '['){
                pStack.push(currentChar);
            }
            else{
                if(pStack.isEmpty()){
                    return false;
                }
                if(pMap.get(pStack.pop()).equals(currentChar)){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return pStack.isEmpty();
    }
}