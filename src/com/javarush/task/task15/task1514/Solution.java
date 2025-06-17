package com.javarush.task.task15.task1514;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {
        System.out.println(labels);
    }

    static{
        labels.put(1.0,"a");
        labels.put(14.87,"auqwi");
        labels.put(123.123, "zzz");
        labels.put(12.3423,"adddd");
        labels.put(134355.9342, "asdddrussiiaann");





    }
}
