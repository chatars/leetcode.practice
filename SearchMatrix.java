package leetcode.practice;

public class SearchMatrix {

	public static void main(String[] args) {
		int mat[][] = { {1 ,3 ,5 ,7 }, 
						{10,11,16,20}, 
						{23,30,34,50}};
//		int mat[][] = {{1}};
		
		System.out.println(hasValue(mat, 34));
		
	}

	private static boolean hasValue(int[][] mat, int val) {
		if(mat == null || mat.length == 0) return false;
		
		int rows = mat.length; int cols = mat[0].length;
		int row = 0; int col=cols-1;
		while(row < rows && col >= 0) {
			int curVal = mat[row][col];
			if(curVal == val) return true;
			else if (curVal > val) col--;
			else if (curVal < val) row++;
		}
		
		return false;
	}

}
