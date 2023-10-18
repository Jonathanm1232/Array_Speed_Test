package org.example;

import javax.swing.*;
import java.util.*;
import org.apache.commons.lang3.time.StopWatch;

import static org.example.ArrayGenerator.ArrayGenerator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private List<Integer> numbers = new ArrayList<Integer>();
    static Object[] numbersArr;
    public static void main(String[] args) {
        int ammount = Integer.parseInt(JOptionPane.showInputDialog("How many numbers do you want?"));
        int outputno = Integer.parseInt(JOptionPane.showInputDialog("How many numbers do you want?"));

        Object[] testData = ArrayGenerator(ammount);
        System.out.println("RandArray Größe: " + ammount);
        System.out.println("Erstellte Größe: " + outputno);

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