public class Solution {
    IList<IList<int>> uniqueCombinations = new List<IList<int>>();
    public IList<IList<int>> CombinationSum(int[] candidates, int target) {
          var slate = new List<int>();
          helper(candidates, 0, slate, target);
          return uniqueCombinations;
    }
    private void helper(int[] candidates, int index, List<int> slate, int target)
    {
            
     
        if(target<0) return;
        if(target==0)
        {
            uniqueCombinations.Add(new List<int>(slate));
            
            return;
        }
        while (index < candidates.Length)
        {
          slate.Add(candidates[index]);
          helper(candidates, index, slate, target-candidates[index]);
          index++;
          slate.RemoveAt(slate.Count-1);
        }
    
    }
}