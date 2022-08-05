/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
       
        if(root == null)
            return "";
        StringBuilder sb = new StringBuilder("");
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);
        sb.append(root.val+" ");
        while(!q.isEmpty())
        {
            int size = q.size();
            while(size-->0)
            {
                TreeNode t = q.poll();
                if(t.left!=null)
                {   q.offer(t.left);
                    sb.append(t.left.val+" ");
                }
                else
                    sb.append("# ");
                if(t.right!=null)
                {   q.offer(t.right);
                    sb.append(t.right.val+" ");
                }
                else
                    sb.append("# ");
            }
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == "")
          return null;
        String ch[] = data.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(ch[0]));
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);
        for(int i = 1;i<ch.length;i++)
        {
            TreeNode t = q.poll();
            if(!ch[i].equals("#"))
            {
                t.left = new TreeNode(Integer.parseInt(ch[i]));
                q.offer(t.left);
            }
            if(!ch[++i].equals("#"))
            {
                t.right = new TreeNode(Integer.parseInt(ch[i]));
                q.offer(t.right);
            }
        }
        
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));