package paypal;

public class BinaryTreeNode {

    public int value;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(int value) {
        this.value = value;
    }

    public BinaryTreeNode insertLeft(int leftValue) {
        this.left = new BinaryTreeNode(leftValue);
        return this.left;
    }

    public BinaryTreeNode insertRight(int rightValue) {
        this.right = new BinaryTreeNode(rightValue);
        return this.right;
    }
    public static boolean isBST(BinaryTreeNode root,int min,int max){
        if (root == null) return true;
        return ( root.value >min && root.value < max ) &&
                isBST(root.left , min, root.value ) && isBST(root.right,root.value,max);
    }

    public static void main(String[] args) {

        BinaryTreeNode root = new BinaryTreeNode(20);
        root.left = new BinaryTreeNode(9);
        root.right = new BinaryTreeNode(25);
        root.left.left = new BinaryTreeNode(5);
        root.left.right = new BinaryTreeNode(17);
        root.left.right.left = new BinaryTreeNode(11);
        root.left.right.right = new BinaryTreeNode(14);
        System.out.println(isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
    }
}
