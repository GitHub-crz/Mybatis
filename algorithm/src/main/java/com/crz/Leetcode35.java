package com.crz;

import java.util.ArrayList;
import java.util.List;

public class Leetcode35 {
    class Solution {
        List<String> L=new ArrayList<>();
        public List<String> fizzBuzz(int n) {
            //List<String> L=new List<>();
            for(int i=0;i<=n;i++){
                fuc(i);
            }
            return L;
        }
        void fuc(int i){
            if(i%3==0&&i%5==0)L.add("FizzBuzz");
            else if(i%3==0)L.add("Fizz");
            else if(i%5==0)L.add("Buzz");
            else L.add(String.valueOf((char)i));
        }
    }
}
