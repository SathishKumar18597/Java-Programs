package org.searchAlgorithms;

import java.util.Arrays;

public class binarySearch {

    public static int binaryDataSearch(int data[],int finder){

        int startIndex=0;
        int endIndex=data.length-1;
         while(startIndex<=endIndex){
             int midPoint=(startIndex+endIndex)/2;
             if(data[midPoint]==finder)
                 return data[midPoint];
             if(data[midPoint]<finder)
                 startIndex=midPoint+1;
             if(data[midPoint]>finder)
                 endIndex=midPoint-1;
         }
        return -1;
    }

    public static void main(String args[]){
        int ref[]={11,12,13,14,15,16};
        int NumberToBeFinded=16;
        System.out.println(binaryDataSearch(ref,NumberToBeFinded));
    }
}
