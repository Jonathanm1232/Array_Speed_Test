package org.example;

import javax.swing.*;
import java.util.*;
import org.apache.commons.lang3.time.StopWatch;

import static org.example.ArrayGenerator.ArrayGenerator;

public class Main {
    static Object[] numbersArr;
    public static void main(String[] args) {
        // Getting the Size of the Array and how many should be put in another Array
        int ammount = Integer.parseInt(JOptionPane.showInputDialog("How many numbers do you want?"));
        int outputno = Integer.parseInt(JOptionPane.showInputDialog("How many numbers do you want?"));

        Object[] testData = ArrayGenerator(ammount);

        System.out.println("RandArray Größe: " + ammount);
        System.out.println("Erstellte Größe: " + outputno);

        // Starting the Test
        TimeArray(testData, outputno);
        TimeArrayList(testData, outputno);
        TimeHashtable(testData, outputno);
    }
    public static void TimeArray(Object[] data, int n) {
        StopWatch stopWatch = new StopWatch();
        Object[] arr = new Object[n+1];

        stopWatch.start();

        for (int i = 0; i <= n;) {
            arr[i] = data[(int) (n * Math.random())];
            i++;
        }

        stopWatch.stop();
        System.out.println("Array: " + stopWatch.getNanoTime());
        stopWatch.reset();
    }
    public static void TimeArrayList(Object[] data, int n) {
        StopWatch stopWatch = new StopWatch();
        ArrayList<Object> arrlist = new ArrayList<Object>();

        stopWatch.start();

        for (int i = 0; i <= n;) {
            arrlist.add(data[(int) (n * Math.random())]);
            i++;
        }

        stopWatch.stop();

        System.out.println("ArrayList: " + stopWatch.getNanoTime());
        stopWatch.reset();
    }

    public static void TimeHashtable(Object[] data, int n) {
        StopWatch stopWatch = new StopWatch();
        Hashtable<Integer, Object> hshtable = new Hashtable<Integer, Object>();

        stopWatch.start();

        for (int i = 0; i <= n;) {
            hshtable.put(i, data[(int) (n * Math.random())]);
            i++;
        }

        stopWatch.stop();

        System.out.println("HashTable: " + stopWatch.getNanoTime());
    }
}