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
    static void findPath(TreeNode root,String st,List<String> list){

        if(root==null){
            return;
        }
        st=st+root.val;
        if(root.left==null && root.right==null){
            list.add(st);
            return;
        }
        findPath(root.left,st+"->",list);
        findPath(root.right,st+"->",list);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> list=new ArrayList<>();
        findPath(root,"",list);
        return list;
    }
}