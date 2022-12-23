public class Solution {
    public bool CanConstruct(string ransomNote, string magazine) {
        
        var newDictionary = new Dictionary<char, int>(); //create our dictionary of available characters
        
        for(int index=0; index < magazine.Length; index++) //loops through magazine string length
        {
            if(newDictionary.ContainsKey(magazine[index]))
                newDictionary[magazine[index]]++;
            else
                newDictionary[magazine[index]] = 1;
        }

        for(int index=0; index < ransomNote.Length; index++) //loops through ransomeNote string length
        {
            if(!newDictionary.ContainsKey(ransomNote[index]) || newDictionary[ransomNote[index]] == 0) //if statement that checks if ransomNote contains the same chars as magazine
                return false; //returns false if not
                
            newDictionary[ransomNote[index]]--;
        }
        
        return true; //returns true if ransomNote contains necessary characters from magazine string
    }
}