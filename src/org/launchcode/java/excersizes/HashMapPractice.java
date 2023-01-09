package org.launchcode.java.excersizes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args){
        String studentName;
        Integer ID;
        HashMap<Integer, String> classList = new HashMap<>();
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Student: ");
            studentName = input.nextLine();

            if (!studentName.equals("")) {
                System.out.println("ID: ");
                ID = input.nextInt();
                classList.put(ID, studentName);
                input.nextLine();
            }
        } while(!studentName.equals(""));
        input.close();
        System.out.println("\nClass roster:");
        for (Map.Entry<Integer, String> student : classList.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }
        System.out.println("Number of students in class: " + classList.size());
    }
}
