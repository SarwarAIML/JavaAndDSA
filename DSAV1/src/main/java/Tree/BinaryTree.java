package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    public static int diameter = 0 ;

   private static class Node {
        int key ;
        Node left ;
        Node right ;
        public Node(int key){
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

    /**
     *
     * @param root
     * @return
     * Given a binary tree, our task is to count toal nodes.
     * Two methods are discussed here, naive method which is O(n).
     * And an efficient method which is O(Log n * Log n)
     */
    public static int countNode1(Node root){
       if (root == null){
           return 0;
       }else {
           return 1+countNode1(root.left)+countNode1(root.right);
       }
    }

    /**
     *
     * @param root
     * @return
     * Given a binary tree, our task is to count total nodes.
     * Two methods are discussed here, naive method which is O(n).
     * And an efficient method which is O(Log n * Log n)
     */
    public static int countTotalNodes(Node root){
        int lh = 0;
        int rh = 0;
        Node current = root;
        while (current != null){
            lh ++;
            current = current.left;
        }
        while (current != null){
            rh ++;
            current = current.right;
        }
        if (lh == rh){
            return (int) (Math.pow(2, lh) - 1);
        }else {
            return 1+countTotalNodes(root.left)+countTotalNodes(root.right);
        }
    }

    /**
     *
     * @param root
     * @return
     * diamiter of the tree
     */
    public static int getHeight(Node root){
       if (root == null) return 0;
       int lh = getHeight(root.left);
       int rh = getHeight(root.right);
       diameter = Math.max(diameter,1+lh+rh);
       return 1+Math.max(lh,rh);
    }

    /**
     *
     * @param root
     * @return
     * return height of the tree recursively
     * height of tree defined as max height from root to
     */
    public static int heightOfTree(Node root){
       if (root == null){
           return 0;
       }else {
           return 1+Math.max(heightOfTree(root.left),heightOfTree(root.right));
       }
    }
    public static int getSize(Node root){
        if(root==null)
            return 0;
        else
            return 1+getSize(root.left)+getSize(root.right);
    }

    public static void printNodesAtKthDistance(Node root,int k){

        if (root == null) return;
        if (k==0){
            System.out.print(root.key + " ");
        }else {
            printNodesAtKthDistance(root.left,k-1);
            printNodesAtKthDistance(root.right,k-1);
        }
    }
    public static int getMax(Node root){
        if (root == null){
            return Integer.MIN_VALUE;
        }else {
            return Math.max(root.key,Math.max(getMax(root.left),getMax(root.right)));
        }
    }
    public static int maxlavel = 0;
    public static void printLeftView(Node root,int level){
        if (root == null) return;
        if (maxlavel < level){
            System.out.print(root.key +" ");
            maxlavel = level;
        }
        printLeftView(root.left,level+1);
        printLeftView(root.right,level+1);
    }

    /**
     *
     * @param root
     * @return
     * Description
     * Children Sum Property is a property in which the sum of values of the left child and
     * right child should be equal to the value of their node if both children are present.
     * Else if only one child is present then the value of the child should be equal to its node value.
     * In this video, we discuss a recursive function that takes the root node as a parameter
     * and returns TRUE if the Tree follows C.S.P. and FALSE if the Tree does not follow C.S.P.
     */
    public static boolean isChildrenSumProperty(Node root){
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;
        int sum = 0;
        if (root.left !=null)
            sum +=  root.left.key;
        if (root.right != null)
            sum += root.right.key;
        return (root.key == sum && isChildrenSumProperty(root.left) && isChildrenSumProperty(root.right));
    }

    /**
     *
     * @param root
     * @return
     * In a Balanced Binary Tree for every node, the difference between heights of
     * left subtree and right subtree should not be more than one.
     * In this video we discuss two solutions (one with time complexity of O(n^2)
     * and another with time complexity of O(n) ) to check whether a Tree is Balanced or not.
     */
    public static int isBalanced(Node root){
        if (root == null) return 0;
        int lh = isBalanced(root.left);
        if (lh == -1) return -1;
        int rh = isBalanced(root.right);
        if (rh == -1) return -1;
        if (Math.abs(lh- rh) > 1) {
            return -1;
        }else {
            return Math.max(lh,rh)+1;
        }
    }

    /**
     *
     * @param root
     * @return
     * Description
     *
     * Maximum Width of Binary tree is the maximum number of nodes present in a level of the Tree.
     * In this video, we discuss a function that takes the root of a Binary Tree and returns the maximum
     * width of the Binary Tree.
     * Hint:- we use level order traversal line by line logic to find maximum width of the Binary Tree.
     */
    public static int maxWidth(Node root){
        if(root==null)return 0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int res=0;
        while(q.isEmpty()==false){
            int count=q.size();
            res=Math.max(res,count);
            for(int i=0;i<count;i++){
                Node curr=q.poll();
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }
        return res;
    }

    static int preIndex=0;

    /**
     *
     * @param in
     * @param pre
     * @param is
     * @param ie
     * @return
     * This programme discusses the Construction of a Binary Tree from Inorder and Preorder traversal
     */
    public static Node cTree(int in[],int pre[],int is,int ie){
        if(is>ie)return null;
        Node root=new Node(pre[preIndex++]);

        int inIndex=is;
        for(int i=is;i<=ie;i++){
            if(in[i]==root.key){
                inIndex=i;
                break;
            }
        }
        root.left=cTree(in, pre, is, inIndex-1);
        root.right=cTree(in, pre, inIndex+1, ie);
        return root;
    }

    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }



    /**
     *
     * @param args
     * this is the main function to test the exting methods
     * in this class
     */

    public static void main(String[] args) {
        Node root = new Node(30);
        root.left = new Node(20);
        root.right = new Node(10);
        root.left.left = new Node(24);
        System.out.println(heightOfTree(root));
        System.out.println();
        System.out.println(" all node at kth distance are : ");

        Node root1=new Node(10);
        root1.left=new Node(20);
        root1.right=new Node(30);
        root1.left.left=new Node(40);
        root1.left.right=new Node(50);
        root1.right.right=new Node(70);
        root1.right.right.right=new Node(80);
        int k=2;
        printNodesAtKthDistance(root1,k);
        System.out.println();
        System.out.println("print size of tree ");
        Node root2=new Node(10);
        root2.left=new Node(20);
        root2.right=new Node(30);
        root2.left.left=new Node(40);
        root2.left.right=new Node(50);
        root2.right.right=new Node(60);

        System.out.println(getSize(root2));

        System.out.println();
        System.out.println("get max of the tree ");
        Node root3=new Node(20);
        root3.left=new Node(80);
        root3.right=new Node(30);
        root3.right.left=new Node(40);
        root3.right.right=new Node(50);

        System.out.println(getMax(root3));
        System.out.println();
        System.out.println("printing left view of binary tree ");
        Node root4=new Node(10);
        root4.left=new Node(20);
        root4.right=new Node(30);
        root4.right.left=new Node(40);
        root4.right.right=new Node(50);

        printLeftView(root4,1);
        System.out.println();
        System.out.println("Child sum property");

        Node root5=new Node(20);
        root5.left=new Node(8);
        root5.right=new Node(12);
        root5.right.left=new Node(3);
        root5.right.right=new Node(9);

        System.out.println(isChildrenSumProperty(root));
        System.out.println();
        System.out.println("check for balanced tree ");
        Node root6=new Node(10);
        root6.left=new Node(5);
        root6.right=new Node(30);
        root6.right.left=new Node(15);
        root6.right.right=new Node(20);
        if(isBalanced(root6)>0)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
        System.out.println("width of the bst is given as below");
        Node root7=new Node(10);
        root7.left=new Node(20);
        root7.right=new Node(30);
        root7.left.left=new Node(40);
        root7.left.right=new Node(50);
        root7.right.left=new Node(60);
        System.out.println(maxWidth(root));
        System.out.println();
        System.out.println("contruct tree from inorder and preorder");
        int in[]={20,10,40,30,50};
        int pre[]={10,20,30,40,50};
        int n= in.length;
        Node root8=cTree(in, pre, 0, n-1);
        inorder(root8);
        System.out.println();

        System.out.println("diameter of the tree");

        Node root9=new Node(10);
        root9.left=new Node(20);
        root9.right=new Node(30);
        root9.right.left=new Node(40);
        root9.right.right=new Node(60);
        root9.right.left.left=new Node(50);
        root9.right.right.right=new Node(70);

        System.out.println("Height: "+getHeight(root9));
        System.out.println("Diameter: "+diameter);
        System.out.println();
        System.out.println("printing all node from complete binary tree");
        Node root10=new Node(10);
        root10.left=new Node(20);
        root10.right=new Node(30);
        root10.right.left=new Node(40);
        root10.right.right=new Node(50);
        System.out.println(countTotalNodes(root10));
        System.out.println(countNode1(root10));
        System.out.println();
    }
}
