package com.ddjf.ljz.arithmetic_to_everyday.structure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lijinzhang
 * @date 2019/09/25
 */
public class MergeTrees {
	
	public static void main(String[] args) {
		TreeNode t11 = new TreeNode(1);
		TreeNode t12 = new TreeNode(2);
		TreeNode t13 = new TreeNode(3);
		TreeNode t15 = new TreeNode(5);
		TreeNode t22 = new TreeNode(2);
		TreeNode t21 = new TreeNode(1);
		TreeNode t23 = new TreeNode(3);
		TreeNode t24 = new TreeNode(4);
		TreeNode t27 = new TreeNode(7);
		
		t13.left = t15;
		t11.left = t13;
		t11.right = t12;
		
		t21.right = t24;
		t22.left = t21;
		t23.right = t27;
		t22.right = t23;
		TreeNode t0 = merge(t11, t22);
		System.out.print(t0.toString());
		
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
	
	private static TreeNode merge(TreeNode t1, TreeNode t2) {
		if(t1 != null && t2 != null) {
			t1.val = t1.val + t2.val;
			t1.left = merge(t1.left, t2.left);
			t1.right = merge(t1.right, t2.right);
		}
		if(t1 == null && t2 != null) {
			t1 = new TreeNode(t2.val);
			t1.left = merge(null, t2.left);
			t1.right = merge(null, t2.right);
		}
		return t1;
	}
}
