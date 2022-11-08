package com.lab.dsa2;

import java.util.ArrayList;

class Node { 
    
    int data; 
    Node left, right; 
      
    Node(int d) { 
        data = d; 
        left = right = null; 
    } 
} 
 

public class NodeFinding {
  
    Node root; 
  
    NodeFinding() {  
        root = null;  
    } 
      
    void inorder() 
    { 
        inorderUtil(this.root); 
    } 
      
    void inorderUtil(Node node) 
    { 
        if(node == null) 
            return; 
          
        inorderUtil(node.left); 
        System.out.print(node.data + " "); 
        inorderUtil(node.right); 
    } 
      
    void insert(int key) { 
    root = insertMain(root, key); 
    } 
      
    Node insertMain(Node root, int data) { 
  
        if (root == null) { 
            root = new Node(data); 
            return root; 
        } 
  
        if (data < root.data) 
            root.left = insertMain(root.left, data); 
        else if (data > root.data) 
            root.right = insertMain(root.right, data); 
  
        return root; 
    } 
      
    ArrayList<Integer> treeList(Node node, ArrayList<Integer> 
                                                      list) 
    {      
        if(node == null) 
            return list; 
          
        treeList(node.left, list); 
        list.add(node.data); 
        treeList(node.right, list); 
          
        return list; 
    } 
      
    boolean isPairPresent(Node node, int target) 
    {    
        ArrayList<Integer>a1 = new ArrayList<>();  
          
        ArrayList<Integer> a2 = treeList(node, a1);  
          
        int start = 0;
          
        int end = a2.size() - 1;
  
        while(start < end) 
        { 
          
        if(a2.get(start) + a2.get(end) == target)
        { 
            System.out.println("Pair is "+ "{" + a2.get(start)+ 
                      "  "+a2.get(end)+"}"); 
            return true; 
        } 
          
        if(a2.get(start) + a2.get(end)>target)
        { 
            end--; 
        } 
          
        if(a2.get(start) + a2.get(end)<target)
        { 
            start++; 
        } 
    } 
  
        System.out.println("nodes are not found."); 
        return false; 
    }
	
}
