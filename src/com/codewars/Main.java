package com.codewars;


import java.util.*;
import java.util.Map.Entry;

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
//        stringy(6);
//        System.out.println(correct("150"));
//        System.out.println(feast("great blue heron", "garlic nann"));
//        digitize(4235423);
//        int[] numbers = {1, -5, 3, 0, -2, 9, 6, -4, -3, 7};
//        findValues(numbers, 6);
//        System.out.println(reverseWords("I like eating"));
//        int[] array = {1,2,3};
//        grow(array);
//        System.out.println(bonusTime(10, true));
//        int[] values = {2, 9, 3, 49, 4, 1 };
//        squareOrSquareRoot(values);
//        sum(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7));
//        int[] array = {1,2,3,4,5,6};
//        System.out.println(divisibleBy(array,2));
//        System.out.println(noBoringZeros(960000));
//        int[] numbers = {1, 2, 3, 4, 6, 7, 8};
//        System.out.println(find(numbers));
//        System.out.println(tripleTrouble("this", "that", "four"))
//        int[] array1 = {2, 4, 8};
//        int[] array2 = {2,4,6};
//        mergeArrays(array1, array2);
//        System.out.println(calculateTip(107.65, "great"));
//        System.out.println(position('z'));
//        System.out.println(repeatString(24,5));
//        System.out.println(isDivisible(3,3));
//        Map<String, Integer> map = new HashMap<>();
//        map.put("Java",10);
//        map.put("Ruby",80);
//        map.put("Python",99);
//        System.out.println(myLanguages(map));
//        convertTime(93784);
        System.out.println(splitInParts("supercalifragilisticexpialidocious", 3));

    }

    

    public static String splitInParts(String s, int partLength) {

        String e = "";
        int counter = 0;
        int addSpace = 0;

        StringBuilder sb = new StringBuilder();
        while (counter < s.length()) {
            e += s.charAt(counter);
            counter++;
            addSpace++;
            if (addSpace == partLength) {
                e += " ";
                addSpace = 0;
            }
        }

        return e.trim() ;
    }

    public static String convertTime(int timeDiff) {
        // TODO your code here
        // 1m = 60s
        // 1h = 60m = 3600s
        // 1d = 24h = 1440m = 86 400s

        int days = timeDiff/86400;
        int hours = timeDiff%86400/3600;
        int minutes = timeDiff%86400%3600/60;
        int seconds = timeDiff%86400%3600%60;

        return days+" "+hours+" "+minutes+" "+seconds;


    }

    public static List<String> myLanguages(final Map<String, Integer> results) {

        List<String> newList = new ArrayList<>();

        Map<String, Integer> sortedMapDesc = sortByComparator(results, true);


        for (Entry<String, Integer> entry : sortedMapDesc.entrySet()) {
            Integer v = entry.getValue();
            if (v >= 60) {
                newList.add(entry.getKey());
            }

        }

        return newList;

//        return null;
    }

    private static Map<String, Integer> sortByComparator(Map<String, Integer> unsortMap, final boolean order) {

        List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(unsortMap.entrySet());

        // Sorting the list based on values
        Collections.sort(list, new Comparator<Entry<String, Integer>>() {
            public int compare(Entry<String, Integer> o1,
                               Entry<String, Integer> o2) {
                if (order) {
                    return o1.getValue().compareTo(o2.getValue());
                } else {
                    return o2.getValue().compareTo(o1.getValue());

                }
            }
        });

        // Maintaining insertion order with the help of LinkedList
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    public static boolean isDivisible(int... numbers) {

        boolean outcome = true;


        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == 0) {
                return false;
            }

            if (numbers[0] % numbers[i] == 0) {
                outcome = true;
            } else if (numbers[0] % numbers[i] != 0) {
                outcome = false;
            }
        }
        return outcome;

    }

    public static String repeatString(final Object toRepeat, final int n) {

        String s = "";

        if (toRepeat instanceof String) {
            for (int i = 0; i < n; i++) {
                s += toRepeat;
            }
        } else {
            return "Not a string.";
        }
        return s;
    }

    public static String position(char alphabet) {
        String letters = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < letters.length(); i++) {
            if (alphabet == letters.charAt(i)) {
                return "Position of alphabet: " + Integer.toString(i + 1);
            }
        }
        return "";
    }

    public static Integer calculateTip(double amount, String rating) {


        if (rating.toLowerCase().equals("terrible")) {
            return 0;
        } else if (rating.toLowerCase().equals("poor")) {
            return (int) Math.ceil(amount * 0.05);
        } else if (rating.toLowerCase().equals("good")) {
            return (int) Math.ceil(amount * 0.1);
        } else if (rating.toLowerCase().equals("great")) {
            return (int) Math.ceil(amount * 0.15);
        } else if (rating.toLowerCase().equals("excellent")) {
            return (int) Math.ceil(amount * 0.2);
        }

        return null;
    }

    public static int[] mergeArrays(int[] first, int[] second) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < first.length; i++) {
            if (first[i] == second[i]) {
                list.add(first[i]);
            } else {
                list.add(first[i]);
                list.add(second[i]);
            }
        }
        Collections.sort(list);

        int[] finalArray = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            finalArray[i] = list.get(i);
        }

        return finalArray;
    }

    public static String tripleTrouble(String one, String two, String three) {

        String empty = "";

        for (int i = 0; i < one.length(); i++) {
            empty += one.charAt(i);
            empty += two.charAt(i);
            empty += three.charAt(i);
        }
        return empty;

    }

    public static Integer find(final int[] array) {

        int number = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i - 1] != 1) {
                return array[i];
            }
        }
        return null;
    }

    public static int noBoringZeros(int n) {

        while (n % 10 == 0) {
            n = n / 10;
        }
        return n;
    }

    public static Integer[] divisibleBy(int[] numbers, int divider) {

        int counter = 0;
        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                list.add(numbers[i]);
            }
        }
        System.out.println(list);
        Integer[] array = list.toArray(new Integer[list.size()]);
        return array;
    }

    public static int sum(List<?> mixed) {

        int sum = 0;

        for (Object o : mixed) {
            sum += Integer.parseInt(o.toString());
        }


        return sum;
    }

    public static int[] squareOrSquareRoot(int[] array) {

        int[] values = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) {
                array[i] = (int) Math.sqrt(array[i]);
            } else if (Math.sqrt(array[i]) % 1 != 0) {
                array[i] = (int) Math.pow(array[i], 2);
            }
        }
        return values;
    }

    public static String bonusTime(final int salary, final boolean bonus) {

        if (bonus) {
            return "\u00A3" + salary * 10;
        }
        return "\u00A3" + salary;
    }

    public static int grow(int[] x) {

        int score = 1;
        for (int i = 1; i <= x.length; i++) {

            score = score * x[i - 1];
        }

        return score;

    }

    public static String reverseWords(String str) {

        String toFill = "";
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            toFill += words[words.length - 1 - i] + " ";
        }
        return toFill.trim();
    }

    // znalezc najmniejsze k najmniejszych elementow k
    public static int[] findValues(int[] array, int k) {

//        ---------- 1ST way
//        Arrays.sort(array);
//        int[] sortedArray = new int [k];
//        for (int i=0; i<k; i++) {
//            sortedArray[i] = array[i];
//        }
//        return sortedArray;

//        --------- 2ND way
//        int[] newArray = new int[k];
//        List<Integer> list = new ArrayList<>();
//
//        for (int i=0; i<array.length; i++) {
//            list.add(i, array[i]);
//        }
//        Collections.sort(list);
//
//        for (int i=0; i<k; i++) {
//            newArray[i] = list.get(i);
//        }
//
//        return newArray;

//        ------ Od najwiekszej wartosci
        int[] sortedArray = new int[k];

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * (-1);
        }
        Arrays.sort(array);

        for (int i = 0; i < k; i++) {
            sortedArray[i] = array[i] * (-1);
        }

        return sortedArray;
    }

    public static int Liters(double time) {

        return (int) Math.floor(time * 0.5);
    }

    public static int[] digitize(long n) {


        String number = Long.toString(n);
        int[] reversedArray = new int[number.length()];

        for (int i = number.length() - 1; i >= 0; i--) {
            reversedArray[i] = Character.getNumericValue(number.charAt(number.length() - 1 - i));
        }
        return reversedArray;
    }

    public static boolean feast(String beast, String dish) {
        if ((beast.charAt(0) == dish.charAt(0)) && (beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1))) {
            return true;
        }

        return false;

    }

    public static int getAverage(int[] marks) {

        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return sum / marks.length;
    }

    public static String correct(String s) {


        return s.replace("1", "I").replace("5", "S").replace("0", "O");
    }

    public static String stringy(int size) {

        String empty = "";
        for (int i = 1; i <= size; i++) {
            if (i % 2 == 0) {
                empty += 0;
            } else if (i % 2 != 0) {
                empty += 1;
            }
        }
        return empty;
    }

    public static int findShort(String s) {

        int minimum = s.length();
        String[] arrayOfStrings = s.split(" ");
        for (int i = 0; i < arrayOfStrings.length; i++) {
            if (arrayOfStrings[i].length() < minimum) {
                minimum = arrayOfStrings[i].length();
            }
        }
        return minimum;
    }

    public static int[] map(int[] arr) {

        int[] values = new int[arr.length];


        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(i, 2 * arr[i]);
            values[i] = map.get(i);
        }
        return values;
    }

    public static String abbrevName(String name) {

        String[] words = name.split(" ");
        return words[0].substring(0, 1).toUpperCase() + "." + words[1].substring(0, 1).toUpperCase();
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
