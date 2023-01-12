class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {

        HashMap<Integer, Integer> appleMap = new HashMap<Integer, Integer>();
        int minimumTime = 0;

        Arrays.sort(edges, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        for(int[] edge: edges) {
            if (appleMap.containsKey(edge[1])) {
                appleMap.put(edge[0], edge[1]);
            }
            else {
                appleMap.put(edge[1], edge[0]);
            }
        }

        for(int index = 0; index < hasApple.size(); ++index) {
            if (!hasApple.get(index)) continue;
            int prev = index;
            while(prev != 0 && appleMap.get(prev) >= 0) {
                int temp = appleMap.get(prev);
                appleMap.put(prev, -1);
                prev = temp;
                minimumTime += 2;
            }
        }
    return minimumTime;
    }
}