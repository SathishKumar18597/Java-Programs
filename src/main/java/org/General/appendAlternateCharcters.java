package org.General;

public class appendAlternateCharcters {
    public static void main(String [] args){
        String input1="add";
        String input2="bccccc";
        String output="";
       char []data1= input1.toCharArray();
        char []data2= input2.toCharArray();

        char max[]=data1.length>data2.length?data1:data2;
        for(int i=0; i<max.length;i++){
            if(i<data1.length && i<data2.length){
                output+=String.valueOf(data1[i]);
                output+=String.valueOf(data2[i]);
            }else if(i<data1.length )
                output+=String.valueOf(data1[i]);
            else if (i<data2.length) {
                output+=String.valueOf(data2[i]);
            }


        }
        System.out.println(output);
    }
}
