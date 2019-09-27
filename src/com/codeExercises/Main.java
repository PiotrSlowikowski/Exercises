package com.codeExercises;

public class Main {

    public static void main(String[] args) {

        System.out.println(sum(3,4));
        System.out.println(multiplesFiveEight(10));

    }

    public static Integer multiplesFiveEight (Integer n) {

        Integer value=0;

        for (int i=0; i<=n; i++) {
            if (i%3==0 || i%5==0) {
                value +=i;
            }
        }
        return value;
    }

    public static Integer sum (Integer i, Integer j) {

        return i+j;

    }

}
