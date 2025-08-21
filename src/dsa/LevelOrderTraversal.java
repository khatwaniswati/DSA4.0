package dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LevelOrderTraversal {
    public static void main(String[] args) {

        Node n1 = new Node(3);
        Node n2 = new Node(9);
        Node n3 = new Node(20);
        Node n4 = new Node(15);
        Node n5 = new Node(7);

        Node root = n1;
        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;

        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        int level = 0;
        levelOrderTraversal3(root,level,map);

        //print Map
        for(Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()){
            System. out.print("Level:"+entry.getKey()+": ");
            for (Integer al: entry.getValue()){
                System.out.print(al+" ");
            }
            System.out.println();
        }
    }

    static void levelOrderTraversal3(Node root, int level, HashMap<Integer, ArrayList<Integer>> map) {
        if(root == null){
            return;
        }

        if(map.containsKey(level)){
            ArrayList<Integer> arrayList = map.get(level);
            arrayList.add(root.data);
        }else{
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(root.data);
            map.put(level,arrayList);
        }

        int newLevel = level+1;
        levelOrderTraversal3(root.left,newLevel,map);
        levelOrderTraversal3(root.right,newLevel,map);
    }

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
}
