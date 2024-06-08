package org.General;

import java.util.HashMap;
import java.util.Stack;

public class ValidSymbolsClosure {

    public static boolean validatesymbols(String input){
        char data[]=input.toCharArray();
        Stack<Character> ref=new Stack<Character>();
        HashMap<Character,Character> refer= new HashMap<Character,Character>();
        refer.put('(',')');
        refer.put('{','}');
        refer.put('[',']');

        for(char ref1:data){
            if(refer.containsKey(ref1))
                ref.push(ref1);
            else{
                if(  ref.isEmpty())
                    return false;
                else if(refer.get(ref.peek())==ref1)
                    ref.pop();
                else
                    return false;
            }
        }
        return ref.isEmpty();
    }

    public static void main(String [] args){
        System.out.println( validatesymbols("(((({}))))"));



    }
}
