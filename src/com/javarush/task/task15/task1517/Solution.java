package com.javarush.task.task15.task1517;

/* 
Статики и исключения
*/

import java.io.IOException;

public class Solution {
    public static int A = 0;



    public static int B = 5;

    static {
        try {
            B = B / A;
        } catch (Exception except) {
            throw  except;
        }
    }


    public static void main(String[] args) {
        System.out.println(B);
    }
}
