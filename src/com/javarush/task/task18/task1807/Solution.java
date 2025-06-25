package com.javarush.task.task18.task1807;

import java.io.*;
import java.util.Scanner;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i = 0;
        String fileName = in.nextLine();
        try (FileInputStream inoutStream = new FileInputStream(fileName)) {
            while (inoutStream.available() > 0) {
                int byt = inoutStream.read();

                if (byt == 44) {
                    i++;

                }
            }
            System.out.println(i);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
