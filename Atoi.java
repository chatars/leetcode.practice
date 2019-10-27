package leetcode.practice;

public class Atoi {

	public static void main(String[] args) {
		int i = myAtoi("-42");
		System.out.println(i);
	}
	
	public static int myAtoi(String str) {
        
		if (str == null) return 0;
		
		str = str.trim();
		
		if (str.length() == 0) return 0;
		
		char firstChar = str.charAt(0);
		boolean isNegative = false;
		
		if(firstChar == '-') isNegative = true;
		
		long sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= '0' && c <= '9') {
				sum = sum * 10 + (c - '0');
			} else if (i == 0 && (c == '-') || c == '+') {
				continue;
			} else 
				break;
			
			
			if (sum <= Integer.MIN_VALUE || sum >= Integer.MAX_VALUE) break;
		}
		
		if (isNegative) 
			sum = -1 * sum;
		
		if (sum >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
		if (sum <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
        
        return (int) sum;
    }
}
