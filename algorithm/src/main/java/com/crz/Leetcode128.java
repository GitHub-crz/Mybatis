package com.crz;

import java.util.HashSet;
import java.util.Set;

public class Leetcode128 {
    public int longestConsecutive(int[] nums) {
            Set s=new HashSet();
        for (int num : nums) {
            s.add(num);
        }
        int ans=0;
        for (int num : nums) {
            if(s.contains(num-1))continue;
            int len=0;
            while(s.contains(num++))
                len++;
            ans=Math.max(ans,len);
        }
        return ans;
    }
}
