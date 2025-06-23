package com.javarush.task.task17.task1721;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws CorruptedDataException {
        Scanner in = new Scanner(System.in);
        String fileName1 = in.nextLine();
        String fileName2 = in.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName1));
             BufferedReader reader2 = new BufferedReader(new FileReader(fileName2))) {


            String line;
            String line2;

            while ((line2 = reader2.readLine()) != null) {
                forRemoveLines.add(line2);
            }

            while ((line = reader.readLine()) != null) {
                allLines.add(line);

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        Solution s = new Solution();
        s.joinData();

    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        }else{
            allLines.clear();
            throw  new CorruptedDataException();
        }

    }


    public void readList(List<String> list) {
        for (String lines : list) {
            System.out.println(lines);
        }

    }
}
