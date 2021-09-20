package com.crz;

import java.util.Arrays;

public class Leetcode881 {
    public static void main(String[] args) {
        System.out.println(new Solution().numRescueBoats(new int[]{3,5,3,4},5));
    }
    static class Solution {
        int num=0;
        public int numRescueBoats(int[] people, int limit) {
            Arrays.sort(people);
            dp(people,limit);
            return num;
        }
        void dp(int[] people,int limit){

            if(people.length==1){
                num++;
                return;
            }

            if(people.length==0){
                return;
            }

            if(people[0]+people[people.length-1]<=limit){

                people=remian2(people);

                num++;
                dp(people,limit);
            }

            else {
                people=remian1(people);
                num++;
                dp(people,limit);
            }
        }
        int[] remian1(int[] people){
            int[] ans=new int[people.length-1];
            for(int i=0;i<people.length-1;i++)
                ans[i]=people[i];
            return ans;
        }
        int[] remian2(int[] people){
            int[] ans=new int[people.length-2];
            for(int i=0;i<people.length-2;i++)
                ans[i]=people[i+1];
            return ans;
        }
    }
}
