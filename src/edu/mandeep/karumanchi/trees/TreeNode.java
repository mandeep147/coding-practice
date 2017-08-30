package edu.mandeep.karumanchi.trees;

public class TreeNode {
	
	public int data;
	public TreeNode left;
	public TreeNode right;
	
	public TreeNode(){
		left = null;
		right = null;
	}
	
	public TreeNode(int data){
		this.data = data;
		left = null;
		right = null;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeft() {
		return left;
	}
	
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	
	public TreeNode getRight() {
		return right;
	}
	
	public void setRight(TreeNode right) {
		this.right = right;
	}	
}