class Solution {
    public int minStoneSum(int[] piles, int k) {

        PriorityQueue<Integer> prioQ = new PriorityQueue<>((a,b) -> b.compareTo(a));
        int initialStones = 0;
        int removedStones = 0;

        for (int index = 0; index < piles.length; index++) 
        {
            prioQ.add(piles[index]);
            initialStones += piles[index];
        }
        
        for (int index = 0; index < k; index++) 
        {
            int temp = prioQ.remove();
            int remainingStones = (temp % 2 == 0) ? temp / 2 : (temp + 1) / 2;
            removedStones += temp - remainingStones;
            prioQ.add(remainingStones);
        }

        int total = initialStones - removedStones;
        return total;

    }
}