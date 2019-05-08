package com.stackroute.practiceFour;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringTranspose {
    Scanner scan;
    public static void main (String args[])
    {
        StringTranspose stringTranspose=new StringTranspose();
        stringTranspose.input();
    }
    public void input()
    {
        scan=new Scanner(System.in);
        String text;
        System.out.println("Enter a String");
        text=scan.nextLine();
        List<String> listname=new ArrayList<String>();
        listname= Arrays.asList(text.split(" "));
        for(int i=0;i<listname.size();i++)
            System.out.print(transpose(listname.get(i))+" ");

    }
    public String  transpose(String s)
    {
        int len=s.length();
        String reverse="";
        for(int i=len-1;i>=0;i--)
            reverse=reverse+s.charAt(i);
        return reverse;

    }

}
