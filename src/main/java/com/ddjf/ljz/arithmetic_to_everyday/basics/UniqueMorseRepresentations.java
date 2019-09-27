package com.ddjf.ljz.arithmetic_to_everyday.basics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author lijinzhang
 * @date 2019/09/27
 */
public class UniqueMorseRepresentations {
	
	public static void main(String[] args) {
		String[] words = {"gin", "zen", "gig", "msg"};
		System.out.print(realize1(words));
	}
	
	private static int realize1(String[] words) {
		String[] morses = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		Map<Integer, String> map = new HashMap<>();
		for(int i=0; i<morses.length; i++) {
			map.put(97 + i, morses[i]);
		}
		String[] translate = new String[words.length];
		for(int j=0; j<words.length; j++) {
			char[] array = words[j].toCharArray();
			StringBuilder str = new StringBuilder();
			for(int z=0; z<array.length; z++) {
				str.append(map.get((int)array[z]));
			}
			translate[j] = str.toString();
		}
		Set<String> result = new HashSet<>();
		for(int y=0; y<translate.length; y++) {
			result.add(translate[y]);
		}
		return result.size();
	}
}
