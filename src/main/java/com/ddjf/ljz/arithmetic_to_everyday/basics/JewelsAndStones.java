package com.ddjf.ljz.arithmetic_to_everyday.basics;

/**
 * @author lijinzhang
 * @date 2019/09/23
 */
public class JewelsAndStones {
	public static void main(String[] args) {
		String J = "aZ";
		String S = "aaBBcczZ";
		int count = 0;
		long startTime = System.nanoTime();
		count = realize1(J, S);
		long endTime = System.nanoTime();
		System.out.print("实现1执行结果：" + count + "	执行时间：" + (endTime - startTime) + "\n");
		startTime = System.nanoTime();
		count = realize2(J, S);
		endTime = System.nanoTime();
		System.out.print("实现2执行结果：" + count + "	执行时间：" + (endTime - startTime) + "\n");
	}
	
	private static int realize1(String J, String S) {
		int result = 0;
		for(int i=0; i<J.length(); i++) {
			for(int j=0; j<S.length(); j++) {
				if(J.substring(i, i + 1).equals(S.substring(j, j + 1))) {
					result++;
				}
			}
		}
		return result;
	}
	
	private static int realize2(String J, String S) {
		if(J == null || J.isEmpty()) return 0;
		if(S == null || S.isEmpty()) return 0;
		char[] array = new char[58];
		for(char c : J.toCharArray()) {
			array[c - 65] = 1;
		}
		int result = 0;
		for(char c : S.toCharArray()) {
			if(array[c - 65] == 1) result++;
		}
		return result;
	}
	
/*	①字符串转字符数组：char[] array = str.toCharArray()
	②A-z的ASCII码范围 65~122（A-Z:65~90，a-z:97~122）*/
}
