package com.codewars;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        System.out.println(morseDecoder(".... . -.--  -.. ..- -.. ."));;

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
