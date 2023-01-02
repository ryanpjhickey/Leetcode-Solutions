class Solution {
    public boolean detectCapitalUse(String word) {
        
        int wordLength = word.length(); //define our useful vars
        boolean allUpper = true;
        boolean allLower = true; 
        boolean firstUpper = true;

        for (int index = 0; index < wordLength; index++) { //iterate through our strings length
            if (!Character.isUpperCase(word.charAt(index))) { //check if a single character is not uppercase
                allUpper = false; //if so, set allUpper to false
                break; //stop the loop
            }
        }
        if (allUpper) {
            return true; //if allUpper is not set to false, return true
        }


        for (int index = 0; index < wordLength; index++) { //iterate through our strings length
            if (!Character.isLowerCase(word.charAt(index))) { //check if a single character is not lowercase
                allLower = false; //if so, set allLower to false
                break; //stop the loop
            }
        }
        if (allLower) {
            return true; //if allLower is not set to false, return true
        }


        if (!Character.isUpperCase(word.charAt(0))) { //if our first character is not uppercase, set firstUpper to false
            firstUpper = false;
        }
        if (firstUpper) { //if firstUpper is not set to false, set and index equal to 1 and iterate through the rest of the characters in our string
            for (int index = 1; index < wordLength; index++) {
                if (!Character.isLowerCase(word.charAt(index))) { //check if any character after the first is not lowercase
                    firstUpper = false; //if so, set firstUpper to false
                    break; //stop the loop
                }
            }
        }
        if (firstUpper) {
            return true; //if firstUpper is still not set to false, return true
        }
        return false; //if allUpper, allLower, and firstUpper all are set to false, return false
    }
}