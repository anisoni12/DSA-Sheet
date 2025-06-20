class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while(n != 1 && !seen.contains(n)){
            seen.add(n);
            n = getSquareSum(n);
        }
        return n == 1;
    }
    private  int getSquareSum(int num) {
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum ;
    }
}