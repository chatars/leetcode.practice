package leetcode.practice;

public class SpiralMatrix {

	public static void main(String[] args) {
		
		int mat[][] = { {1 ,3 ,5 ,7 }, 
						{10,11,16,20}, 
						{23,30,34,50}};
		//int mat[][] = {{1}};
		
		spiralPrint(mat);

	}

	private static void spiralPrint(int[][] mat) {
		int rows = mat.length; int cols = mat[0].length;
		int row = 0; int col = cols - 1;
		while (row < rows && col < cols) {
			for(int i = 0 ; i < cols; i++) {
				System.out.println(mat[row][i]);
			}
			row++;
			for (int j = row; j < rows; j++ ) {
				System.out.println(mat[j][col]);
				row++;
			}
			col--;
			for(int k=col; k > 0 ; k--) {
				System.out.println(mat[row][k]);
				col--;
			}
			row--;
			for(int l=col; l > 0 ; k--) {
				System.out.println(mat[row][k]);

			}
		}
		
		
		
	}

}
