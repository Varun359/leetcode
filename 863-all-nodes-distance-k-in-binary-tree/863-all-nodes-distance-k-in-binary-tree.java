/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Pair{
    TreeNode parent;
    TreeNode child;
    Pair(TreeNode parent, TreeNode child)
    {
        this.parent = parent;
        this.child = child;
    }
}

class Solution {
    Queue<Pair> q;
    public void inOrder(TreeNode root, TreeNode r, TreeNode target)
    {
        if(r == null)
          return;
       // System.out.println("Lineee "+root.val+"sss"+target.val+"jk"+r.val);
        TreeNode g = LCA(root, target, r);
        //System.out.println(g.val);
        q.offer(new Pair(g, r));
        inOrder(root, r.left, target);
        inOrder(root, r.right, target);

    }
    
    public int distance(TreeNode root, TreeNode find)
    {
        if(root == null)
            return -1;
        int dist = -1;
        if(find.val == root.val)
            return dist+1;
        if((dist = distance(root.left, find)) >= 0 || (dist = distance(root.right, find)) >= 0)
            return dist+1;
        return dist;
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        q = new LinkedList();
        
        inOrder(root, root, target);  
        List<Integer> l = new ArrayList();
    
        // while(!q.isEmpty())
        // {
        //     Pair p = q.poll();
        //     System.out.print(p.parent.val+" ");
        //     System.out.println(p.child.val);
        // }
        while(!q.isEmpty())
        {
            Pair p = q.poll();
            int dist1 = distance(p.parent,p.child);
            int dist2 = distance(p.parent, target);
            if(dist1+dist2 == k)
                l.add(p.child.val);
        }
        return l ;
        
    }
    
    public TreeNode LCA(TreeNode root, TreeNode target, TreeNode ro)
    {
        if(root == null || root == target || root == ro)
            return root;
        
        TreeNode l = LCA(root.left , target, ro);
        TreeNode r = LCA(root.right, target, ro);
       
        
        if(l != null && r!= null)
            return root;
        else if(l == null)
            return r; 
        else
            return l;
    }
}