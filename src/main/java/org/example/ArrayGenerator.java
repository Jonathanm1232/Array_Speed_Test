package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArrayGenerator {
    public static Object[] ArrayGenerator(int n) {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i <= n; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers, new Random(4));
        Object[] numbersArr = numbers.toArray();
        return numbersArr;
    }
}