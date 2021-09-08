package com.crz;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Leetcode15 {
    static int all=0;
    static List<int[]> L=new LinkedList<>();
    public static void main(String[] args) {
        sss s=new sss();
        s.threeSum(new int[]{-1,0,1,2,-1,-2});
        System.out.println(s.L.toString());

    }
}
 class sss{
     static List<List<Integer>> L=new LinkedList<>();
     public List<List<Integer>> threeSum(int[] nums) {
         List<List<Integer>> L=new LinkedList<>();
         S(nums,-999999999,-999999999);
         //System.out.println(L.toString());
         Arrays.sort(nums);
         System.out.println(Arrays.toString(nums));
        return L;
     }
    public void S(int[] num,int i1,int i2){
        List<Integer> l=new LinkedList<>();
        for(int i=max(max(i1,i2),0);i<num.length;i++){
            if(i!=i1&&i!=i2){
                if(i1==-999999999)S(num,i,-999999999);
                else if(i2==-999999999)S(num,i1,i);
                else {
                    //System.out.println(num[i1]+" "+num[i2]+" "+num[i]);
                    if(num[i1]+num[i2]+num[i]==0){
                        //int[] l=new int[]{num[i1],num[i2],num[i]};
                        l.clear();
                        l.add(num[i1]);
                        l.add(num[i2]);
                        l.add(num[i]);
                        System.out.println(l.toString());
                        if(!exist(l)){
                            //System.out.println(l.toString());
                            L.add(l);
                        }

                    }
                }
            }
        }
    }
    public int max(int x,int y){
         if(x>y)return x;
         return y;
    }
    public boolean exist(List<Integer> l){
         for(int i=0;i<L.size();i++){
             if(same(l,L.get(i)))return true;

         }
         return false;
    }
    public boolean same(List<Integer> l1,List<Integer> l2){
         //List<Integer> l=l2;
         for(int i=0,size=l2.size();i<size;i++){
             //System.out.println("l2="+l2.toString());
             l2=del(l2,l1.get(i));
             //if(l2.size()!=0)return false;
         }
        if(l2.size()==0)return true;
        return false;
    }
    public List<Integer> del(List<Integer> l,int n){
         for(int i=0;i<l.size();i++){
             if(l.get(i)==n){
                 l.remove(i);
                 return l;
             }
         }
         return l;
    }
}

 class ReCode{
     public List<List<Integer>> threeSum(int[] nums) {
        //int[] num;
         Arrays.sort(nums);
         List<List<Integer>> lists=new LinkedList<>();
         int[] ans=new int[nums.length];
         for(int i=0;i<nums.length;i++){
             int l=i+1;
             int r=nums.length-1;
             while(l<r) {

                 if (nums[i] + nums[l] + nums[r] == 0) {
                     List<Integer> list = new LinkedList<>();
                     list.add(i);
                     list.add(l);
                     list.add(r);
                     lists.add(list);
                 }
                 else if(nums[i] + nums[l] + nums[r]>0)r--;
                 else if(nums[i] + nums[l] + nums[r]<0)l++;

             }
         }
         return lists;
     }
}
