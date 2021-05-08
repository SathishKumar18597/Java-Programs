package softSauveExample;

public class ExceptionExample {

	public static void main(String[] args) {
		try {
			int a=0,b=1;
			System.out.println(b/a);
		}
		catch(ArithmeticException ref) {
			System.out.println("Exception handled1");
		}
		catch(Exception  ref) {
			System.out.println("Exception handled2");
		}
		System.out.println("Exception Handled3");

	}

}
