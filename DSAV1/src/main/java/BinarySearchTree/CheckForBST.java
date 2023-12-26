package BinarySearchTree;

public class CheckForBST {

    private static class Node{
        int key ;
        Node left ;
        Node right ;
        public Node(int key){
            this.key = key;
            this.left=this.right = null;
        }
    }

    /**
     *
     * @param root
     * @param min
     * @param max
     * @return
     * (1) pass a range for every node
     * for root ,range is Integer.MIN_VALUE, to , Integer.MAX_VALUE
     * for left child of node ,in range ,we change upper bond as the node's value
     * for right child of node ,in range ,we change the lowe bond as the Node's value
     */
    public static boolean isBST(Node root,int min,int max){

        if (root == null) return true;
        return (  (root.key > min && root.key<max) &&
                isBST(root.left,min ,root.key)  &&
                isBST(root.right,root.key,max));
    }

    static int prev=Integer.MIN_VALUE;
    public static boolean isBST(Node root)
    {
        if (root == null)
            return true;

        if(isBST(root.left)==false)
            return false;

        if(root.key<=prev)
            return false;
        prev=root.key;

        return isBST(root.right);
    }


    public static void main(String[] args) {

        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        if (isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }
}
