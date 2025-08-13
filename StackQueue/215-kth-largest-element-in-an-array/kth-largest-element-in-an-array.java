class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;

        int kthLargest = nums[n-k];
        int kthSmallest = nums[k-1];

        System.out.println("kth Largest element: " + kthLargest);
        System.out.println("kth Smallest element: " + kthSmallest);

    return kthLargest;
    }
}