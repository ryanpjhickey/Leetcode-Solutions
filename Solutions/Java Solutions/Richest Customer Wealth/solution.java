class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealthMax = 1;
        int rows = accounts.length;
        int columns = accounts[0].length;
        for (int index=0; index < rows; index++) {
            int wealthTemp = 0;
            for (int z=0; z < columns; z++) {
                wealthTemp += accounts[index][z];
            }
            wealthMax = Math.max(wealthMax, wealthTemp);
        }
        return wealthMax;
    }
}