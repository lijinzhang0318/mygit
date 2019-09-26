package com.ddjf.ljz.arithmetic_to_everyday.basics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lijinzhang
 * @date 2019/09/25
 */
public class RemoveOuterParentheses {
	
	public static void main(String[] args) {
		System.out.print(realize1("()()"));
	}
	
	private static String realize1(String S) {
		if(S.equals("")) return "";
		List<String> handledStr = new ArrayList<>();
		String temp = new String(S);
		int startIndex = 0;
		int lastIndex = genLastIndex(temp);
		int endIndex = lastIndex;
		while(lastIndex != 0) {
			handledStr.add(temp.substring(startIndex, endIndex + 1));
			startIndex = endIndex + 1;
			lastIndex = genLastIndex(temp.substring(endIndex + 1));
			endIndex = startIndex + lastIndex;
		}
		StringBuilder result = new StringBuilder();
		for(String str : handledStr) {
			result.append(str.substring(1, str.length() - 1));
		}
		return result.toString();
	}
	
	private static int genLastIndex(String str) {
		int result = 0;
		char[] array = str.toCharArray();
		for(int i=0; i<array.length; i++) {
			result += array[i] == '('? 1 : -1;
			if(result == 0) {
				return i;
			}
		}
		return result;
	}
	// (()())(())
}
