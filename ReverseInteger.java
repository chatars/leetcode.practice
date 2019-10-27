package leetcode.practice;

public class ReverseInteger {

	public static void main(String[] args) {
		int i = 323213112;
		
		System.out.println(reverseInt(i));

	}

	private static int reverseInt(int i) {
		int rev = 0;
		
		while (i != 0) {
			int pop = i % 10;
			i /= 10;
			if(rev > Integer.MAX_VALUE || (rev == Integer.MAX_VALUE && pop > 7)) return 0;
			if(rev < Integer.MIN_VALUE || (rev == Integer.MIN_VALUE && pop < -8)) return 0;
			rev = (rev * 10) + pop;
		}
		return rev;
	}

}
