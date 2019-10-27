package leetcode.practice;

public class LIS {

	public static void main(String[] args) {
		int[] arr = {0,4,12,2,10,6,9,13,3,11,7};
		
		System.out.println(findLisLength(arr));
	}

	private static int findLisLength(int[] arr) {
		int max_so_far = 1;
		int[] _lis = new int[arr.length];
		int[] _index = new int[arr.length];
		_lis[0] = 1;
		_index[0] = 0;
		if(arr.length == 0) return 0;
		for (int i = 1; i < arr.length; i++) {
			_lis[i] = 1;
			int j = 0;
			while(j < i) {
				if(arr[i] > arr[j]) {
					_lis[i]= Math.max(_lis[j]+1, _lis[i]);
					max_so_far = Math.max(_lis[i], max_so_far);
					_index[i]=j;
				}
				j++;
			}
		}
		for(int i : _lis) {
			System.out.print(i + ", ");
		}
		System.out.println();
		for(int j : _index) {
			System.out.print(j + ", ");
		}
		System.out.println();
		return max_so_far;
	}

}
