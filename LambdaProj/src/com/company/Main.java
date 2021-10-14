package com.company;

import com.company.abstractFunctions.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> randomNumbers = new ArrayList<>();

        /*
         *  Lambda expressions can be stored in variables to call if there is a
         *  corresponding functional interface that it can refer to
         */
        // Appends a string to another string
        StringAppender strAppender = (String strToAppendTo, String strToAppend) -> {
            return strToAppendTo + strToAppend;
        };

        // Adds two numbers
        Adder adder = (int x, int y) -> {
            return x + y;
        };

        /*
         * Expressions are limited & have to immediately return a value
         * Cannot contain variables, assignments, or statements ie: 'if' & 'for'
         */
        genRandNumsForArray(randomNumbers);

        System.out.println("Random numbers\n==============");
        randomNumbers.forEach((element) -> System.out.println(element));
        System.out.println();

        // Can also be simplified to
        // Adder adder = (int x, int y) -> x + y;

        System.out.println(adder.add(5, 5));
        System.out.println(strAppender.appender("Hello", " World"));
    }

    public static void genRandNumsForArray(ArrayList<Integer> arr){
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            arr.add(rand.nextInt(10) + 1);
        }
    }
}
