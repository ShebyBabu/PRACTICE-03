package com.stackroute.practiceFour;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//6. Write a program to find out the multiple occurrences of the given word in a ​ string​ using Matcher
//methods.
//Input : She sells seashells by the seashore
//Given word: se
//Output :
//Found at: 4 - 6
public class MultipleOccurences {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter pattern");
        Pattern pattern = Pattern.compile(s.nextLine());

        System.out.println("Enter input");
        Matcher match = pattern.matcher(s.nextLine());

        while (match.find()) {
            System.out.println(match.start() + " - " + match.end()); //start index and end index of the patten
        }
    }

}