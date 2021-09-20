package com.crz;

public class Leetcode74 {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int m=matrix.length-1;
            int n=0;
            while(n<matrix[0].length&&m>=0){
                if(matrix[m][n]<target)n++;
                else if(matrix[m][n]>target)m--;
                else return true;
            }
            return false;
        }
    }
}
