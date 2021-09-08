package com.crz;

class Leetcode55 {
    public boolean canJump(int[] nums) {
        int end=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>= end-i)end=i;
        }
        if(end!=0)return false;
        return true;
    }
}