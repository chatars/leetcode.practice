package leetcode.practice;

import java.util.Arrays;

public class AnagramCount {

	public static void main(String[] args) {
		
		System.out.println(countAnagrams("forxxorfxdofr","for"));
		System.out.println(countAnagrams("aabaabaa","aaba"));

	}

	private static int countAnagrams(String str1, String str2) {
		int count = 0;
		for(int i=0; i<=str1.length()-str2.length();i++) {
			String temp = str1.substring(i, i + str2.length());
			if(isAnagram(temp, str2)) {
				count++;
			}
		}
		
		return count;
	}

	

	private static boolean isAnagram(String temp, String str2) {
		System.out.println(temp+ " "+ str2);
		char[] arr1 = temp.toLowerCase().toCharArray();
		char[] arr2 = str2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
	}

}
