package BasicPrograms;

public class stringReverseExample {
	static String reverse(String in) {
		String rev="";
			char temrev=' ',last=' ';
		for(int i=in.length()-1;i>=0;i--) {
			 temrev=in.charAt(i);
			 if(temrev<65)
				 last=temrev;
			 else
				 rev+=temrev;
			 
		}
		rev=rev+last;
		return rev;
		
	}

	public static void main(String[] args) {
String input="How Are You?";
String output="";
String[] array=input.split(" ");
for(String in:array)
	output+=reverse(in)+" ";
System.out.println(output);
	}

}
