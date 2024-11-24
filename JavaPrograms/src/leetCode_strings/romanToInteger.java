package org.leetCode_strings;

import java.util.HashMap;
import java.util.Map;

public class romanToInteger{


    public static Integer romanToInt(String s) {

       Map <Character,Integer> ref= new HashMap<>();
       ref.put('I',1);
       ref.put('V',5);
       ref.put('X',10);
       ref.put('L',50);
       ref.put('C',100);
       ref.put('M',1000);
       ref.put('D',500);

char reference[]=s.toCharArray();
Integer total=0;
       for(int data=0;data<=s.length()-2;data++){
        if(ref.get(reference[data])<ref.get(reference[data+1]))
total=total-ref.get(reference[data]);
else
total=total+ref.get(reference[data]);
       }
       return total+ref.get(reference[reference.length-1]);


    }


public static void main(String[] args){

    System.out.println(romanToInt("XL"));
}
}