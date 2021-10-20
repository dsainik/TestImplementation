package com.java.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NonrepeatingChar {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String input = "aaeioou";

        char[] c = input.toCharArray();

        List<Character> list = new ArrayList<>();


        Map<Character, Integer> charMap = new HashMap<>();
        for (char i : c) {
            list.add(i);

            if (charMap.containsKey(i)) {
                charMap.put(i, charMap.get(i) + 1);
            } else {
                charMap.put(i, 1);
            }
        }

        System.out.println("non repeating" + getItem(list, charMap));

    }

    private static Character getItem(List<Character> list, Map<Character, Integer> charMap) {
        for (Character item : list) {
            if (charMap.get(item) == 1) {
                return item;
            }
        }
        return null;
    }

}
