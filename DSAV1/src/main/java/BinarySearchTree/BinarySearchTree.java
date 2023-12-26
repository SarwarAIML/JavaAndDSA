package BinarySearchTree;

public class BinarySearchTree {

    private static class Node{
        int key ;
        Node left;
        Node right ;
        public Node(int key){
            this.key = key;
            this.left = right = null;
        }
    }

    /**
     * recursive method to find the key in bst
     * @param root
     * @param x
     * @return
     */
    public static boolean searchRec(Node root,int x){
        if ( root == null) return false;
        if (root.key == x)
            return  true;
        else if (root.key > x)
            return searchRec(root.left,x);
        else
            return searchRec(root.right,x);
    }

    /**
     * this the iterative solution to search a item in BST
     * @param root
     * @param x
     * @return
     */
    public static boolean search(Node root, int x){
        while(root!=null){
            if(root.key==x)
                return true;
            else if(root.key>x)
                root=root.left;
            else
                root=root.right;
        }
        return false;
    }

    public static Node insertNodeRec(Node root,int x){
        if (root == null)
            return new Node(x);
        else if (root.key > x)
            root.left = insertNodeRec(root.left,x);
        else if (root.key < x)
            root.right = insertNodeRec(root.right,x);
        return root;
    }
    public static Node insertNodeIterative(Node root,int x){
        Node temp = new Node(x);
        Node parrent = null;
        Node current = root;
        while (current != null){
            parrent = current;
            if (current.key >x) {
                current = current.left;
            }
            else if(current.key < x) {
                current = current.right;
            }
            else {
                return root;
            }
        }
        if (parrent == null){
            return temp;
        }else if(parrent.key > x){
            parrent.left = temp;
        } else if (parrent.key < x) {
            parrent.right = temp;
        }
        return  root;
    }

    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
    public static Node getSuccessor(Node curr){
        curr=curr.right;
        while(curr!=null && curr.left!=null)
            curr=curr.left;
        return curr;
    }

    public static Node delNode(Node root, int x){
        if(root==null)
            return root;
        if(root.key>x)
            root.left=delNode(root.left,x);
        else if(root.key<x)
            root.right=delNode(root.right,x);
        else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                Node succ=getSuccessor(root);
                root.key=succ.key;
                root.right=delNode(root.right,succ.key);
            }
        }
        return root;
    }

    /**
     * this is the main methods to test the other utility method
     * @param args
     */
    public static void main(String[] args) {

        Node searchroot=new Node(15);
        searchroot.left=new Node(5);
        searchroot.left.left=new Node(3);
        searchroot.right=new Node(20);
        searchroot.right.left=new Node(18);
        searchroot.right.left.left=new Node(16);
        searchroot.right.right=new Node(80);
        int x=16;
        if(searchRec(searchroot,x))
            System.out.println("Found");
        else
            System.out.println("Not Found");
        System.out.println("search item iteratively  ");
        Node iterativeroot=new Node(15);
        iterativeroot.left=new Node(5);
        iterativeroot.left.left=new Node(3);
        iterativeroot.right=new Node(20);
        iterativeroot.right.left=new Node(18);
        iterativeroot.right.left.left=new Node(16);
        iterativeroot.right.right=new Node(80);
        int y=16;

        if(search(iterativeroot,y))
            System.out.println("Found");
        else
            System.out.println("Not Found");
        System.out.println("::::::::::::::::::::::::insert recursively ::::::::::::");

        Node recInsertroot=new Node(10);
        recInsertroot.left=new Node(5);
        recInsertroot.right=new Node(15);
        recInsertroot.right.left=new Node(12);
        recInsertroot.right.right=new Node(18);
        int isertrx=20;

        recInsertroot=insertNodeRec(recInsertroot,isertrx);
        inorder(recInsertroot);
        System.out.println();
        System.out.println("::::::::::::::::::::::::insert iterative ::::::::::::::::::");
        Node IterativeInsertroot=new Node(10);
        IterativeInsertroot.left=new Node(5);
        IterativeInsertroot.right=new Node(15);
        IterativeInsertroot.right.left=new Node(12);
        IterativeInsertroot.right.right=new Node(18);
        int IterativeInsertx=20;

        IterativeInsertroot=insertNodeIterative(IterativeInsertroot,IterativeInsertx);
        inorder(IterativeInsertroot);
        System.out.println("============deleting of node===== ");
        Node deleteroot=new Node(10);
        deleteroot.left=new Node(5);
        deleteroot.right=new Node(15);
        deleteroot.right.left=new Node(12);
        deleteroot.right.right=new Node(18);
        int deletex=15;

        deleteroot=delNode(deleteroot,deletex);
        inorder(deleteroot);
    }

}
