package oda.edu.module1;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  Lab1
  @version  1.0.0 
  @since 15.03.2021 - 18.02
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get("D:\\Java\\harry.txt"))); //read from txt file
        text = text.replaceAll("[^A-Za-z ']", ""); //delete trash
        String[] words = text.split(" ");
//1st
        String longest = "";
        for (String s1 : words) {
            if (s1.length() > longest.length()) {
                longest = s1;
            }
        }
        System.out.println("Longest word: " + longest);
//2nd
        text = new String(Files.readAllBytes(Paths.get("D:\\Java\\harry.txt")));
        String[] lines = text.split("\n");
        int countHarry = 0;
        for (String line : lines) {
            String tempLine = line.replaceAll("[^A-Za-z ']", "");
            String[] tempWords = tempLine.split(" ");
            for (String temporaryWord : tempWords) {
                if (temporaryWord.equals("Harry")) {
                    countHarry++;
                }
            }
        }
        System.out.println("Number of lines where word Harry met : "
                + countHarry);

        StringBuilder stringOfDistinct = new StringBuilder();

        for (String word : words) {
            if (!stringOfDistinct.toString().contains(word)) {
                stringOfDistinct.append(word).append(" ");
            }
        }
        String[] distinctWords = stringOfDistinct.toString().split(" ");

//4.  How many distinct words begin from the letter "C".
        int countWordsC = 0;
        for (String word : distinctWords) {
            if (word.charAt(0) == 'C') {
                countWordsC++;
            }
        }
        System.out.println("Number of words that begin with C is : "
                + countWordsC);

        //5th create array of hashes
        int[] arrayOfHashes = new int[distinctWords.length];
        for (int i = 0; i < distinctWords.length; i++) {
            arrayOfHashes[i] = distinctWords[i].hashCode();
        }

           // 6th  Count the intersections of hashes.
            Arrays.sort(arrayOfHashes);
            int countOfInter = 0;
            for (int i = 0; i < arrayOfHashes.length - 1; i++) {
                if (arrayOfHashes[i] == arrayOfHashes[i + 1]) {
                    countOfInter++;
                }
            }
            System.out.println("Count of intersections: " + countOfInter);
        }
    }
/* answers:
Longest word: interestinglooking
Number of lines where word Harry met : 1213
Number of words that begin with C is : 80
Count of intersections: 0

 */
