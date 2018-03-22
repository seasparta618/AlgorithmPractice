package datasctructure.algorithm.practice;

/**
 * 
 * @author Sparta
 * the first traversal and post traversal problem
 * new writting 2018 3 22
 */

public class BinaryTreeNode {

	private String name;
	private BinaryTreeNode leftNode;
	private BinaryTreeNode rightNode;

	public BinaryTreeNode(String name, BinaryTreeNode leftNode, BinaryTreeNode rightNode) {
		this.name = name;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BinaryTreeNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(BinaryTreeNode leftNode) {
		this.leftNode = leftNode;
	}

	public BinaryTreeNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(BinaryTreeNode rightNode) {
		this.rightNode = rightNode;
	}
	
	

}
