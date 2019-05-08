package com.stackroute.practiceFour;


//1. Write a java program to count the total number of occurrences of a given character in a string
//without using any loop?
//For Example- Java is java again java again count number of occurrence of a in the given string

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Handler;

public class NumberOfOccurences {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the input: ");
        String input = s.nextLine(); //input the string
        System.out.println("Enter the character to be searched: ");
        char character = s.next().charAt(0);              //input the character to be searched

        HashMap<Character, Integer> characterCount = new HashMap<>(); //creating an object of hash map
        System.out.println(characterCount);
        char[] charArray = input.toCharArray();   //converting string to character array
        //System.out.println(charArray);

        for (char c : charArray) {

            if (characterCount.containsKey(c)) {    //initial hash map is empty. character compared with elements inside the hash map
                characterCount.put(c, characterCount.get(c) + 1);
            } else {
                characterCount.put(c, 1);
            }
        }
        System.out.println(characterCount);
        System.out.print("The occurence of the character "+character+" ");
        System.out.println(characterCount.get(character));

    }

}




