class Solution {
    public static void findSubsets(int nums[], int i, int n, List<List<Integer>> final_set, List<Integer> s)
    {
     
        final_set.add(new ArrayList<>(s));    
        for(int j=i;j<n;j++)
        {
        if(i!=j && nums[j]==nums[j-1])
            continue;
        s.add(nums[j]);
        findSubsets(nums, j+1, n, final_set, s);
        s.remove(s.size()-1);
        }
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        
        List<List<Integer>> final_list = new ArrayList();
        Arrays.sort(nums);
        findSubsets(nums, 0, nums.length, final_list, new ArrayList());
        return final_list;
    }
}