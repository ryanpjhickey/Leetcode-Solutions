class Solution {

    public static int[] numberOfPairs(int[] nums) {
        int[] cnt = new int[101];

        for (int num : nums) {
            cnt[num]++;
        }

        int[] res = new int[2];

        for (int i = 0; i <= 100; i++) {
            res[0] += cnt[i] / 2;
            res[1] += cnt[i] % 2;
        }

        return res;
    }

}