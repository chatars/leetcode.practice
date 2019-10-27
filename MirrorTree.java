package leetcode.practice;

public class MirrorTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 void mirror(TreeNode node) {
		 if(node == null) return ;
		 else {
			 
			 TreeNode temp;
			 mirror(node.left);
			 mirror(node.right);
			 
			 temp = node.left;
			 node.left = node.right;
			 node.right = temp;
			 
		 }
	 }

}
