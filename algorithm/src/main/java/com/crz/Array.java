package com.crz;

import java.util.Arrays;
import java.util.LinkedList;

public class Array {

    public static void main(String[] args) {
        //zeroonearray z=new zeroonearray();
        fullarray f=new fullarray();

    }
}
class zeroonearray{
    LinkedList<String> L=new LinkedList<>();
    public zeroonearray(){
        DFS(4,"");
        for(int i=0;i<L.size();i++){
            System.out.println(L.get(i));
        }
    }
    void DFS(int n,String S){
        if(n==0)L.add(S);
        else{DFS(n-1,S+"0");
            DFS(n-1,S+"1");}
    }
}
class fullarray{
    LinkedList<int[]> L=new LinkedList<>();
    public fullarray(){
        int[] n=new int[]{1,2,3};
        int[] ans=new int[n.length];
        DFS(n,ans);
        for(int i=0;i<L.size();i++){
            System.out.println(Arrays.toString(L.get(i)));
        }
    }
    void DFS(int[] n,int[] ans){
        if(n.length==1){
            ans[0]=n[0];
            //System.out.println(Arrays.toString(ans));
            //System.out.println(ans[0]+","+ans[1]+","+ans[2]);
            int[] a=new int[ans.length];
            for(int i=0;i<ans.length;i++)a[i]=ans[i];
            L.add(a);
        }

        else for(int i=0;i<n.length;i++){
            ans[n.length-1]=n[i];
            DFS(getreint(n,n[i]),ans);
        }
    }

    int[] getreint(int[] n,int m){
        int[] mm=new int[n.length-1];
        for(int i=0,j=0;i<n.length;i++,j++){
            if(n[i]!=m)mm[j]=n[i];
            else j--;
        }
        return mm;
    }
}

