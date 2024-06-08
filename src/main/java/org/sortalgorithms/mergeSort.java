package org.sortalgorithms;

import java.util.Arrays;

public class mergeSort {
    public static void mergeDataSort(int[] data){
        int arrayLength=data.length;
        if(arrayLength<2)
            return ;
        int midIndex=arrayLength/2;
        int leftPortion[]=new  int [midIndex] ;
        int rightPortion[]= new int [arrayLength-midIndex];

        for(int i=0; i<midIndex; i++)
         leftPortion[i]=  data[i];
        for(int i=midIndex; i<arrayLength; i++)
            rightPortion[i-midIndex]= data[i];

        mergeDataSort(leftPortion);
        mergeDataSort(rightPortion);
        mergeTheArrays(data ,leftPortion,rightPortion);

    }

    public static void mergeTheArrays(int [] InputArray, int [] rightArray,int [] LeftArray){
      int rigthArrayLen=  rightArray.length;
      int leftArrayLen=  LeftArray.length;
      int i=0, j=0, K=0;
      while(i<rigthArrayLen && j<leftArrayLen) {
          if (rightArray[i] <= LeftArray[j]) {
              InputArray[K] = rightArray[i];
              i++;
          } else {
              InputArray[K] = LeftArray[j];
              j++;
          }
          K++;
      }
          while(i<rigthArrayLen){
              InputArray[K]=rightArray[i];
              i++;
              K++;
          }
          while(j<leftArrayLen){
              InputArray[K]=LeftArray[j];
              j++;
              K++;

          }




    }

    public static void main(String [] args){
        int [] dataset={12,56,31,33,11,7,43,3};
        mergeDataSort(dataset);
        System.out.println(Arrays.toString(dataset));
    }
}
