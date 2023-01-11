class Solution {
    public boolean isPalindrome(int x) {

        String xStr = Integer.toString(x); //convert int x to a string
        StringBuilder reverser = new StringBuilder(xStr).reverse(); // create our reverser with StringBuilder to reverse xStr
        return reverser.toString().equals(xStr); // will return true if string is same forwards and backwards
        
    }
}