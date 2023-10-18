package org.example;

import java.util.*;
import org.apache.commons.lang3.time.StopWatch;

import static java.lang.System.exit;
import static org.example.ArrayGenerator.ArrayGenerator;

public class Main {
    static Object[] numbersArr;
    public static void main(String[] args) {
        // Getting the Size of the Array and how many should be put in another Array
        int ammount = 1_000_000; // Integer.parseInt(JOptionPane.showInputDialog("How many numbers do you want?"));
        int outputno = 100_000; //Integer.parseInt(JOptionPane.showInputDialog("How many numbers do you want?"));

        Object[] testData = ArrayGenerator(ammount);

        System.out.println("RandArray Größe: " + ammount);
        System.out.println("Erstellte Größe: " + outputno);

        // Starting the Test
        TimeArray(testData, outputno);
        TimeArrayList(testData, outputno);
        TimeHashtable(testData, outputno);

        exit(0);
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
        System.out.println("Array: " + ((float) stopWatch.getNanoTime() / 1_000_000) + " ms"); // There are a million nanoseconds in a millisecond.
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

        System.out.println("ArrayList: " + ((float) stopWatch.getNanoTime() / 1_000_000) + " ms");
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

        System.out.println("HashTable: " + ((float) stopWatch.getNanoTime() / 1_000_000) + " ms");
    }
}