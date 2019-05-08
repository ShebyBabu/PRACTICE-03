package com.stackroute.practiceFour;


//2. Write a program to replace all d with f and all l with t in the given ​ String
//Input: daily dry
//Output: faity fry
//Original ​ string​ : daily dry
//New ​ String​ : faity fry

import java.util.Scanner;

public class ReplaceCharactersInString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the input: ");
        String input=s.nextLine();
        String output=input.replace('d','f');   //replacing d with f
        String result=output.replace('l','t');  //replacing l with t
        System.out.println(result);


    }
}
