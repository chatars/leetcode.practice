package leetcode.practice;

public class MatrixUtils {

	public static void printMatrix(int[][] mat){
		System.out.print("[");
		for(int i = 0 ; i < mat.length; i++) {
			System.out.print("[");
			for(int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j]);
				if(j != mat[0].length - 1)
					System.out.print(",");
			}
			System.out.print("]");
			if(i != mat.length - 1)
				System.out.print(",");
		}
		System.out.println("]");
	}
}
