package com.stackroute.practiceFour;


import java.util.StringTokenizer;

//3. Write a program that ​ sets​ up a ​ String​ variable containing a paragraph of text of your choice.
//a. Extract the words from the text and sort them into alphabetical order.
//b. Display the sorted list of words.
public class SplittingParagraph {

    public static void main(String[] args) {

        //input string
        String input = "Write a program that . sets up string variable containing a paragraph of text of your choice extract the words from the text and sort them into alphabetical order display the sorted list of words.";
        String[] stringArray = new String[input.length()]; //intialised an array
        StringTokenizer paragraphSplit = new StringTokenizer(input, " ");       //string tokenizer to split the words using space as delimiter
        int length = paragraphSplit.countTokens();  //length of the string tokenizer object


        //reading each tokens from the string tokenizer object
        for (int i = 0; i < stringArray.length; i++) {
            while (paragraphSplit.hasMoreTokens()) {
                stringArray[i] = paragraphSplit.nextToken();
                System.out.println(stringArray[i]);
                i++;
            }

        }


        System.out.println(" ");
        System.out.println("The sorted words from the paragraph: ");

        //sorting in ascending order
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (stringArray[i].compareToIgnoreCase(stringArray[j]) < 0) {
                    String temp = stringArray[i];
                    stringArray[i] = stringArray[j];
                    stringArray[j] = temp;
                }


            }
        }


        //printing the sorted words
        for(int i=0;i<length;i++)
        {
            System.out.println(stringArray[i]);
        }
    }
}





//for(int j=0;j<stringArray.length;j++)
//                    {
//                        for(int k=j+1;k<stringArray.length;k++)
//                        {
//if(stringArray[j].compareTo(stringArray[k])<0)
//{
//String temp=stringArray[j];
//stringArray[j]=stringArray[k];
//stringArray[k]=temp;
//}
//                        }
//                    }
//                     System.out.println(stringArray[i]);
