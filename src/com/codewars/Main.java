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
//        System.out.println(splitInParts("supercalifragilisticexpialidocious", 3));
//        int[] maxDifference = {24,299,131,14,26,25};
//        System.out.println(maxGap(maxDifference));
//        int[] compoundArray1 = {1,2,3,4,5,6};
//        int[] compoundArray2 = {9,8,7,6};
//        compoundArray(compoundArray1, compoundArray2);
//        setAlarm(true, false);
//        System.out.println(nthEvenElement(100));
//        fizzBuzz();
//        int[] array = {1,2,2};
//        squareSum(array);
//        int[] sunday = {6737, 7244, 5776, 9826, 7057, 9247, 5842, 5484, 6543, 5153, 6832, 8274,
//                7148, 6152, 5940, 8040, 9174, 7555, 7682, 5252, 8793, 8837, 7320, 8478, 6063,
//                5751, 9716, 5085, 7315, 7859, 6628, 5425, 6331, 7097, 6249, 8381, 5936, 8496,
//                6934, 8347, 7036, 6421, 6510, 5821, 8602, 5312, 7836, 8032, 9871, 5990, 6309, 7825};
//
//        int[] monday = {9175, 7883, 7596, 8635, 9274, 9675, 5603, 6863, 6442, 9500, 7468, 9719,
//                6648, 8180, 7944, 5190, 6209, 7175, 5984, 9737, 5548, 6803, 9254, 5932, 7360, 9221,
//                5702, 5252, 7041, 7287, 5185, 9139, 7187, 8855, 9310, 9105, 9769, 9679, 7842,
//                7466, 7321, 6785, 8770, 8108, 7985, 5186, 9021, 9098, 6099, 5828, 7217, 9387};
//
//        int[] tuesday = {8646, 6945, 6364, 9563, 5627, 5068, 9157, 9439, 5681, 8674, 6379, 8292,
//                7552, 5370, 7579, 9851, 8520, 5881, 7138, 7890, 6016, 5630, 5985, 9758, 8415, 7313,
//                7761, 9853, 7937, 9268, 7888, 6589, 9366, 9867, 5093, 6684, 8793, 8116, 8493,
//                5265, 5815, 7191, 9515, 7825, 9508, 6878, 7180, 8756, 5717, 7555, 9447, 7703};
//
//        int[] wednesday = {6353, 9605, 5464, 9752, 9915, 7446, 9419, 6520, 7438, 6512, 7102,
//                5047, 6601, 8303, 9118, 5093, 8463, 7116, 7378, 9738, 9998, 7125, 6445, 6031, 8710,
//                5182, 9142, 9415, 9710, 7342, 9425, 7927, 9030, 7742, 8394, 9652, 5783, 7698,
//                9492, 6973, 6531, 7698, 8994, 8058, 6406, 5738, 7500, 8357, 7378, 9598, 5405, 9493};
//
//        int[] thursday = {6149, 6439, 9899, 5897, 8589, 7627, 6348, 9625, 9490, 5502, 5723, 8197,
//                9866, 6609, 6308, 7163, 9726, 7222, 7549, 6203, 5876, 8836, 6442, 6752, 8695, 8402,
//                9638, 9925, 5508, 8636, 5226, 9941, 8936, 5047, 6445, 8063, 6083, 7383, 7548, 5066,
//                7107, 6911, 9302, 5202, 7487, 5593, 8620, 8858, 5360, 6638, 8012, 8701};
//
//        int[] friday = {5000, 5642, 9143, 7731, 8477, 8000, 7411, 8813, 8288, 5637, 6244, 6589, 6362,
//                6200, 6781, 8371, 7082, 5348, 8842, 9513, 5896, 6628, 8164, 8473, 5663, 9501,
//                9177, 8384, 8229, 8781, 9160, 6955, 9407, 7443, 8934, 8072, 8942, 6859, 5617,
//                5078, 8910, 6732, 9848, 8951, 9407, 6699, 9842, 7455, 8720, 5725, 6960, 5127};
//
//        int[] saturday = {5448, 8041, 6573, 8104, 6208, 5912, 7927, 8909, 7000, 5059, 6412, 6354, 8943,
//                5460, 9979, 5379, 8501, 6831, 7022, 7575, 5828, 5354, 5115, 9625, 7795, 7003,
//                5524, 9870, 6591, 8616, 5163, 6656, 8150, 8826, 6875, 5242, 9585, 9649, 9838,
//                7150, 6567, 8524, 7613, 7809, 5562, 7799, 7179, 5184, 7960, 9455, 5633, 9085};
//        int[][] stairs = {sunday,monday,tuesday,wednesday,thursday,friday,saturday};
//        System.out.println(stairsIn20(stairs));
//        System.out.println(replace("aeiou"));
//        humanYearsCatYearsDogYears(10);
//        System.out.println(twiceAsOld(50,20));
//        String[] words = {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"};
//        twoSort(words);
//        cockroachSpeed(3.11);
//        System.out.println(toAlternativeString("bPOLSKA2"));
//        System.out.println(substractSum(91632));
//        squareDigits(9119);
//        int[] array = {-47, 84, -30, -11, -5, 74, 77};
//        System.out.println(signChange(array));
//        System.out.println(findScreenHeight(1024,"4:3"));
//        System.out.println(conjecture(100));
//        int[][] marray = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
//        System.out.println(diagonalSum(marray));
//       ex1();
//       ex2();
//       ex3();
//        ex4();
//        ex5();
//        ex6();
//        ex7();
        ex8();



    }

    public static void ex8() {

        int[] myFirstArray = { 12, 42, 34, 19 };
        int[] mySecondArray = { 12, 42, 34, 19 };
        int[] myThirdArray = { 12, 42, 33, 19 };

        int counter=0;

        for (int i=0; i<myFirstArray.length; i++) {
            if (myFirstArray[i] == myThirdArray[i]) {
                counter++;
            }
        }
        if (counter == myFirstArray.length) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are NOT equal.");
        }

    }

    public static void ex7() {

        String[] array = {"blue", "red", "white", "red", "black", "blue"};
        String temp;

        List<String> duplicates = new ArrayList<String>();

        for (int i=0; i<array.length; i++) {
            temp = array[i];
            for (int j=0; j<array.length; j++) {
                if (temp.equals(array[j]) && i!=j) {
                    duplicates.add(array[j]);
                }
            }
        }

        System.out.println(duplicates);



    }

    public static void ex6() {

        int[] array = new int[100];
        Random random = new Random();

        for (int i=0; i<array.length; i++) {

            array[i] = random.nextInt(101);
        }
        System.out.println(Arrays.toString(array));

    }

    public static void ex5() {

        int[] array = {4,2,8,13,5,9,3};
        int[] newArray = new int[array.length];

        for (int i=0; i<array.length; i++) {
            newArray[i] = array[i];
        }
        System.out.println(Arrays.toString(newArray));

    }

    public static void ex4() {

        int[] array = {4,2,8,13,5,9,3};
        Arrays.sort(array);
        System.out.println("The second highest value is: "+ array[array.length-2]);



    }

    public static void ex3() {

        double searchedValue = 9.2;
        double[] nums = {3.0, 7.4, 5.4, 9.2};
        for (Double elements: nums) {
            if (elements == searchedValue) {
                System.out.println("Found: "+ elements);
            }
        }
    }

    public static void ex2() {

        String[] cars = {"Mazda", "Fiat", "Hyundai", "Mercedes"};
        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));
    }

    public static void ex1() {

        int[] numbers = {6,12,3,6,4,2,1};
        double sum=0;

        for (Integer elements: numbers) {
            sum = sum += elements;
        }
        System.out.println(sum/numbers.length);

    }

    public static int diagonalSum(final int[][] matrix) {

        int sum = 0;

        for (int i=0; i<matrix.length; i++) {
            sum += matrix[i][i];
        }

            return sum;
    }

    public static long conjecture (long x) {

        int counter=1;

        while (x!=1) {
            if (x%2==0) {
                x=x/2;
            } else if (x%2!=0) {
                x=(x*3)+1;
            }
            counter++;
        }
        return counter;

    }

    public static String findScreenHeight(int width, String ratio) {

        String[] elements = ratio.split(":");
        double dividedRatio = Double.parseDouble(elements[1])/Double.parseDouble(elements[0]);
        double height = dividedRatio*width;
        int hheight = (int) height;
        System.out.println(hheight);

        return Double.toString(dividedRatio*width);
    }

    public static int signChange(int[] arr) {

        int counter = 0;

        for (int i=0; i<arr.length-1; i++) {
            if (arr[i]<0 && arr[i+1]>=0) {
                counter++;
            } else if (arr[i]>0 && arr[i+1]<=0) {
                counter++;
            }
        }

        return counter;
    }

    public static void squareDigits(int n) {

        String toFinish = "";
        String s = Integer.toString(n);

        for (int i=0; i<s.length(); i++) {
            toFinish += Character.getNumericValue(s.charAt(i))*Character.getNumericValue(s.charAt(i));
        }

        System.out.println(toFinish);
    }

    public static boolean solution(String str, String ending) {

        int checker=0;

        if (str.length()>0) {
            for(int i=0; i<ending.length(); i++) {
                if (str.charAt(str.length()-1-i) == ending.charAt(ending.length()-i-1)) {
                    checker++;
                }
            }
        }

        if (checker==ending.length()) {
            return true;
        }
        return false;
    }

    public static String substractSum(int n) {

        int sum=0;

        if (n>100 && n<10000) {
            String s = Integer.toString(n);

            int[] array = new int[s.length()];
            for (int i=0; i<s.length(); i++) {
                array[i] = Character.getNumericValue(s.charAt(i));
                sum += Character.getNumericValue(s.charAt(i));
            }
        } else {
            return "Value out of range!";
        }

        return Integer.toString(sum);
    }

    public static String toAlternativeString(String string) {

        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String returnedWord = "";

        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if (string.charAt(i) == smallLetters.charAt(j)) {
                    returnedWord += capitalLetters.charAt(j);
                    continue;
                } else if (string.charAt(i) == capitalLetters.charAt(j)) {
                    returnedWord += smallLetters.charAt(j);
                    continue;
                } else if (j == 26 - 1 && returnedWord.length() == i) {
                    returnedWord += string.charAt(i);
                }
            }

        }
        return returnedWord;
    }

    public static int cockroachSpeed(double x) {

        double speed = Math.ceil(x * (100000 / 3600));
        int transformed = (int) speed;

        return transformed;
    }

    public static String twoSort(String[] s) {

        String newString = "";
        List newArray = new ArrayList<String>();

        for (int i = 0; i < s.length; i++) {
            newArray.add(s[i]);
        }
        Collections.sort(newArray);
        String newOne = newArray.get(0).toString();

        for (int i = 0; i < newOne.length(); i++) {
            if (i == newOne.length() - 1) {
                newString += newOne.charAt(i);
                break;
            }
            newString += newOne.charAt(i) + "***";
        }

        return newString;
    }

    public static int twiceAsOld(int dadYears, int sonYears) {


        return (dadYears - 2 * sonYears);
    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {

        int catYears = 0;
        int dogYears = 0;


        if (humanYears == 1) {
            catYears = 15;
            dogYears = 15;
        } else if (humanYears == 2) {
            catYears = 15 + 9;
            dogYears = 15 + 9;
        } else if (humanYears > 2) {
            catYears = 24 + ((humanYears - 2) * 4);
            dogYears = 24 + ((humanYears - 2) * 5);
        }


        return new int[]{humanYears, catYears, dogYears};
    }

    public static String replace(final String s) {

        return s.replaceAll("[aeiouAEIOU ]", "!");
    }

    public static long stairsIn20(int[][] stairsNumber) {

        long stairsTotal = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 52; j++) {
                stairsTotal += stairsNumber[i][j];
            }
        }
        return stairsTotal * 20;
    }

    public static int squareSum(int[] n) {
        int sum = 0;

        for (int i = 0; i < n.length; i++) {

            sum += n[i] * n[i];

        }

        return sum;
    }

    public static void fizzBuzz() {


        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " Fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static int nthEvenElement(int number) {

        int counter = 0;

        for (int i = 0; i < 1000; i += 2) {
            counter++;
            if (number == counter) {
                return i;
            }
        }
        return 0;
    }

    public static boolean setAlarm(boolean employed, boolean vacation) {
        if (employed == true && vacation == false) {
            return true;
        } else {
            return false;
        }
    }

    public static String well(String[] x) {

        int counter = 0;

        for (int i = 0; i < x.length; i++) {

            if (x[i].equals("good")) {
                counter++;
            }
        }
        if (counter == 1 || counter == 2) {
            return "Publish!";
        } else if (counter > 2) {
            return "I smell a series!";
        } else if (counter == 0) {
            return "Fail!";
        }
        return "";
    }

    public static int[] compoundArray(int[] array1, int[] array2) {

        int compArrayLength = array1.length + array2.length;
        int[] compArray = new int[compArrayLength];

        for (int i = 0, j = 0; i < compArrayLength; j++) {
            if (j < array1.length) {
                compArray[i++] = array1[j];
            }
            if (j < array2.length) {
                compArray[i++] = array2[j];
            }

        }
        return compArray;
//        int[] newArray = new int [array1.length+ array2.length];
//
////        List<Integer> list = new ArrayList<>();
//
//        for (int i=0, j=0; i<newArray.length; j++ ) {
//            if (j < array1.length) {
//                newArray[i++] = array1[j];
//            }
//            if (j < array2.length) {
//                newArray[i++] = array2[j];
//            }
//        }
//        return newArray;
    }

    public static int maxGap(int[] numbers) {
        Arrays.sort(numbers);
        int max = numbers[1] - numbers[0];


        for (int i = 2; i < numbers.length; i++) {
            if ((numbers[i] - numbers[i - 1]) > max) {
                max = numbers[i] - numbers[i - 1];
            }
        }
        return max;
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

        return e.trim();
    }

    public static String convertTime(int timeDiff) {
        // TODO your code here
        // 1m = 60s
        // 1h = 60m = 3600s
        // 1d = 24h = 1440m = 86 400s

        int days = timeDiff / 86400;
        int hours = timeDiff % 86400 / 3600;
        int minutes = timeDiff % 86400 % 3600 / 60;
        int seconds = timeDiff % 86400 % 3600 % 60;

        return days + " " + hours + " " + minutes + " " + seconds;


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
