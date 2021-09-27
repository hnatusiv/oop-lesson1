package com.dmdev.oop.lesson1;

public class TestExample {
    public static void main(String[] args) {
        int value = 10;
        int[] values= {value,16,167,25};
        printArray(values);
    }

    private static void printArray(int[] values) {
        for (int value:values) {
            System.out.println(value);
        }
    }
}
