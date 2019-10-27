package leetcode.practice;

public class TreeHeight {

	public static void main(String[] args) {
		TreeNode treeNode = new TreeNode(0);
		
		treeNode.left = new TreeNode(1);
		treeNode.left.left = new TreeNode(2);
		treeNode.left.right = new TreeNode(2);
		treeNode.left.right.left = new TreeNode(2);
		System.out.println(height(treeNode));
	}

	private static int height(TreeNode node) {
		if (node == null) return 0;
		return 1 + Math.max(height(node.left), height(node.right));
	}
	
}
