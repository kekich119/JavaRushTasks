package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String fileName = in.nextLine();

        try (FileInputStream input = new FileInputStream(fileName)) {
            int min = input.read();
            while (input.available() > 0) {
                int byt = input.read();
                if (byt < min){
                    min = byt;
                }
            }
            System.out.println(min);
        } catch (IOException e) {

        }
    }
}
