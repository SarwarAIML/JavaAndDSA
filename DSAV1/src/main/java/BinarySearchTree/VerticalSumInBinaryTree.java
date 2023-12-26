package BinarySearchTree;

import java.util.Map;
import java.util.TreeMap;

public class VerticalSumInBinaryTree {
    private static class Node{
        int key ;
        Node left ;
        Node right ;
        public Node(int key){
            this.key = key;
            this.left = this.right = null;
        }
    }

    public static void verticalSum(Node root, int hd, TreeMap<Integer,Integer> map){
            if (root == null){
                return;
            }
            verticalSum(root.left,hd-1,map);
            int psum = map.get(hd) == null?0:map.get(hd);
            map.put(hd,psum+root.key);
            verticalSum(root.right,hd+1,map);
    }

    public static void verticalSum(Node root){
        TreeMap<Integer,Integer> map= new TreeMap<Integer,Integer>();
        verticalSum(root,0,map);
        for (Map.Entry e: map.entrySet()) {
            System.out.print(e.getValue()+" ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(30);
        root.left = new Node(20);
        root.right= new Node(40);
        root.left.left = new Node(15);
        root.right.right= new Node(50);
       verticalSum(root);
    }
}
