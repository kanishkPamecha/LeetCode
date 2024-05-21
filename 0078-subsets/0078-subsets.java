class Solution {
    public List<List<Integer>> ans(int[] nums, int idx, List<Integer> arr, List<List<Integer>> ans1) {
        if (idx == nums.length) { ans1.add(new ArrayList<>(arr)); return ans1;}

        List<Integer> takeArr = new ArrayList<>(arr);
        takeArr.add(nums[idx]);
        ans(nums, idx + 1, takeArr, ans1);
        ans(nums, idx + 1, arr, ans1);
        return ans1;
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        return ans(nums, 0, arr, ans);
    }

   
    

}
