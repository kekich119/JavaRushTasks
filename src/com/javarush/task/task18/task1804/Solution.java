package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int[] array = new int[256];

        String fileName = in.nextLine();

        try(FileInputStream inputStream = new FileInputStream(fileName)){
            while(inputStream.available() > 0){
                int byt = inputStream.read();
                array[byt]++;

            }

        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            if(array[i] > 0 && array[i] < min){
                min = array[i];
            }
        }

        for (int j = 0; j < array.length; j++) {
            if (array[j] == min){
                System.out.print(j + " ");
            }

        }


    }
}
