package org.launchcode.java.studios.countingcharacters;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your favorite line");
//        String movieLine = input.nextLine();
//        input.close();
        String movieLine = "";
        File myObj = new File("src/org/launchcode/java/studios/countingcharacters/BeeMovieScript.txt");
        Scanner myReader;
        try {
            myReader = new Scanner(myObj);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while(myReader.hasNextLine()){
            movieLine += myReader.nextLine();
        }
//        System.out.println(movieLine);
        myReader.close();
        movieLine = movieLine.toLowerCase().replaceAll("[^a-zA-Z]","");

        char[] charactersInString = movieLine.toCharArray();

        HashMap<Character, Integer> output = new HashMap<>();

        for(char letter: charactersInString) {
            if (!output.containsKey(letter)) {
                output.put(letter, 1);
            } else {
                output.put(letter, output.get(letter) + 1);
            }
        }
        System.out.println(output);
    }
}
