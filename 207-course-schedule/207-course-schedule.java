class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
      HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int n=0; n<numCourses;n++){
            map.put(n,new ArrayList());
        }
        
       HashSet<Integer> visited = new HashSet<>(numCourses);
        for(int i =0; i< prerequisites.length; i++){
            map.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        for(int n=0; n<numCourses;n++){
            if(!dfs(map,visited,n)){
                return false;
            }
        }       
        return true;        
    }
    
    private boolean dfs(HashMap<Integer,List<Integer>> map, HashSet<Integer> visited, int course) {
        // if the prereq for the course is empty we know we can complete it so return true
        if(map.get(course).isEmpty()){
            return true;
        }
        // if set has the course cycle detected return false
        if(visited.contains(course)){
            return false;
        }
        else {
            visited.add(course);
        }
        
        // For each course get its prereq and do DFS on them
        for(int i =0; i< map.get(course).size();i++){
            if(!dfs(map,visited,map.get(course).get(i)))
            return false;        
        }
        visited.remove(course);
        // we use it in the first check if the list is empty return true
        map.get(course).clear();
        return true;    
    }
}