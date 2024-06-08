package org.General;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class RemoveDuplicatesInSequence {


    public static void main(String[] args) {

       String input="aaabbccddc";

       char data[]=input.toCharArray();
        String output=String.valueOf(data[0]);
        for (int i = 1; i <data.length; i++) {
        if(!output.substring(output.length()-1).equalsIgnoreCase(String.valueOf(data[i])))
         output+=String.valueOf(data[i]);
        }
        System.out.println(output);
    }

}