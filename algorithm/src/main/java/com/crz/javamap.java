package com.crz;

import java.util.HashMap;
import java.util.Map;

public class javamap {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("crz",18);
        map.put("mk",18);
        map.put("mk",20);
        System.out.println(map.toString());
        System.out.println(map.get("crz"));
    }

}
