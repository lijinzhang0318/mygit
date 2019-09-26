package com.ddjf.ljz.arithmetic_to_everyday.basics;

/**
 * @author lijinzhang
 * @date 2019/09/25
 */
public class ToLowerCase {
	
	public static void main(String[] args) {
		System.out.print(realize1("lOVE"));
	} 
	
	private static String realize1(String str) {
		StringBuilder result = new StringBuilder();
		char[] array = str.toCharArray();
		for(char ch : array) {
			if(ch >= 65 && ch <= 90) {
				ch = (char)(ch + 32);
			}
			result.append(ch);
		}
		
		return result.toString();
	}
}
