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
//        System.out.println(fibonacci(4));
//        System.out.println(isPalindrome("abcdefedcba"));
//        System.out.println(evenFibonacci(1000));
//        System.out.println(greatestCommonDivisor(5,15));
//        System.out.println(cesarCipher("v"));


    }


    public static String cesarCipher (String word) {

        StringBuilder sb = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i=0; i<word.length(); i++) {
            for (int j=0; j<alphabet.length(); j++) {
                if (word.charAt(i) == alphabet.charAt(j) && j<21) {
                    sb.append(alphabet.charAt(j+5));
                } else if (word.charAt(i) == alphabet.charAt(j) && j>=21) {
                    sb.append(alphabet.charAt(j-21));
                }
            }
        }
        return sb.toString();
    }

    public static Integer greatestCommonDivisor(Integer p, Integer q) {

        int divisor = 0;

        if (p>q) {
            for (int i=1; i<=p; i++) {
                if (p%i==0 && q%i==0) {
                    divisor = i;
                }
            }

        } else if (q>=p) {
            for (int i=1; i<=q; i++) {
                if (q%i==0 && p%i==0) {

                    divisor = i;

                }
            }

        }
        return divisor;

    }

    public static Integer evenFibonacci(Integer n) {

        int sum = 0;
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);

        for (int i = 2; i <= n; i++) {

            list.add(i, list.get((i-2))+(list.get(i-1)));
            if ((list.get(i)%2==0) && (list.get(i)<n)) {
                sum += list.get(i);
            } else if (list.get(i)>n) {
                list.remove(i);
                return sum;
            }
        }
        return sum;
    }

    public static boolean isPalindrome(String word) {

        int counter = 0;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == word.charAt(word.length() - i - 1)) {
                counter++;
            }

        }
        if (counter == word.length()) {
            return true;
        }

        return false;
    }

    public static Integer fibonacci(Integer n) {

        Integer value = 0;
        List<Integer> list = new ArrayList<Integer>();
        list.add(0, 0);
        list.add(1, 1);

        for (int i = 2; i <= n; i++) {

            value = list.get(i - 2) + list.get(i - 1);
            list.add(i, value);
        }
        return list.get(n);
    }

    public static boolean isPrime(Integer n) {

        int checker = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                checker++;
            }
        }
        if (checker == 2) {
            return true;
        }
        return false;
    }

    public static String fizzBuzz(Integer i) {

        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
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
