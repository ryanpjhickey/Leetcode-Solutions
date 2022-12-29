class Solution1 {
    public int maximumWealth(int[][] accounts) {

        int wealthMax = 0; // define our "res" as 0 initially, use as starting point for our wealthMax
        int rows = accounts.length; //define accounts.length as "rows"
        int columns = accounts[0].length; //define accounts[0].length as "columns"

        for (int index=0; index < rows; index++) { //iterate through rows of customers
            int wealthTemp = 0;
            for (int z=0; z < columns; z++) { //iterate through columns of customers
                wealthTemp += accounts[index][z];
            }
            wealthMax = Math.max(wealthMax, wealthTemp); //update wealthMax whenever it is larger than the prior value stored in wealthMax
        }
        return wealthMax; //return our "res," wealthMax
    }
}