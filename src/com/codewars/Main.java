package com.codewars;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


//        System.out.println(morseDecoder(".... . -.--  -.. ..- -.. ."));;

//        int[] numbers = {2,1,1,1,1,1};
//        System.out.println(strayNumber(numbers));
//        System.out.println(populationGrowth(1000, 2, 50, 3200) + " years will be needed");
//        System.out.println(ownedCatAndDog(15,15));
//        System.out.println(findSum(10));
//        System.out.println(thirdAngleOfTriangl(34, 84));
//        System.out.println(sumArray(numbers));
//        String[] array = {"2:2", "5:3", "2:1", "4:1", "1:1"};
//        System.out.println("Points: "+points(array))
//        System.out.println(evenOrOdd(5));
//        System.out.println(opposite(83));
//        System.out.println(repeatStr(12, "LIFE : - )"));
//        System.out.println(removeFirstLast("mefedron"));
//        int[] numbers = {2, 83, -1, -39, 101};
//        System.out.println(findSmallestInt(numbers));
//        System.out.println(makeNegative(5));
//        System.out.println(noSpace("kot ma kota  dasdasd"));
//        Boolean[] sheeps = {true, true, true, false,
//                true, true, true, true,
//                true, false, true, false,
//                true, false, false, true,
//                true, true, true, true,
//                false, false, true, true};
//        System.out.println(countSheeps(sheeps));
//        System.out.println(basicMath("*",4,2));
//        System.out.println(boolToWord(true));
//        int[] out.println(countSumArray(array));
//        Object[] stringArray = {"hay", true, "hay", null, "moreJunk", "needle", "randomJunk"};
//        System.out.println(findNeedle(stringArray));
//        System.out.println(toStringMethod(32));
//        int[] numbers = {4, 1, 1, 1, 4};
//        System.out.println(sum(numbers));
//        System.out.println(abbrevName("Sam Harris"));
//        map(numbers);
//        System.out.println(findShort("How could they knew about that"));


    }

    public static int findShort(String s) {

        int minimum = s.length();
        String[] arrayOfStrings = s.split(" ");
        for (int i=0; i<arrayOfStrings.length; i++) {
            if (arrayOfStrings[i].length() < minimum) {
                minimum = arrayOfStrings[i].length();
            }
        }
        return minimum;
    }

    public static int[] map(int[] arr) {

        int[] values = new int[arr.length];


        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++) {
            map.put(i, 2*arr[i]);
            values[i] = map.get(i);
        }
        return values;
    }

    public static String abbrevName (String name) {

        String[] words = name.split(" ");
        return words[0].substring(0,1).toUpperCase() + "." + words[1].substring(0,1).toUpperCase();
    }


    public static int sum(int[] numbers) {

        int sum = 0;

        if (numbers == null || numbers.length == 1 || numbers.length == 0) {
            return 0;
        } else if (numbers.length > 1) {
            int max = numbers[0];
            int min = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (max >= numbers[i]) {
                    max = numbers[i];
                } else if (min < numbers[i]) {
                    min = numbers[i];
                }
                sum += numbers[i];
            }
            return sum - max - min;
        }
        return 0;

    }

    public static String toStringMethod(int num) {

        return Integer.toString(num);

    }

    public static String findNeedle(Object[] haystack) {

        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] != null) {
                if (haystack[i].equals("needle")) {
                    return "Found the needle at position: " + i;
                }
            } else {
                continue;
            }
        }

        return "Oww";
    }

    public static int[] countSumArray(int[] input) {

        int[] emptyArray = {};
        int counter = 0;
        int sum = 0;

        if (input != null) {
            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0) {
                    counter++;
                } else if (input[i] < 0) {
                    sum += input[i];
                }
            }
            if (counter == 0 & sum == 0) {

                return emptyArray;
            }
        } else {
            return emptyArray;
        }

        int[] finalArray = {counter, sum};
        return finalArray;
    }

    public static String boolToWord(boolean b) {

        if (b == true) {
            return "Yes";
        }
        return "Ya";
    }

    public static double basicMath(String op, int v1, int v2) {

        if (op.equals("+")) {
            return v1 + v2;
        } else if (op.equals("-")) {
            return v1 - v2;
        } else if (op.equals("*")) {
            return v1 * v2;
        } else if (op.equals("/")) {
            return v1 / v2;
        }
        return v2;
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {

        int counter = 0;

        for (int i = 0; i < arrayOfSheeps.length; i++) {

            if (arrayOfSheeps[i].equals(true)) {
                counter += 1;
            }
        }
        return counter;
    }

    public static String noSpace(String x) {
        String empty = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

//        for (int i=0; i<x.length(); i++) {
//            for (int j=0; j<alphabet.length(); j++) {
//                if (x.charAt(i) == alphabet.charAt(j)) {
//                    empty +=x.charAt(i);
//                }
//
//            }
//
//        }
//        return empty;
        return x.replaceAll("\\s", "");
    }

    public static int makeNegative(final int x) {


        if (x > 0) {
            return x - 2 * x;
        }
        return x;
    }

    public static int findSmallestInt(int[] args) {

        int minimum = args[0];

        for (int i = 0; i < args.length; i++) {
            if (args[i] < minimum) {

                minimum = args[i];

            }
        }
        return minimum;
    }

    public static String removeFirstLast(String str) {

        return str.substring(1, str.length() - 1);

    }

    public static String repeatStr(final int repeat, final String str) {

        String toBeFilled = "";

        for (int i = 0; i < repeat; i++) {
            toBeFilled += str + "...";
        }
        return toBeFilled;
    }

    public static int opposite(int number) {

        if (number < 0) {
            return Math.abs(number);
        } else if (number > 0) {
            return number - 2 * number;
        }
        return 0;
    }

    public static String evenOrOdd(int number) {

        if (number % 2 == 0) {
            return "The number is even.";
        } else if (number % 2 != 0) {
            return "The number is odd.";
        }
        return "The end";
    }

    public static int points(String[] games) {

        int points = 0;

        for (int i = 0; i < games.length; i++) {
            String[] scores = games[i].split(":");
            int a = Integer.parseInt(scores[0]);
            int b = Integer.parseInt(scores[1]);

            if (a > b) {
                points += 3;
            } else if (a == b) {
                points += 1;
            }

        }
        return points;
    }

    public static int sumArray(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                sum += array[i];
            }

        }
        return sum;
    }

    public static int strintToNum(String str) {

        int a = Integer.parseInt(str);
        return a;
    }

    public static int thirdAngleOfTriangl(int a, int b) {

        return 180 - (a + b);

    }

    public static int findSum(int n) {
        //Sum of all the multiples of 3 or 5

        int counter = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                counter += i;
            } else if (i % 5 == 0) {
                counter += i;
            }

        }
        return counter;
    }

    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {

        int ownedCat = 0;
        int ownedDog = 0;

        for (int i = 1; i <= catYears; i++) {
            if (i == 1) {
                ownedCat += 15;
            } else if (i == 2) {
                ownedCat += 9;
            } else if (i > 2) {
                ownedCat += 4;
            }
        }

        for (int j = 1; j <= dogYears; j++) {

            if (j == 1) {
                ownedDog += 15;
            } else if (j == 2) {
                ownedDog += 9;
            } else if (j > 2) {
                ownedDog += 5;
            }
        }


        return new int[]{ownedCat, ownedDog};
    }

    public static int populationGrowth(int p0, double percent, int aug, int p) {

        int n = 0;
        Double pDouble = Double.valueOf(p0);

        while (p >= pDouble) {
            pDouble = pDouble + pDouble * percent * 0.01 + aug;
            n++;

            if (pDouble >= p) {
                return n;
            }
        }

        return 0;
    }

    public static int strayNumber(int[] numbers) {

        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[0] != numbers[i]) || (numbers[1] != numbers[i])) {
                return numbers[i];
            }

        }
        return counter;
    }

    public static String morseDecoder(String morseCode) {

        String empty = "";

        Map<String, String> map = new HashMap<>();
        map.put(".-", ".-");
        map.put("-...", "B");
        map.put("-.-.", "C");
        map.put("-..", "D");
        map.put(".", "E");
        map.put("..-.", "F");
        map.put("--.", "G");
        map.put("....", "H");
        map.put("..", "I");
        map.put(".---", "J");
        map.put("-.-", "K");
        map.put(".-..", "L");
        map.put("--", "M");
        map.put("-.", "N");
        map.put("---", "O");
        map.put(".--.", "P");
        map.put("--.-", "Q");
        map.put(".-.", "R");
        map.put("...", "S");
        map.put("-", "T");
        map.put("..-", "U");
        map.put("...-", "V");
        map.put(".--", "W");
        map.put("-..-", "X");
        map.put("-.--", "Y");
        map.put("--..", "Z");


        String[] stringArray = morseCode.split(" ");
        for (String parts : stringArray) {
            if (parts.equals("")) {
                empty += " ";
            } else {
                empty += map.get(parts);

            }
        }
        return empty;
    }

}
