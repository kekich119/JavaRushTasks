package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String fileName = in.nextLine();
        int[] list = new int[256];

        try (FileInputStream input = new FileInputStream(fileName)) {
            while (input.available() > 0) {
                int byt = input.read();

                list[byt]++;
            }
        } catch (IOException e) {
        }


        int max = list[0];
        for (int j = 0; j < list.length; j++) {
            if (list[j] > max) {
                max = list[j];
            }
        }
        for (int j = 0; j < list.length; j++) {
            if (list[j] == max) {
                System.out.print(j + " ");
            }
        }


    }
}
