class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0) return ans ;
        String[] map = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(0, "", digits, map, ans);
        return ans ;
    }

    private void backtrack(int index, String path, String digits, String[] map, List<String> ans){
        if(index == digits.length()){
            ans.add(path);
            return ;
        }
        String possibleLetters = map[digits.charAt(index) - '0'];
        for(char c : possibleLetters.toCharArray()) {
            backtrack(index + 1, path + c, digits, map, ans);
        }
    }
}