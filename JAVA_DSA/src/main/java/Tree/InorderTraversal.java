package Tree;


import java.util.Stack;

public class InorderTraversal {

    private static class Node{
        int key ;
        Node left ;
        Node right ;
        public Node(int key){
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }
    public static int sum = 0;
    /**
     * this is the recursive solution
     * @param root
     */
    public static void inorder(Node root){

        if (root != null){
            inorder(root.left);

            System.out.print(root.key+ " ");
            sum += root.key;
            System.out.println("sum "+ sum);
            inorder(root.right);
        }
    }

    public static void iterativeInorder(Node root){
        Stack<Node> stack = new Stack<>();
        Node current = root;

    }

    /**
     * this is the main method to test utility methods
     * @param args
     */
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);

        inorder(root);
    }
}
