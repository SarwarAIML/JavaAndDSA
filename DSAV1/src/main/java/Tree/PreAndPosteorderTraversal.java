package Tree;

public class PreAndPosteorderTraversal {

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
    public static void preorder(Node root){
        if (root != null){
            System.out.print(root.key + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void postOrder(Node root){
        if (root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.key + " ");
        }
    }


    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);

        preorder(root);
        System.out.println();
        System.out.println("==========================");
        postOrder(root);
    }
}
