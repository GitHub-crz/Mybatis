package com.crz;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    public Tree(){
        Node root=GetexmpleTree();
        if(IsMaxTree(root))System.out.println("yes");else System.out.println("no");
        firstroot(root);
    }
    static Node GetexmpleTree(){
        Node D=new Node(5);
        Node E=new Node(2);
        Node F=new Node(1);
        Node G=new Node(2);

        Node B=new Node(5,D,E);
        Node C=new Node(8,F,G);

        Node A=new Node(10,B,C);
        return A;
    }
    static boolean IsMaxTree(Node root){
        Queue<Node> Q=new LinkedList<>();
        Q.offer(root);
        Node N=null;
        while(!Q.isEmpty()){
            N=Q.poll();
            if(N.leftchild!=null){
                if(N.data<N.leftchild.data)return false;
                Q.offer(N.leftchild);
            }
            if(N.rightchild!=null){
                if(N.data<N.rightchild.data)return false;
                Q.offer(N.rightchild);
            }
        }
        return true;
    }
    static void firstroot(Node root){
        if(root!=null){
            System.out.println(root.data);
            firstroot(root.leftchild);
            firstroot(root.rightchild);
        }
    }
}
class Node{
    int data;
    Node leftchild;
    Node rightchild;
    public Node(int data,Node Lchild,Node Rchild){
        this.data=data;
        this.leftchild=Lchild;
        this.rightchild=Rchild;
    }
    public Node(int data){
        this.data=data;
        this.leftchild=null;
        this.rightchild=null;
    }
}
