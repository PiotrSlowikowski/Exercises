package com.w3resource.arrays.arrays.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main (String[] args) {
//        sorting();
//        int[] array = {4,5,2,76,12,33};
//        System.out.println(ex7(array, 33));
//        int[] array = {99,2,19,32,37,22,44,3,0,-25};
//        System.out.println(ex10(array));
//        System.out.println(ex11(array));
//        String[] array1 = {"one", "two", "three", "four", "five"};
//        String[] array2 = {"sex", "seven", "eight", "four", "nine"};
//        ex14(array1, array2);
//        System.out.println(ex15());
        int[] array = {1254, 2035, 1899, 1456, 2013,
                1458, 2458, 10789, 1472, 2365,
                1456, 2165, 1, 2};
//        ex17(array);
        ex18(array);

    }

    public static void ex18 (int[] myArray) {

        Arrays.sort(myArray);
        System.out.println(myArray[1]);

        List<Integer> list = new ArrayList<>();
        list.add(myArray[0]);
    }

    public static void ex17(int[] myArray) {

        //1st way
//        int max=myArray[0];
//        int secondMax=myArray[0];
//
//        for (int i=0; i<myArray.length; i++) {
//            if (max<myArray[i]) {
//                max = myArray[i];
//            }
//        }
//
//        for (int j=0; j<myArray.length; j++) {
//            if (secondMax<myArray[j] && myArray[j] != max) {
//                secondMax = myArray[j];
//            }
//        }
//        System.out.println(secondMax);

        //2nd way
        Arrays.sort(myArray);
        System.out.println(myArray[myArray.length-2]);

    }

    public static List<Integer> ex15 () {

        List<Integer> list = new ArrayList<>();

        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};


        for (int i=0; i< array1.length; i++) {
            for (int j=0; j<array2.length;j++) {
                if (array1[i] == array2[j]) {
                    list.add(array1[i]);
                }
            }
        }
        return list;

    }

    public static void ex14 (String[] array1, String[] array2) {

        for (int i=0; i<array1.length; i++) {
            for (int j=0; j<array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    System.out.println("Element is common between arrays: " + array1[i]
                    + " at position: " + j + " in second array.");
                }
            }
        }

    }

    public static void ex13(String[] myArray) {


        for (int i=0; i<myArray.length;i++) {
            for (int j=0; j<myArray.length;j++) {
                if (myArray[i].equals(myArray[j])&& i!=j){
                    System.out.println("Duplicate is: "+myArray[j]);
                }
            }
        }


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
