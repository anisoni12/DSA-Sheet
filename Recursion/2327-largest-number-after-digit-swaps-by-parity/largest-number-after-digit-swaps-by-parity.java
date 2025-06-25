class Solution {
    public int largestInteger(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for(char d : digits){
            int val = d - '0';
            if(val % 2 == 0) even.add(val);
            else odd.add(val);
        }

        Collections.sort(even, Collections.reverseOrder());
        Collections.sort(odd, Collections.reverseOrder());

        StringBuilder result = new StringBuilder();
        int evenIdx = 0, oddIdx = 0;

        for(char d : digits){
            int val = d - '0';
            if(val % 2 == 0){
                result.append(even.get(evenIdx++));
            }
            else{
                result.append(odd.get(oddIdx++));
            }
        }
        return Integer.parseInt(result.toString());
    }
}
