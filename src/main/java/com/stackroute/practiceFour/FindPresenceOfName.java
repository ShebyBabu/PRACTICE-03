package com.stackroute.practiceFour;


import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//5. Write a program with the implementation of ​ Regular Expression​ to find the presence of the name
//Harry in a ​ string​ .
//Input: This is Harry.
//Output: Is Harry here ? true
//Input : This is Henry.
//Output: Is Harry here ? False
public class FindPresenceOfName {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter pattern");
        Pattern pattern=Pattern.compile(s.nextLine());

        System.out.println("Enter input");
        Matcher match=pattern.matcher(s.nextLine());
//        String name="Harry";
//        Matcher match=pattern.matcher(name);
        //System.out.println(match);
        boolean flag=false;

       while(match.find())
        {
            flag=true;
        }

        if(flag==true)
        {
            System.out.println(true);
        }

        else
        {
            System.out.println(false);
        }
    }
}
