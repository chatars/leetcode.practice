package leetcode.practice;

public class TransposeMatrix {

	public static void main(String[] args) {
//		int mat[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		int mat[][] = {{1,2,3}, {4,5,6}};
		MatrixUtils.printMatrix(mat);
		MatrixUtils.printMatrix(transpose(mat));
	}
	

	private static int[][] transpose(int[][] mat) {
		int R = mat.length; int C = mat[0].length;
		int[][] newmat = new int[C][R];
		
		for(int i = 0; i < R; ++i) {
			for (int j = 0; j<C; ++j) {
				newmat[j][i] =  mat[i][j];
			}
		}
		
		return newmat;
	}

}
