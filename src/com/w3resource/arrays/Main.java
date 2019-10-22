package com.w3resource.arrays;

import java.util.Arrays;

public class Main {

    public static void main (String[] args) {
//        sorting();
//        int[] array = {4,5,2,76,12,33};
//        System.out.println(ex7(array, 33));
        int[] array = {99,2,19,32,37,22,44,3,0,-25};
//        System.out.println(ex10(array));
        System.out.println(ex11(array));


    }

    public static String ex11 (int[] values) {
        int[] newArray = new int[values.length];

        for (int i=0; i<values.length; i++) {
            newArray[i] = values[values.length-1-i];
        }
        return Arrays.toString(newArray);
    }

    public static String ex10(int[] values) {


        int min = values[0];
        int max = values[0];

        for (int i=0; i<values.length; i++) {

            if (values[i]<min) {
                min = values[i];
            } else if (values[i] > max) {
                max = values[i];
            }

        }

        return "Max is: " + max + " Min is: " + min;
    }


}
