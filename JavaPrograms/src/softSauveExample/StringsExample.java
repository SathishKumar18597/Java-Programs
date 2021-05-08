package softSauveExample;

public class StringsExample {

	public static void main(String[] args) {
		String a="abc";
		String b=a;
		//a=a.concat("d");
		System.out.println(a==b);
		String ref=new String("abc");
		String ref1=new String("abc");
		
		ref.concat("d");
		System.out.println(ref==ref1);

	}

}
