class Solution {
    public static void findSubsets(int nums[], int i, int n, List<List<Integer>> final_set, List<Integer> s)
    {
        if(i==n && !final_set.contains(s))
        {
            final_set.add(new ArrayList<>(s));
            return;
        }
        if(i==n)
            return;
        s.add(nums[i]);
        findSubsets(nums, i+1, n, final_set, s);
        s.remove(s.size()-1);
        findSubsets(nums, i+1, n, final_set, s);
    }
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> final_list = new ArrayList();
    
        findSubsets(nums, 0, nums.length, final_list, new ArrayList());
        return final_list;
    }
}