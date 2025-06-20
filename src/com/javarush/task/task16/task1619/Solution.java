package com.javarush.task.task16.task1619;

/* 
А без interrupt слабо?
*/

import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        cancel();
    }

    private static boolean isCancel = false;

    public static void cancel()
    {
        isCancel = true;
    }

    public static class TestThread implements Runnable {


        public void run() {
            while (isCancel== false) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
