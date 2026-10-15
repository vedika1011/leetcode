class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        func(nums, ans, 0, new ArrayList<>());
        return ans;
    }

    public void func(int[] nums, List<List<Integer>> ans, int i, List<Integer> list) {

        if (i == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        // Include nums[i]
        list.add(nums[i]);
        func(nums, ans, i + 1, list);

        // Backtrack: remove the last element
        list.remove(list.size()-1);

        // Exclude nums[i]
        func(nums, ans, i + 1, list);
    }
}