class Solution {
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        Map<Integer, List<Integer>> treeMap = new HashMap<>();
        for (int[] edge : edges) {
            treeMap.computeIfAbsent(edge[0], l -> new ArrayList<>()).add(edge[1]);
            treeMap.computeIfAbsent(edge[1], l -> new ArrayList<>()).add(edge[0]);
        }
        int[] ans = new int[n];
        Set<Integer> known = new HashSet<>();
        dfs(treeMap, 0, labels, ans, known);
        return ans;
    }
    private int[] dfs(Map<Integer, List<Integer>> treeMap, int node, String labels, int[] ans, Set<Integer> known) {
        int[] counter = new int[26];
        if (known.add(node)) {
            char currentChar = labels.charAt(node);
            for (int child : treeMap.getOrDefault(node, Collections.emptyList())) {
                int[] sub = dfs(treeMap, child, labels, ans, known);
                for (int i = 0; i < 26; ++i) {
                    counter[i] += sub[i];
                }
            }
            ++counter[currentChar - 'a'];
            ans[node] = counter[currentChar - 'a'];
        }
        return counter;
    }
}