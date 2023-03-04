class Solution {
    public int numberOfBeams(String[] bank) {
        int ans = 0, previous = 0, counter = 0;
        for(String laser: bank) {
            counter = 0;
            for (int i = 0; i < laser.length(); i++) 
                if (laser.charAt(i) == '1') counter++;
            if (counter > 0) {
                ans += previous * counter;
                previous = counter;
            }
        }
        return ans;
    }
}