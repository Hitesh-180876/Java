import java.util.Scanner;

class BinaryTreeNode<T>{
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;
	
	public BinaryTreeNode(T data){
		this.data = data;
	}
}
public class BST {
	public static int numNodes(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		return 1+numNodes(root.left)+numNodes(root.right);
		
		
	}
	public static void printTree(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.println(root.data+ ": ");
		if(root.left != null) {
			System.out.println("L"+ root.left.data+" ");
			
		}
		if(root.right != null) {
			System.out.println("R"+ root.right.data);
		}
		//System.out.println();
		
		printTree(root.left);
		printTree(root.right);
		
	}
	public static BinaryTreeNode<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild = takeInput();
		BinaryTreeNode<Integer> rightChild = takeInput();
		root.left = leftChild;
		root.right = rightChild;
		
		return root;
		
	}
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInput();
		printTree(root);
		int numOfnodes = numNodes(root);
		System.out.println(numOfnodes);
	}
}
