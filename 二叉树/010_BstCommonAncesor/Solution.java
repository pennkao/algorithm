package leetcode;

/**Lowest Common Ancestor of a Binary Search Tree
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
 * According to the definition of LCA on Wikipedia: ��The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).��
 * @author ShaoCheng
 * @version 1.0 2015-10-17
 */
//	     _______6______
//	    /              \
//	 ___2__          ___8__
//	/      \        /      \
//	0      _4       7       9
//	      /  \
//	 	  3   5
//For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.

//  2
// /
// 1

//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ancestor = null;
        while(root != null){
	        if(p.val <= root.val && q.val >= root.val
	        		|| p.val >= root.val && q.val <= root.val){
	        	ancestor = root;
	        	break;
	        }
	        else if (p.val < root.val && q.val < root.val){
	        	root = root.left;
	        }
	        else{
	        	root = root.right;
	        }
        }
        return ancestor;
    }
}