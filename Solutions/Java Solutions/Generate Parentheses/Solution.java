import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> myList = new ArrayList<String>();

        backtrack(myList, "", 0, 0, n);
        return myList;

    }

    public void backtrack(List<String> myList, String myString, int openParen, int closeParen, int maximum) {

        if (myString.length() == maximum * 2) {
            myList.add(myString);
            return;
        }

        if (openParen < maximum) {
            backtrack(myList, myString + "(", openParen + 1, closeParen, maximum);
        }
        if (closeParen < openParen) {
            backtrack(myList, myString + ")", openParen, closeParen + 1, maximum);
        }
    }
}