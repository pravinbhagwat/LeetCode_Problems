/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            while(size-- > 0){
                TreeNode temp = q.poll();
                level.add(temp.val);
                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
            } 
            ans.add(level);  
        }
        //System.out.print(ans);
        return ans;
    }
}