class Solution {
    public void findCombinations(List<List<Integer>> res, List<Integer> l, int candidates[],  int target, int n,int i)
    {
        if(i==n)
        {
            if(target==0)
            {
                res.add(new ArrayList<>(l));
            }
              return;
        }
        if(candidates[i]<=target){
        l.add(candidates[i]);
        findCombinations(res,l,candidates,target-candidates[i],n,i);
        l.remove(l.size()-1);
        }
        findCombinations(res,l,candidates,target,n,i+1);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> res = new ArrayList();
        List<Integer> l = new ArrayList();
        findCombinations(res,l,candidates,target,candidates.length,0);
        return res;
    }
}