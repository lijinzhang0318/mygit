package com.ddjf.ljz.arithmetic_to_everyday.structure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lijinzhang
 * @date 2019/09/24
 */
public class RangeSumBST {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		TreeNode node3 = new TreeNode(3);
		TreeNode node7 = new TreeNode(7);
		TreeNode node18 = new TreeNode(18);
		TreeNode node5 = new TreeNode(5, node3, node7);
		TreeNode node15 = new TreeNode(15, null, node18);
		TreeNode root = new TreeNode(10, node5, node15);
		int num = realize1(root, 7, 15);
		long endTime = System.nanoTime();
		System.out.print("实现1执行结果：" + num + "	执行时间：" + (endTime - startTime) + "\n");
	}
	
	public static int realize1(TreeNode root, int L, int R) {
		List<Integer> inorder = inorderTraversal(root);
		int result = 0;
		for(Integer num : inorder) {
			if(num >= L && num <= R) {
				result += num;
			}
		}
        return result;
    }
	
	public static List<Integer> inorderTraversal(TreeNode node) {
		List<Integer> result = new ArrayList<>();
		if(node.left != null) {
			result.addAll(inorderTraversal(node.left));
		}
		result.add(node.val);
		if(node.right != null) {
			result.addAll(inorderTraversal(node.right));
		}
		return result;
	}
	
	public static class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
		 TreeNode(int x, TreeNode l, TreeNode r) {val = x; left = l; right = r;}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。

	二叉搜索树保证具有唯一的值。

	 

	示例 1：

	输入：root = [10,5,15,3,7,null,18], L = 7, R = 15
	输出：32
	示例 2：

	输入：root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
	输出：23
	 

	提示：

	树中的结点数量最多为 10000 个。
	最终的答案保证小于 2^31。*/

/*二叉搜索树（二叉查找树、二叉排序树）：
	它或者是一棵空树，或者是具有下列性质的二叉树： 若它的左子树不空，则左子树上所有结点的值均小于它的根结点的值； 
	若它的右子树不空，则右子树上所有结点的值均大于它的根结点的值； 它的左、右子树也分别为二叉排序树。
中序遍历：
	首先遍历左子树，然后访问根结点，最后遍历右子树。若二叉树为空则结束返回*/
