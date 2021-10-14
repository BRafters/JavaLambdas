package com.company;

import com.company.abstractFunctions.*;

public class Main {

    public static void main(String[] args) {
        // Appends a string to another string
        StringAppender strAppender = (String strToAppendTo, String strToAppend) -> {
            return strToAppendTo + strToAppend;
        };

        // Adds two numbers
        Adder adder = (int x, int y) -> {
            return x + y;
        };

        // Can also be simplified to
        // Adder adder = (int x, int y) -> x + y;

        System.out.println(adder.add(5, 5));
        System.out.println(strAppender.appender("Hello", " World"));
    }
}
