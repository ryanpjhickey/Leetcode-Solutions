class Solution2 {
    public int maximumWealth(int[][] accounts) {
        
        int wealthMax = Arrays.stream(accounts). //returns sequential stream of array
        mapToInt(wealth -> Arrays.stream(wealth). //use mapToInt...
        sum()).max().getAsInt(); //... so that we can use sum, max, and getAsInt, to return our Richest Customer Wealth as int wealthMax!

        return wealthMax

    }
}