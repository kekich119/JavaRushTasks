package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread specialThread = new SpecialThread();
        SpecialThread specialThread1 = new SpecialThread();
        SpecialThread specialThread2 = new SpecialThread();
        SpecialThread specialThread3 = new SpecialThread();
        SpecialThread specialThread4 = new SpecialThread();

        Thread thread = new Thread(specialThread);
        list.add(thread);
        Thread thread1 = new Thread(specialThread1);
        list.add(thread1);
        Thread thread2 = new Thread(specialThread2);
        list.add(thread2);
        Thread thread3 = new Thread(specialThread3);
        list.add(thread3);
        Thread thread4 =  new Thread(specialThread4);
        list.add(thread4);



    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
