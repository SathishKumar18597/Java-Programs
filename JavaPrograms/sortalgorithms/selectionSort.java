package org.sortalgorithms;

import java.util.Arrays;

public class selectionSort {
    public static int[] selectionDataSort(int data[]){
        for(int i=0; i<data.length;i++){
            int min_index=i;
            for(int j=i+1;j<data.length;j++){
                if(data[j]<data[min_index])
                    min_index=j;
            }
            int temp=data[min_index];
            data[min_index]=data[i];
            data[i]=temp;

        }
    return data;
    }
    public static void main(String args []){
        int []ref= {10,1,2,3,5,6};
        System.out.println( Arrays.toString( selectionDataSort(ref)));
    }
}
