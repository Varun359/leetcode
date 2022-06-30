class Solution {
     public void findCombinations(List<List<Integer>> res, List<Integer> l, int candidates[],  int target, int n,int i)
    {
      
       if(target==0)
       {   res.add(new ArrayList<>(l));
              return;
       }
        for(int j=i;j<n;j++)
        {
            if(j>i && candidates[j]==candidates[j-1])
                continue;
            if(candidates[j]>target) break;
            
        l.add(candidates[j]);
        findCombinations(res,l,candidates,target-candidates[j],n,j+1);
        l.remove(l.size()-1);
    
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> l = new ArrayList();
        Arrays.sort(candidates);
        findCombinations(res,l,candidates,target,candidates.length,0);
        return res;
    }
}