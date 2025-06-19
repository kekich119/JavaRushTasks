package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Последовательный вывод файлов
*/

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        Scanner in = new Scanner(System.in);
        firstFileName = in.nextLine();
        secondFileName = in.nextLine();
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        String nameFile;
        String result = "";


        public void setFileName(String fullFileName) {
            this.nameFile = fullFileName;
        }

        @Override
        public String getFileContent() {


            return result ;
        }

        @Override
        public void run() {
            try (BufferedReader reader = new BufferedReader(new FileReader(nameFile))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    result += line + " ";
                }


            } catch (IOException e) {
                System.out.println("Файл ненайден");
            }

        }
    }
}
