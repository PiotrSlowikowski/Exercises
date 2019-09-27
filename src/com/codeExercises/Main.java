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
//        List<String> list = new ArrayList<String>();
//        list.add("small");
//        list.add("letters");
//        list.add("word");
//
//        int[] array = new int[3];
//        array[0] = 5;
//        array[1] = 32;
//        array[2] = 22;
//        System.out.println(findArray(array));
//        System.out.println(linearSearch(alist, 8));
//        System.out.println(reverse("abcd"));
//        System.out.println(findMax(alist));
//        System.out.println(average(alist));
//        System.out.println(toUpperCase(list));
//        System.out.println(getElement(alist, 3));
//        System.out.println(fizzBuzz(2));
//        System.out.println(isPrime(21));

    }
    

    public static boolean isPrime (Integer n) {

        int checker = 0;

        for (int i=1; i<=n; i++) {
            if (n%i==0) {
                checker++;
            }
        }
        if (checker == 2) {
            return true;
        }
        return false;
    }

    public static String fizzBuzz (Integer i) {

        if (i%3==0 && i%5==0) {
            return "FizzBuzz";
        } else if (i%3==0) {
            return "Fizz";
        } else if (i%5==0) {
            return "Buzz";
        }
        return i.toString();
    }

    public static Integer getElement(List<Integer> list, Integer n) {

        if (n >= list.size()) {
            return -1;
        }
        return list.get(n);
    }

    public static List<String> toUpperCase(List<String> list) {

        for (int i = 0; i < list.size(); i++) {

            list.add(i, list.get(i).toUpperCase());
            list.remove(i + 1);

        }
        return list;
    }

    public static Double average(List<Integer> list) {

        double number = 0;

        for (int i = 0; i < list.size(); i++) {
            number += list.get(i);

        }

        return number / list.size();

    }

    public static Integer findArray(int[] arrayList) {

        int max = 0;

        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i] > max) {
                max = arrayList[i];
            }
        }
        return max;
    }

    public static Integer findMax(List<Integer> list) {

        Integer max = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static String reverse(String s) {

        String reversed = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    public static Integer linearSearch(List<Integer> list, Integer n) {

        int counter = 1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == n) {
                return counter;
            }
            counter++;
        }
        return -1;
    }

    public static Integer factorial(Integer value) {

        int number = 1;

        for (int i = 1; i <= value; i++) {
            number = number * i;
        }
        return number;
    }

    public static Integer multiplesFiveEight(Integer n) {

        Integer value = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                value += i;
            }
        }
        return value;
    }

    public static Integer sum(Integer i, Integer j) {

        return i + j;

    }

}
