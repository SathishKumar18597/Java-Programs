package softSauveExample;
class a{
	public static void print() {
		System.out.println("a");
	}
}
class b extends a{
	public static void print() {
		System.out.println("b");
	}
}

public class OverloadingExample extends b{

	public static void main(String[] args) {
b ref=new OverloadingExample();
ref.print();

	}

}
