package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String fileName = in.nextLine();
        TreeSet<Integer> list = new TreeSet<>();

        try (FileInputStream inputStream = new FileInputStream(fileName)){
            while(inputStream.available() > 0){
                int byt = inputStream.read();
                list.add(byt);
            }
        }

        for (int i : list){
            System.out.print(i + " ");
        }

    }
}
