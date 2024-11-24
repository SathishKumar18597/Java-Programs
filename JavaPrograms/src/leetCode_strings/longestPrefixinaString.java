package org.leetCode_strings;

public class longestPrefixinaString {
    public  static String longestCommonPrefix(String[] strs) {
         String output="";boolean addCahracterToOutput=false;
        String comparer=strs[0];
      for(int chara=0; chara<comparer.length()-1;chara++){
       for(int data=1;data<strs.length;data++) {
        if(strs[data].length()>chara && comparer.charAt(chara)== strs[data].charAt(chara))
            addCahracterToOutput=true;
         else
            return output;
       }
       if(addCahracterToOutput)
           output+=comparer.charAt(chara);
       else
           return output;
      }

return output;
    }
    public static void main(String[] args){
        System.out.println(  longestCommonPrefix(new String[]{"jnaid","jun","jun"}));
    }

}
