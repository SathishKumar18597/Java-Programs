package org.General;

public class findaPalindrome {
    public static boolean palindromeFinder(String text){
        char []data=text.toCharArray();
        int start=0;
        int end=text.length()-1;
        while(start<end){
         if(data[start]==data[end]){
             start+=1;
             end-=1;
         }else
             return false;
        }
        return true;
    }
    public static boolean decisionMaker(String text){
        char []data=text.toCharArray();
        int start=0;
        int end=text.length()-1;
        while(start<end){
            if(data[start]==data[end]){
                start+=1;
                end-=1;
            }else{
                String substring1=text.substring(start,end);
                String substring2=text.substring(start+1,end);
                return palindromeFinder (substring1) || palindromeFinder (substring2);
            }

        }
        return true;
    }
    public static void main(String []args){
        System.out.println(   decisionMaker("abab"));


    }
}
