class Solution {
    public int minSwaps(int[] nums) {
        int k = 0;
        for (int a : nums) {
            k += a;
        }
        int n = nums.length;
        int[] extendedNums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            extendedNums[i] = nums[i % n];
        }
        int zero_count = 0;
        for (int i = 0; i < k; i++) {
            if (extendedNums[i] == 0) {
                zero_count++;
            }
        }
        int min_swaps = zero_count;
        for (int i = k; i < 2 * n; i++) {
            if (extendedNums[i] == 0) {
                zero_count++;
            }
            if (extendedNums[i - k] == 0) {
                zero_count--;
            }
            min_swaps = Math.min(min_swaps, zero_count);
        }
        return min_swaps;
    }
}