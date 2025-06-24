package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String fileName = in.nextLine();

        try(FileInputStream inputStream = new FileInputStream(fileName)){
            int max = inputStream.read();
            while(inputStream.available() > 0){
                int data = inputStream.read();
                if (data > max){
                    max = data;
                }
            }
            System.out.println(max);



        }catch (IOException e){

        }

    }
}
