package com.w3resource.arrays.arrays.string;

public class Main{

    public static void main (String[] args) {

//        System.out.println(ex7());
//        System.out.println(ex8());
        System.out.println(ex12());

    }

    public static boolean ex12() {
        String s1 = "Java Exercises";
        String ending = "ses";


        if (s1.substring(s1.length()-1-ending.length(), s1.length()-1).equals(ending)) {
            return true;
        }
        return false;
    }

    public static boolean ex8 () {

        String sentence = "PHP Exercises and Python Exercises";
        String sequence = "and";

        if (sentence.contains(sequence)) {
            return true;
        }
        return false;
    }

    public static String ex7() {

        String str1 = "PHP Exercises and ";
        String str2 = "Java exercises";
        String str3 = str1.concat(str2);
        return str3;
    }

}