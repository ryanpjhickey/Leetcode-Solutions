class Solution2 {
    public int maximumWealth(int[][] accounts) {
        
        int wealthMax = Arrays.stream(accounts) //convert array to stream of int[]
        .mapToInt(wealth -> Arrays.stream(wealth).sum()) //use mapToInt to reduce sum
        .max() //find our richest customer
        .getAsInt(); //get our richest customer as integer value

        return wealthMax; //return our Richest Customer value
        
    }
}