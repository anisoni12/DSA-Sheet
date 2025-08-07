class Solution {
    public long subArrayRanges(int[] nums) {
        return getSum(nums, true) - getSum(nums, false);
    }
    private long getSum(int[] nums, boolean isMax) {
        Stack<Integer> st = new Stack<>();
        long sum = 0;
        int n = nums.length;

         for (int i = 0; i <= n; i++) {
        while (!st.isEmpty() && (i == n || 
            (isMax ? nums[st.peek()] < (i < n ? nums[i] : Integer.MAX_VALUE)
                   : nums[st.peek()] > (i < n ? nums[i] : Integer.MIN_VALUE)))) {
            
            int mid = st.pop();
            int left = st.isEmpty() ? -1 : st.peek();
            int right = i;

            long count = (mid - left) * (right - mid);
            sum += count * nums[mid];
        }
        st.push(i);
    }
    return sum;
}
}