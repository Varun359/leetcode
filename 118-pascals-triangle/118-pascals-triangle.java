class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        int i,j;
        int l=0;
        List<List<Integer>> list = new ArrayList();
        for(i=0;i<numRows;i++)
        {
            List<Integer> in = new ArrayList();
            for(j=0;j<l+1;j++)
            {
                if(j==0 || j==l)
                    in.add(1);
                else
                {
                    //List<Integer> ite = new ArrayList();
                    //ite.addAll(list.get(i-1));
                    // System.out.println(ite);
                    // System.out.println(ite.size());
                    //for(int k=0;k<ite.size()-1;k++)
                    //{
                      //  int sum = ite.get(k)+ite.get(k+1);
                        //in.add(sum);
                        
                    //}
                    //for(int k=1;k<ite.size()-1;k++)
                      //  j++;
                    int a = list.get(i-1).get(j-1);
                    int b = list.get(i-1).get(j);
                    in.add(a+b);
                }
            }
            list.add(in);
            l++;
        }
        return list;
    }
}