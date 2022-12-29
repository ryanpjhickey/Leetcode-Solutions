public class Solution {
    public bool CanConstruct(string ransomNote, string magazine) {
        
        ArrayList ransomArrayList = new ArrayList(ransomNote.ToCharArray());

        for(int index=0; index < magazine.Length; index++) //loops through magazine string's length
        {
            ransomArrayList.Remove(magazine[index]); //removes up to the end of the magazine's string from arrayList
        }
        
        return ransomArrayList.Count == 0; //returns true or false for ransomArrayList. If characters in ransomNote are all available in magazine string, it will return as true. Otherwise it will return as false.
    }
}