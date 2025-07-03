class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict); // Use HashSet for O(1) lookup
        boolean[] f = new boolean[s.length() + 1];
        f[0] = true;
        int n = s.length();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (f[j] && dict.contains(s.substring(j, i))) {
                    f[i] = true;
                    break;
                }
            }
        }

        return f[n];
    }
}
