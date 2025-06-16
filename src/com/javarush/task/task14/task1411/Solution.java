package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key;


        while (true) {
            key = reader.readLine();
            boolean u = key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("proger");
            if (!u) {
                break;
            }

            switch (key) {
                case "user":
                    new Person.User();
                case "loser":
                    new Person.Loser();
                case "coder":
                    new Person.Coder();
                case "proger":
                    new Person.Proger();
            }
            doWork(person); //вызываем doWork
        }


    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        }
        if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        }
        if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        }
        if (person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        }
    }
}
