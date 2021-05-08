package BasicPrograms;

public class stringWordReverse {

	public static void main(String[] args) {
		String input="How Are You?";
		String output="";
		char temp=' ',special=' ';
		String[] array=input.split(" ");
		for(int i=array.length-1;i>=0;i--) {
		
		
			temp=array[i].charAt(i);
		if(temp<65)
			special=temp;
		else
			output+=temp;
		}
		output=output+special;
		System.out.println(output);
	}

}
