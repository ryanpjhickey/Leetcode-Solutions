class Solution {
    public int findJudge(int n, int[][] trust) {

        int[] frequency = new int[n+1];

        for (int[] person: trust) {
            frequency[person[0]]--;
            frequency[person[1]]++;
        }

        for (int i = 1; i <= n; ++i) {
            if (frequency[i] == n - 1) {
                return i;
            }
        }
        return -1; //no town judge can be identified
    }
}