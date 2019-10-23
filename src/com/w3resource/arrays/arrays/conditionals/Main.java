package com.w3resource.arrays.arrays.conditionals;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        ex1(3);
//        ex2(9, 5, 12);
//        ex5();

    }

    public static void ex6(double a, double b) {





    }

    public static void ex5() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number:");
        int a = scanner.nextInt();

        switch (a) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
                default:
                    System.out.println("Number out of range");

        }

    }

    public static void ex2(int a, int b, int c) {

        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else if (c > a && c > b) {
            System.out.println(c);
        }

    }

    public static void ex1(int n) {

        if (n % 2 == 0) {
            System.out.println(n + " is positive");
        } else if (n % 2 != 0) {
            System.out.println(n + " is negative");
        }

    }

}