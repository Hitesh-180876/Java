class BinaryTreeNode<T>{
    public T data;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;
    
    public BinaryTreeNode(T data){
        this.data = data;
        
    }
}
public class MyClass {
    public static void printTree(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
        // if(root.left != null){
        //     printTree(root.left);
        // }
        // if(root.right != null){
        //     printTree(root.right);
        // }
        
    }
    public static void main(String args[]) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
        
        root.left = rootLeft;
        root.right = rootRight;
        
        BinaryTreeNode<Integer> twoRight/*rootLeft.right*/ = new BinaryTreeNode<Integer>(4);
        BinaryTreeNode<Integer> twoLeft/*rootRight.left*/ = new BinaryTreeNode<Integer>(5);
    
        rootLeft.right = twoRight;
        rootRight.left = twoLeft;
        
        printTree(root);
    }
}
