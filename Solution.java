package collection;

public class Solution {

	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(){}
		TreeNode(int x){
			val=x;
		}
	}
	
	public TreeNode invertTree(TreeNode root){
		if(root==null){
			return null;
		}
		if(root.left!=null){
			invertTree(root.left);
		}
		if(root.right!=null){
			invertTree(root.right);
		}
		TreeNode temp;
		temp=root.left;
		root.left=root.right;
		root.right=temp;
		return root;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}


