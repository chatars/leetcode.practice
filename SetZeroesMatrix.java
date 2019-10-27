package leetcode.practice;

public class SetZeroesMatrix {

	public static void main(String[] args) {
		int mat[][] = {{1,1,1}, {1,0,1}, {1,1,1}};
		MatrixUtils.printMatrix(mat);
		MatrixUtils.printMatrix(setZeroes(mat));
	}

	private static int[][] setZeroes(int[][] mat) {
		int rows = mat.length; int cols = mat[0].length;
		int[][] newMat = mat;
		
		for(int r=0; r<rows; r++) {
			for(int c=0; c<cols; c++) {
				if(mat[r][c] == 0) {
					updateMatrix(newMat,r,c);
				}
			}
		}
		
		return newMat;
	}

	private static void updateMatrix(int[][] newMat, int r, int c) {
		int i = r; int j=c;
		int k = r; int l=c;
		while(i < newMat.length && j < newMat[0].length){
			newMat[i++][c] = 0;
			newMat[r][j++] = 0;
		}
		while(k > 0 && l > 0){
			newMat[--k][c] = 0;
			newMat[r][--l] = 0;
		}
		
	}

}
