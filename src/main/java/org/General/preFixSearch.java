package org.General;

import java.util.Arrays;

public class preFixSearch {

    public static boolean prefixCheck(String source,String prefix){
        char [] sourceData= source.toCharArray();
        char [] targetData= prefix.toCharArray();
        if(prefix.length()>source.length())
            return false;
        for(int i=0;i<targetData.length;i++)
        {
            if(!(sourceData[i]==targetData[i]))
                return false;
        }
        return true;
    }

    public static boolean SuffixCheck(String source,String suffix){
        if(suffix.length()>source.length())
            return false;
        source=source.substring(source.length()-suffix.length(),source.length());
        return source.equalsIgnoreCase(suffix) ;
    }
    public static String [] isPrefixMatched(String [] data,String prefix){
     String resultData[]=new String [data.length];
        int index=0;
      for(String elements:data){
        if(  SuffixCheck(elements,prefix)){
           resultData[index]=elements;
           index++;
        }
      }
        return resultData;
    }
    public static void main(String [] args){
        String [] providData={"apsplication","apsp","apspsent"};
        String prefix="tion";
        System.out.println(Arrays.toString(isPrefixMatched(providData,prefix)));

    }
}
