class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, k, n, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int k, int n, List<Integer> path, List<List<Integer>> result) {
        if(path.size() == k && n == 0) {
            result.add(new ArrayList<>(path));
            return ;
        }
        for(int i = start; i <= 9; i++){
            if(i > n) break;
            path.add(i);
            backtrack(i + 1, k, n-i, path, result);
            path.remove(path.size() - 1);
        }
    }
}