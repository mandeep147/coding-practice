package edu.mandeep.karumanchi.trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	static void LevelOrder(TreeNode root) {
		if(root == null)
			return;

		Queue<TreeNode> queue = new LinkedList<TreeNode>();

		queue.offer(root);

		while(!queue.isEmpty()){
			TreeNode current = queue.poll();

			if( current != null){
				System.out.print(current.data + " ");
				if(current.left != null)
					queue.offer(current.left);

				if(current.right != null)
					queue.offer(current.right);
			}
		}
	}

	public static void main(String[] args){
		TreeNode root = createTree();
		System.out.print("Level-Order Traversal: ");
		LevelOrder(root);
	}	

	public static TreeNode createTree(){
		TreeNode root = new TreeNode(1);
		TreeNode node2=new TreeNode(2);  
		TreeNode node3=new TreeNode(3);  
		TreeNode node4=new TreeNode(4);  
		TreeNode node6=new TreeNode(6);  
		TreeNode node5=new TreeNode(5);  
		TreeNode node7=new TreeNode(7);  

		root.left=node2;  
		root.right=node3;  

		node2.left=node4;  
		node2.right=node5;  

		node3.left=node6;  
		node3.right=node7;  

		return root;
	}
}
