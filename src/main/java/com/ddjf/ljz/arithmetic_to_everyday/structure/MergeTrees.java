package com.ddjf.ljz.arithmetic_to_everyday.structure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lijinzhang
 * @date 2019/09/25
 */
public class MergeTrees {
	
	public static void main(String[] args) {
		
	}
	
	private static TreeNode realize1(TreeNode t1, TreeNode t2) {
		TreeNode result = new TreeNode(0);
		
		return result;
	}
	
	public static class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	  }
	
	private static List<Integer> inorderTraversal(TreeNode t) {
		List<Integer> result = new ArrayList<>();
		if(t.left == null) {
			result.add(t.val);
			result.addAll(inorderTraversal(t.right));
		} else {
			result.addAll(inorderTraversal(t.left));
		}
		return result;
	}
}
