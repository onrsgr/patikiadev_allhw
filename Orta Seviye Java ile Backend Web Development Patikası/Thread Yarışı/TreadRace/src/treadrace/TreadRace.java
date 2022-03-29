/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treadrace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author onur
 */
public class TreadRace {

    static List<Integer> oddNumberList = Collections.synchronizedList(new ArrayList<>());
    static List<Integer> evenNumberList = Collections.synchronizedList(new ArrayList<>());

    static List<Integer> numberList = new ArrayList<>();
    static List<List<Integer>> groupedList = new ArrayList<>();

    static List<Integer> numberPackage1 = new ArrayList<>();
    static List<Integer> numberPackage2 = new ArrayList<>();
    static List<Integer> numberPackage3 = new ArrayList<>();
    static List<Integer> numberPackage4 = new ArrayList<>();

    public static void main(String[] args) {

        prepareList();
        fillGroupArrays();

        Thread t1 = new Thread(() -> {
            findOddEvent(numberPackage1);
        });
        t1.start();
        Thread t2 = new Thread(() -> {
            findOddEvent(numberPackage2);
        });
        t2.start();
        Thread t3 = new Thread(() -> {
            findOddEvent(numberPackage3);
        });
        t3.start();
        Thread t4 = new Thread(() -> {
            findOddEvent(numberPackage4);
        });
        t4.start();
               
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (Exception e) {

        }

        System.out.println(oddNumberList);
        System.out.println(evenNumberList);
    }

    public static void findOddEvent(List<Integer> numberPackage) {
        for (int i = 0; i < numberPackage.size(); i++) {
            if (numberPackage.get(i) % 2 == 0) {
                evenNumberList.add(numberPackage.get(i));
            } else {
                oddNumberList.add(numberPackage.get(i));
            }
        }
    }

    private static void fillGroupArrays() {

        int groupSize = 2500;
        for (int start = 0; start < numberList.size(); start += groupSize) {
            int end = Math.min(start + groupSize, numberList.size());
            List<Integer> sublist = numberList.subList(start, end);
            groupedList.add(sublist);
        }

        numberPackage1 = groupedList.get(0);
        numberPackage2 = groupedList.get(1);
        numberPackage3 = groupedList.get(2);
        numberPackage4 = groupedList.get(3);
    }

    private static void prepareList() {
        int sizeList = 1;
        while (sizeList < 10001) {
            numberList.add(sizeList);
            sizeList++;
        }
    }

}
