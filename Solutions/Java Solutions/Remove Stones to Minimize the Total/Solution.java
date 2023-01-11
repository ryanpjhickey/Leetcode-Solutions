class Solution {
    public int minStoneSum(int[] piles, int k) {

        PriorityQueue<Integer> prioQ = new PriorityQueue<>((a,b) -> b.compareTo(a)); //create our priority queue
        int initialStones = 0; //define our initialStones and removedStones as 0
        int removedStones = 0;

        for (int index = 0; index < piles.length; index++) //loop through the pile length
        {
            prioQ.add(piles[index]); //add each node to the priority queue
            initialStones += piles[index]; //add our current index value to the pile of stones
        }
        
        for (int index = 0; index < k; index++) //this for loop will apply our operation "k" amount of times
        {
            int temp = prioQ.remove(); //define our temp to remove a node from the prioQ
            int remainingStones = (temp % 2 == 0) ? temp / 2 : (temp + 1) / 2; //define remainingStones to subtract from our temp var
            removedStones += temp - remainingStones; //calculate the amount of stones removed
            prioQ.add(remainingStones); //add any remainingStones to the prioQ
        }

        int total = initialStones - removedStones; //define our total as our initialStones - removedStones
        return total; //return our total

    }
}