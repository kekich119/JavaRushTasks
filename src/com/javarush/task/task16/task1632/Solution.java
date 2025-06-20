package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new FirstThread());
        threads.add(new SecondThread());
        threads.add(new ThirdThread());
        threads.add(new FourthThread());
        threads.add(new FifthTread());
    }

    public static void main(String[] args) {
        for (Thread thread:threads){
            thread.start();
        }

    }
}


class FirstThread extends Thread {
    @Override
    public void run() {
        while (true) {

        }
    }
}

class SecondThread extends Thread {
    @Override
    public void run() {
        try {
            throw new InterruptedException();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}


class ThirdThread extends Thread {
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                System.out.println("Ура");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class FourthThread extends Thread implements Message {
    @Override
    public void showWarning() {
        this.interrupt();
    }

    @Override
    public void run() {
        while(!currentThread().isInterrupted()){

        }
    }
}

class FifthTread extends Thread {
    int sum = 0;
    @Override
    public void run() {
        while(!currentThread().isInterrupted()){
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        if(num.equals("N")){
            break;
        }
            sum += Integer.parseInt(num);
        }
        System.out.println(sum);


    }
}