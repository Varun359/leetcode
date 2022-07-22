/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    int total;
    Map<Integer,Employee> hm;
    public int getImportance(List<Employee> employees, int id) {
     
        hm = new HashMap();
        for(Employee e : employees)
        {
            hm.put(e.id, e);
        }
        
        dfs(id);
        
        return total;
    }
    
    public void dfs(int id)
    {
        Employee e = hm.get(id);
        if(e!=null)
        {
           total += e.importance;
           for(int sub : e.subordinates)
           {
               dfs(sub);
           }
        }
    }
}