class Solution {
    public String getPermutation(int n, int k) {
        int i,j,r;
        int fact =1;
        List<Integer> l = new ArrayList();
        for(i=1;i<n;i++)
        {
            l.add(i);
            fact *= i;
        }
        k= k-1;
        l.add(n);
        String s="";
        while(true)
        {
            s = s + l.get(k/fact);
            l.remove(k/fact);
            if(l.size() == 0)
                break;
            k = k % fact;
            fact = fact/ l.size();
        }
    return s;
    }
    
}