package com.codeExercises;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        System.out.println(sum(3,3));
//        System.out.println(multiplesFiveEight(10));
//        System.out.println(factorial(5));
//        List<Integer> alist = new ArrayList<>();
//        alist.add(115);
//        alist.add(48);
//        alist.add(13);
//        alist.add(17);
//
//        int[] array = new int[3];
//        array[0] = 5;
//        array[1] = 32;
//        array[2] = 22;
//        System.out.println(findArray(array));
//        System.out.println(linearSearch(alist, 8));
//        System.out.println(reverse("abcd"));
//        System.out.println(findMax(alist));


    }



    public static Integer findArray(int[] arrayList) {

        int max = 0;

        for (int i=0; i<arrayList.length; i++) {
            if (arrayList[i] > max) {
                max = arrayList[i];
            }
        }
        return max;
    }

    public static Integer findMax(List<Integer> list) {

        Integer max = 0;

        for (int i=0; i<list.size(); i++) {
            if (list.get(i)>max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static String reverse (String s) {

        String reversed = "";

        for (int i=s.length()-1; i>=0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    public static Integer linearSearch(List<Integer> list, Integer n) {

        int counter=1;

        for (int i=0; i<list.size(); i++) {
            if (list.get(i)==n) {
                return counter;
            }
            counter++;
        }
        return -1;
    }

    public static Integer factorial (Integer value) {

        int number = 1;

        for (int i=1; i<=value; i++) {
            number = number*i;
        }
        return number;
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
