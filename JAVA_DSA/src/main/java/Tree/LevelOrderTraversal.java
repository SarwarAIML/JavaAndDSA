package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderTraversal {

    private static class Node
    {
        int key;
        Node left;
        Node right;
        Node(int k){
            key=k;
            left=right=null;
        }
    }

    /**
     *
     * @param root
     * this is the level order traversal of the tree
     */
    public static void printLevel(Node root){
        if (root == null) return;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()){
            int count = queue.size();
            for (int i = 0; i <count ; i++) {
                Node current = queue.poll();
                System.out.print(current.key + " ");
                if (current.left != null){
                    queue.add(current.left);
                }
                if (current.right != null){
                    queue.add(current.right);
                }
            }

        }
    }

    /**
     *
     * @param root
     * This programme describe the method of Tree Traversal in Spiral Form.
     */
    public static void printSpiral(Node root){
        if(root==null)return;
        Queue<Node> q=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        boolean reverse=false;
        q.add(root);
        while(!q.isEmpty()){
            int count=q.size();
            for(int i=0;i<count;i++){
                Node curr=q.poll();
                if(reverse)
                    s.add(curr.key);
                else
                    System.out.print(curr.key+" ");
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            if(reverse){
                while(!s.isEmpty()){
                    System.out.print(s.pop()+" ");
                }
            }
            reverse=!reverse;
        }
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);
        root.right.right=new Node(70);
        printLevel(root);
        System.out.println();
        System.out.println("=========level order spriral travell ==========");

        Node root1=new Node(1);
        root1.left=new Node(2);
        root1.right=new Node(3);
        root1.left.left=new Node(4);
        root1.left.right=new Node(5);
        root1.right.left=new Node(6);
        root1.right.right=new Node(7);

        printSpiral(root1);
    }

}
