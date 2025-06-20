class Solution {
    public boolean isHappy(int n) {
      int slow = n, fast = sumDigits(n);
      while(fast != 1 && slow != fast) {
        slow = sumDigits(slow);
        fast = sumDigits(sumDigits(fast));
      }
      return fast == 1;
    }

    private int sumDigits(int n){
        int totalSum = 0;
        while (n != 0) {
            int digit = n % 10;
            n /= 10;
            totalSum += digit * digit;
        }
        return totalSum;
    }
}