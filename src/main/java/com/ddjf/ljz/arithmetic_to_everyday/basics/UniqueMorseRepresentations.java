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
	
/*	国际摩尔斯密码定义一种标准编码方式，将每个字母对应于一个由一系列点和短线组成的字符串， 比如: "a" 对应 ".-", "b" 对应 "-...", "c" 对应 "-.-.", 等等。

	为了方便，所有26个英文字母对应摩尔斯密码表如下：

	[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
	给定一个单词列表，每个单词可以写成每个字母对应摩尔斯密码的组合。例如，"cab" 可以写成 "-.-..--..."，(即 "-.-." + "-..." + ".-"字符串的结合)。我们将这样一个连接过程称作单词翻译。

	返回我们可以获得所有词不同单词翻译的数量。

	例如:
	输入: words = ["gin", "zen", "gig", "msg"]
	输出: 2
	解释: 
	各单词翻译如下:
	"gin" -> "--...-."
	"zen" -> "--...-."
	"gig" -> "--...--."
	"msg" -> "--...--."

	共有 2 种不同翻译, "--...-." 和 "--...--.".
	 

	注意:

	单词列表words 的长度不会超过 100。
	每个单词 words[i]的长度范围为 [1, 12]。
	每个单词 words[i]只包含小写字母。*/
	
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
