class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()) return false; //return false if pre-requisite is not met

        Map<Character, Integer> ransomMap = new HashMap<>(); //define our hashmap and ransom/mag array lists
        char[] magList = magazine.toCharArray();
        char[] ransomList = ransomNote.toCharArray();

        for (char index : magList) { //loops through magList string length
            ransomMap.merge(index, 1, Integer::sum);
        }
        
        for (char index : ransomList) { //loops through ransomList string length
            Integer count = ransomMap.get(index);
            if (count == null || count == 0) return false; //if statement that checks if ransomNote contains the same chars as magazine
            count--;
            ransomMap.put(index, count);
        }
        return true; //returns true if ransomNote contains necessary characters from magazine string
    }
}