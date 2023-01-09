package org.launchcode.java.excersizes;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistPractice {
    public static void main(String[] args) {
        ArrayList<Integer> listOfNums = new ArrayList<>();
        ArrayList<String> listOfNames = new ArrayList<>();
        listOfNums.add(1);
        listOfNums.add(3);
        listOfNums.add(2);
        listOfNums.add(6);
        listOfNums.add(87);
        listOfNums.add(9);
        listOfNums.add(16);
        listOfNums.add(24);
        listOfNums.add(7);
        listOfNums.add(13);
        listOfNames.add("Johny");
        listOfNames.add("Ricky");
        listOfNames.add("Mike");
        listOfNames.add("Seth");
        listOfNames.add("Nicky");
        listOfNames.add("Bob");
        listOfNames.add("William");
        listOfNames.add("Billy");
        listOfNames.add("Erica");
        listOfNames.add("Sam");
        Integer sum = sumEven(listOfNums);
        System.out.println(sum);
        findFiveLetters(listOfNames);
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        return total;
    }

    public static void findFiveLetters(ArrayList<String> arr) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("What Length of Name are you Looking for?");
        Integer length = input.nextInt();
        input.close();
        for (String i : arr) {
            if (i.length() == length) {
                System.out.println(i);
            }
        }
    }
}

