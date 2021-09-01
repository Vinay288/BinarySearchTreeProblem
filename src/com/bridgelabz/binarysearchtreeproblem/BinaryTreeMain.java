package com.bridgelabz.binarysearchtreeproblem;

public class BinaryTreeMain {

	public static void main(String[] args) {
		BinaryTree<Integer> binaryTree  = new BinaryTree<Integer>();
		int [] array= {56,70,30,95,60,65,63,67,22,40,11,3,16};
		for(int i:array) {
		binaryTree.add(i);
		}
		System.out.println(binaryTree.size());
		binaryTree.search(0);
	}

}
