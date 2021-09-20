package com.crz;

public class Leetcode134 {
    public static void main(String[] args) {
        System.out.println(new Solution().canCompleteCircuit(new int[]{1,2,3,4,5},new int[]{3,4,5,1,2}));
    }
    static class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            int n=0;
            for(int i=0;i<gas.length;i++){
                if(run(gas,cost,i))return i;
            }
            return -1;
        }
        boolean run(int gas[],int[] cost,int i){
            int t=0;
            int n=0;
            while(t<gas.length){
                n=n+gas[i];
                n=n-cost[i];
                if(n<0)return false;
                if(i==gas.length-1)i=0;
                else i++;
                t++;
                //System.out.println(t);
            }
            return true;
        }
    }
}
