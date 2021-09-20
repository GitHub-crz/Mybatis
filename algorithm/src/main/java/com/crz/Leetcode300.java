package com.crz;

import java.util.Arrays;

public class Leetcode300 {
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLIS(new int[]{0,1,0,3,2,3}));
    }
    static class Solution {
        public int lengthOfLIS(int[] nums) {
            int[] dp=new int[nums.length];
            for(int i=0;i<dp.length;i++)dp[i]=1;
            for(int i=1,temp=0;i<nums.length;i++){
                for(int j=0;j<i;j++){
                    if(nums[i]>nums[j])if(dp[j]>temp)temp=dp[j];
                }
                dp[i]=temp+1;
            }
            System.out.println(Arrays.toString(dp));
            return dp[dp.length-1];
        }
    }
}
