package softSauveExample;

public class InstanceExample {
	int a=10;
	static int b=20;

	public static void main(String[] args) {
		InstanceExample ref=new InstanceExample();
		ref.a=100;
		ref.b=200;
		System.out.println(ref.a+" "+ref.b );
		InstanceExample ref1=new InstanceExample();
		System.out.println(ref1.a+" "+ref1.b );
	}

}
