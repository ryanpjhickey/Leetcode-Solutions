public class Solution {
    public bool CanConstruct(string ransomNote, string magazine) {
        
        var ransomList = ransomNote.ToList();
        var magList = magazine.ToList();

        for(int index = 0; index < ransomList.Count; index++)
        {
            if(!magList.Contains(ransomList[index]))
            {
                return false;
            }
            magList.Remove(magList.First(x => x == ransomList[index]));
        }

        return true;
    }
}