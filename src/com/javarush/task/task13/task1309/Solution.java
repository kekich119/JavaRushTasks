package com.javarush.task.task13.task1309;

/* 
Всё, что движется
*/

public class Solution {
    public static void main(String[] args) throws Exception {

    }

    public interface CanMove{
        public Double speed();
    }

    public interface CanFly extends CanMove{
        public Double speed(CanFly a);
    }

}