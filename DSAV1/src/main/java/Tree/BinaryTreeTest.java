package Tree;

import java.util.*;

/**
 *
 */
public class BinaryTreeTest {

    private static class Node<E>{
        Node left;
        Node right;
        int key;
        public Node(int key){
            this.key = key;
            this.left = this.right = null;
        }
        public  Node insertLeft(int data){
            this.left = new Node(data);
            return this.left;
        }
        public Node insertRight(int data){
            this.right = new Node(data);
            return this.right;
        }
    }
    public static void inorderRec(Node root){
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }
    public static void preOder(Node root){
        if (root != null) {
            System.out.print(root.key + " ");
            preOder(root.left);
            preOder(root.right);
        }

    }
    public static void postOrder(Node root){
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.key+" ");
        }
    }

    /**
     * Height of the tree is the number of edges
     * in the tree from the root to the deepest(leaf node) node, Height of the empty tree is 0.
     * @param root
     * @return
     */
    public static int height(Node root) {
        if (root == null)
            return 0;
            return 1 + Math.max(height(root.left), height(root.right));
    }

    /**
     *
     * @param root
     * @param k
     *
     * Nodes at distance k from the root are basically the nodes at
     * (k+1)th level of the Binary Tree.
     * In this video, we discuss a function that takes root and k as a parameter,
     * whose return type
     * is void and is supposed to print the nodes at distance k from the root.
     */
    public static void prinNodestAtk(Node root,int k){
        if (root == null) return;
        if (k==0)
            System.out.print(root.key + " ");
        prinNodestAtk(root.left,k-1);
        prinNodestAtk(root.right,k-1);
    }

    /**
     *
     * @param root
     */
    public static void levelOrderTraverse(Node root){
        if (root == null) return;
        Queue<Node> queue = new ArrayDeque<Node>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node current = queue.poll();
            System.out.print(current.key +" ");
            if (current.left != null)
                queue.add(current.left);
            if (current.right != null)
                queue.add(current.right);
        }
    }

    /**
     * level order traverse or
     * dfs traverse
     * this method will print line by line in each level
     *
     * @param root
     */
    public static void levelOrderTraverseType2(Node root){

        if (root == null) return;
        Queue<Node> queue = new ArrayDeque<Node>();
        queue.add(root);
        while (!queue.isEmpty()){
            int count  = queue.size();
            for (int i = 0; i <count ; i++) {
                Node current =  queue.poll();
                System.out.print(current.key + " ");
                if (current.left != null)
                    queue.add(current.left);
                if (current.right != null)
                    queue.add(current.right);
            }
            System.out.println();
        }
    }

    /**
     * Size of Binary Tree is the total numbers of nodes present in that Tree.
     * @param root
     * @return
     */
    public static int size(Node root){
        if (root == null) return 0;
        return 1+size(root.left)+size(root.right);
    }

    public static int getMaxInBST(Node root){
        if (root == null){
            return Integer.MIN_VALUE;
        }else {
            return Math.max( root.key,Math.max(getMaxInBST(root.left),getMaxInBST(root.right)));
        }
    }

    public static int getSumofAllNodesValues(Node root) {
        if (root == null)
            return 0;
            return  (root.key + getSumofAllNodesValues(root.left) + getSumofAllNodesValues(root.right));
    }

    public static int max_level = 0;

    /**
     * To Print Left View of Binary Tree we need to print the
     * leftmost node at every level of the Binary Tree.
     * this is the recursive solutions
     * @param root
     * @param level
     */
    public static void printLeftNodes(Node root ,int level){
        if (root == null)
            return;
        if (max_level < level)
        {
            System.out.print(root.key+" ");
            max_level = level;
        }
        printLeftNodes(root.left,level+1);
        printLeftNodes(root.right,level+1);
    }

    /**
     * this is iterative call to print left nodes of the tree
     * @param root
     */
    public static void printLeft(Node root){
        if (root == null) return;
            Queue<Node> queue = new ArrayDeque<Node>();
            queue.add(root);
            while (!queue.isEmpty()){
                int count = queue.size();
                for (int i = 0; i <count ; i++) {
                    Node current = queue.poll();
                    if (i==0)
                        System.out.print(current.key +" ");
                    if (current.left != null)
                        queue.add(current.left);
                    if (current.right != null)
                        queue.add(current.right);
                }
            }
    }
    public static boolean isChildSumEqual(Node root){
        if (root == null) return true;
        if (root.right == null && root.left == null) return true;
        int sum = 0;
        if (root.left != null){
            sum += root.left.key;
        }
        if (root.right != null){
            sum += root.right.key;
        }
        return root.key == sum && isChildSumEqual(root.left) && isChildSumEqual(root.right);
    }
    public static int isBalanced(Node root){
       if (root == null) return 0;
       int lh = isBalanced(root.left);
       if (lh == -1) return -1;
       int rh = isBalanced(root.right);
       if (Math.abs(lh-rh) > 1){
            return -1;
       }else {
           return Math.max(lh,rh)+1;
       }
    }

    /**
     * Maximum Width of Binary tree is the maximum
     * number of nodes present in a level of the Tree.
     * @param root
     * @return
     */
    public static int getMaximumWidthofBST(Node root){
        if (root == null)
            return 0;
        Queue<Node> queue = new ArrayDeque<Node>();
        queue.add(root);
        int maxnodesSize = 0;
        while (!queue.isEmpty()){
            int count = queue.size();
            maxnodesSize = Math.max(maxnodesSize,count);
            for (int i = 0; i <count ; i++) {
                Node current = queue.poll();
                if (current.left != null)
                    queue.add(current.left);
                if (current.right != null)
                    queue.add(current.right);
            }
        }
        return maxnodesSize;
    }

    public static int preIndex = 0;

    public static Node createTree(int[] in,int[] pre,int inStart,int inEnd){

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for (int i = 0; i <in.length ; i++) {
            map.put(in[i],i);
        }
        if (inStart > inEnd) return null;
        Node root  = new Node<>(pre[preIndex++]);
        if (inStart == inEnd)
            return root;

    //    int inIndex = search(in,inStart,inEnd,root.key);
        int inIndex = map.get(root.key);
        root.left = createTree(in,pre,inStart,inIndex-1);
        root.right = createTree(in,pre,inIndex+1,inEnd);
        return root;
    }

    private static int search(int[] in, int inStart, int inEnd, int key) {
        int i;
        for ( i = inStart; i <=inEnd ; i++) {
            if (in[i] == key)
                return i;
        }
        return i;
    }

    /**
     * this is efficient method in terms of space comlexcity
     * @param root
     */
    public static void printSpiralEfficient(Node root){
        if (root == null)
            return;
        Stack<Node> stack1 = new Stack<Node>();
        Stack<Node> stack2 = new Stack<Node>();
        stack1.add(root);
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                Node current = stack1.peek();
                stack1.pop();
                System.out.print(current.key + " ");
                if (current.right != null)
                    stack2.add(current.right);
                if (current.left != null)
                    stack2.add(current.left);
            }
            while (!stack2.isEmpty()) {
                Node current = stack2.peek();
                stack2.pop();
                System.out.print(current.key+" ");
                if (current.left != null)
                    stack1.add(current.left);
                if (current.right != null)
                    stack1.add(current.right);
            }
        }
    }

    public  static void zigzagTraversal(Node root){
        if (root == null) return;
        Queue<Node> queue = new ArrayDeque<Node>();
        Stack<Integer> nodeStack = new Stack<>();
        boolean isReverse = false;
        queue.add(root);
        while (!queue.isEmpty()){
            int count = queue.size();
            for (int i = 0; i <count ; i++) {
                Node current = queue.poll();
                if (isReverse){
                    nodeStack.add(current.key);
                }else {
                    System.out.print(current.key +" ");
                }
                if (current.left != null)
                    queue.add(current.left);
                if (current.right !=null)
                    queue.add(current.right);
            }
            if (isReverse) {
                while (!nodeStack.isEmpty())
                    System.out.println(nodeStack.pop() + " ");
            }
            isReverse = !isReverse;
            System.out.println();
        }
    }
    public static int DIMETER = 0;

    /**
     *
     * @param root
     * @return
     *
     * The diameter of a binary tree is the length of the longest path
     * between any two nodes in a tree. This path may or may not pass through the root .
     * The length of a path between two nodes is
     * represented by the number of edges between them
     */
    public static int heigth(Node root){
        if (root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        DIMETER = Math.max(DIMETER,1+lh+rh);
        return 1+Math.max(lh,rh);
    }

    /**
     *
     * @param root
     * @return
     * Given a binary tree, our task is to count toal nodes in a BST
     */
    public static int countBTNodes(Node root){
        if (root == null) return 0;
        else
            return 1+ countBTNodes(root.left)+countBTNodes(root.right);
    }

    public static int countNodes(Node root){
        if (root == null)
            return 0;
        int lh = 0;
        int rh = 0 ;
       Node current = root;
       while (current != null){
           lh ++;
           current = current.left;
       }
       current = root;
       while (current != null){
           rh++;
           current = current.right;
       }
       if (lh == rh){
           return (int) (Math.pow(2, lh) - 1);
       }else {
           return 1+countBTNodes(root.left)+countBTNodes(root.right);
       }
    }









    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Node root =  new Node<>(20);
        root.left = new Node(9);
        root.right = new Node(25);
        root.left.left = new Node(5);
        root.left.right = new Node(12);
        root.left.right.left = new Node(11);
        root.left.right.right = new Node(14);
        inorderRec(root);
        System.out.println();
        System.out.println("=====pre order traversal======= ");
        preOder(root);
        System.out.println();
        System.out.println("======post order traversal =============");
        postOrder(root);
        System.out.println();
        System.out.println("======all nodes at the kth distance from root node =============");
        prinNodestAtk(root,3);
        System.out.println();
        System.out.println("level order traversal");
        levelOrderTraverse(root);
        System.out.println();
        System.out.println("level order traversal line by line");
        levelOrderTraverseType2(root) ;
        System.out.println();
        System.out.println("Size of the BST tree");
        System.out.println(size(root));
        System.out.println("get max element in the BST ");
        System.out.println(getMaxInBST(root));
        System.out.println("get the sum off all the nodes");
        System.out.println(getSumofAllNodesValues(root));
        System.out.println();
        System.out.println("print all left node of bast ");
        printLeftNodes(root,1);
        System.out.println();
        System.out.println("print all left node of bast iteratively");
        printLeft(root);
        System.out.println("child sum property of BST");
        Node childroot=new Node(20);
        childroot.left=new Node(8);
        childroot.right=new Node(12);
        childroot.right.left=new Node(3);
        childroot.right.right=new Node(9);
        System.out.println(isChildSumEqual(childroot));
        System.out.println();
        Node isBalancedroot=new Node(10);
        isBalancedroot.left=new Node(5);
        isBalancedroot.right=new Node(30);
        isBalancedroot.right.left=new Node(15);
        isBalancedroot.right.right=new Node(20);

        if(isBalanced(isBalancedroot) > 0)
            System.out.print("Balanced");
        else
            System.out.print("Not Balanced");
        System.out.println();
        System.out.println("width of the BST");
        System.out.println(getMaximumWidthofBST(root));
        System.out.println();
        System.out.println("create tree from infix and prefix arrays");

        int in[]={20,10,40,30,50};
        int pre[]={10,20,30,40,50};
        int n= in.length;
        Node root1=createTree(in, pre, 0, n-1);
        inorderRec(root1);
        System.out.println();
        System.out.println("zig zag traversal using 2 stack");

        Node spiralroot=new Node(1);
        spiralroot.left=new Node(2);
        spiralroot.right=new Node(3);
        spiralroot.left.left=new Node(4);
        spiralroot.left.right=new Node(5);
        spiralroot.right.left=new Node(6);
        spiralroot.right.right=new Node(7);

        printSpiralEfficient(spiralroot);

        System.out.println("diameter of the tree");

        Node diameterroot=new Node(10);
        diameterroot.left=new Node(20);
        diameterroot.right=new Node(30);
        diameterroot.right.left=new Node(40);
        diameterroot.right.right=new Node(60);
        diameterroot.right.left.left=new Node(50);
        diameterroot.right.right.right=new Node(70);

        System.out.println("Height: "+heigth(diameterroot));
        System.out.println("Diameter: "+DIMETER);
        System.out.println("total numbers of the nodes in the BST");

        Node totalnoderoot=new Node(10);
        totalnoderoot.left=new Node(20);
        totalnoderoot.right=new Node(30);
        totalnoderoot.right.left=new Node(40);
        totalnoderoot.right.right=new Node(50);
        totalnoderoot.right.right.right=new Node(70);

        System.out.print(countNodes(totalnoderoot));
    }
}
