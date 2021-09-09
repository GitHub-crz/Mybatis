package com.crz;

public class Leetcode334 {
    public boolean increasingTriplet(int[] nums) {
        int i=0,j=1,k=2;
        for(;k<nums.length;i++,j++,k++){
            if(nums[i]<nums[j]&&nums[j]<nums[k])return true;
        }
        return false;
    }
}
