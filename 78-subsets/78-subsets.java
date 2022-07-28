class Solution {
     List<List<Integer>> final_set;
    public void findSubsets(int nums[], int i, int n, List<Integer> s)
    {
        if(i==n)
        {
            final_set.add(new ArrayList<>(s));
            return;
        }
        // if(i==n)
        //     return;
        s.add(nums[i]);
        findSubsets(nums, i+1, n, s);
        s.remove(s.size()-1);
        findSubsets(nums, i+1, n, s);
    }
    public List<List<Integer>> subsets(int[] nums) {
       final_set = new ArrayList();
    
        findSubsets(nums, 0, nums.length,new ArrayList());
        return final_set;
    }
}