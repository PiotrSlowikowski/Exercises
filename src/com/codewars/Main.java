package com.codewars;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


//        System.out.println(morseDecoder(".... . -.--  -.. ..- -.. ."));;

//        int[] numbers = {2,1,1,1,1,1};
//        System.out.println(strayNumber(numbers));
//        System.out.println(populationGrowth(1000, 2, 50, 3200) + " years will be needed");


    }

    public static int populationGrowth (int p0, double percent, int aug, int p) {

        int n = 0;
        Double pDouble = Double.valueOf(p0);

        while (p >= pDouble) {
            pDouble = pDouble + pDouble*percent*0.01 + aug;
            n++;

            if (pDouble >= p) {
                return n;
            }
        }

        return 0;
    }

    public static int strayNumber (int[] numbers) {

        int counter = 0;

        for (int i=0; i<numbers.length; i++) {
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
