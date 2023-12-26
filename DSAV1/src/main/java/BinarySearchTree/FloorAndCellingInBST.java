package BinarySearchTree;

public class FloorAndCellingInBST {

    private static class Node {
        int key ;
        Node left ;
        Node right ;
        public Node(int key){
            this.key = key;
            left = right = null;
        }
    }
    public static Node floor(Node root,int x){
        Node reslt = null;
        while (root != null){
            if (root.key == x){
                return root;
            }
            if (root.key > x){
                root = root.left;
            }else {
                reslt = root;
                root = root.right;
            }
        }
    return reslt;
    }

    public static Node ceil(Node root, int x){
        Node res=null;
        while(root!=null){
            if(root.key==x)
                return root;
            else if(root.key<x)
                root=root.right;
            else{
                res=root;
                root=root.left;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Node root=new Node(15);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.right=new Node(20);
        root.right.left=new Node(18);
        root.right.left.left=new Node(16);
        root.right.right=new Node(80);
        int x=17;
        System.out.println("Floor: "+(floor(root,17).key));
        System.out.println("==================");

        Node cellingroot=new Node(15);
        cellingroot.left=new Node(5);
        cellingroot.left.left=new Node(3);
        cellingroot.right=new Node(20);
        cellingroot.right.left=new Node(18);
        cellingroot.right.left.left=new Node(16);
        cellingroot.right.right=new Node(80);
        int k=17;

        System.out.println("Ceil: "+(ceil(cellingroot,17).key));
    }
}
