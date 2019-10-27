package leetcode.practice;

public class ValidBST {

	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(3);
//		t1.left = new TreeNode(2);
//		t1.right = new TreeNode(5);

		System.out.println(isValidBST(t1));
		System.out.println(isBST(t1));
	}

	 public static boolean isValidBST(TreeNode root) {
		 if(root == null) return false;
		 else if(root.left == null) return false;
		 else if(root.right == null) return false;
		 else if(root.left.data < root.data && root.right.data > root.data){
			 isValidBST(root.left);
			 isValidBST(root.right);
		 } else {
			 return false;
		 }
		 
		 return true;
	 }
	 
	 public static boolean isBST(TreeNode root){
			return isBSTUtils(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		    }
    public static boolean isBSTUtils(TreeNode root, int min, int max){
    
    	if (root==null) return true;
    	if ((root.data > min && root.data < max) &&
    	 isBSTUtils(root.left, min, root.data) &&
    	 isBSTUtils(root.right, root.data, max))
    	 return true;
    	else
    	 return false; 
    }
}
