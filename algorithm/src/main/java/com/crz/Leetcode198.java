package com.crz;


import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;


public class Leetcode198 {
    class solution{
        public int rob(int[] nums) {
            if(nums.length==0)return 0;
            if(nums.length==1)return nums[0];
            if(nums.length==2)return Math.max(nums[0],nums[1]);
            int[] dp=new int[nums.length];
            dp[0]=nums[0];
            dp[1]=Math.max(nums[0],nums[1]);
            for(int i=2;i<dp.length;i++){
                dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
            }
            return dp[dp.length-1];
        }
    }

    public static void main(String[] args) {
        Leetcode198 l=new Leetcode198();
        System.out.println(l.new solution().rob(new int[]{1,9,8,6,7,4}));
    }
}
