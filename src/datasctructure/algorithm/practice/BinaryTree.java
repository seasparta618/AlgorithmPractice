package datasctructure.algorithm.practice;


public class BinaryTree {

	public BinaryTreeNode init(){
		BinaryTreeNode M = new BinaryTreeNode("m",null,null);
		BinaryTreeNode L = new BinaryTreeNode("l",null,null);
		BinaryTreeNode F = new BinaryTreeNode("f",null,null);
		BinaryTreeNode I = new BinaryTreeNode("i",null,null);
		BinaryTreeNode J = new BinaryTreeNode("j",null,null);
		BinaryTreeNode K = new BinaryTreeNode("k",L,M);
		BinaryTreeNode H = new BinaryTreeNode("h",null,K);
		BinaryTreeNode G = new BinaryTreeNode("g",null,null);
		BinaryTreeNode E = new BinaryTreeNode("e",null,F);
		BinaryTreeNode D = new BinaryTreeNode("d",G,H);
		BinaryTreeNode C = new BinaryTreeNode("c",D,E);
		BinaryTreeNode B = new BinaryTreeNode("b",J,I);
		BinaryTreeNode A = new BinaryTreeNode("a",B,C);
		return A;
	}
	
	public void printNode(BinaryTreeNode btNode){
		System.out.println(btNode.getName());
	}
	
	public void firstTraversal(BinaryTreeNode root){
		printNode(root);
		if(root.getLeftNode()!=null){
			firstTraversal(root.getLeftNode());
		}if(root.getRightNode()!=null){
			firstTraversal(root.getRightNode());
		}
	}
	public void postTraversal(BinaryTreeNode root){
		if(root.getLeftNode()!=null){
			postTraversal(root.getLeftNode());
		}if(root.getRightNode()!=null){
			postTraversal(root.getRightNode());
		}
		printNode(root);
	}
	public static void main(String[] ar){
		BinaryTree tree = new BinaryTree();
		BinaryTreeNode root = tree.init();
		System.out.println("First traversal");
		tree.firstTraversal(root);
		System.out.println("Post traversal");
		tree.postTraversal(root);
	}
}
