package mesTechQuestions;

public class PrimerangeExample {

	public static void main(String[] args) {
		int n=30;
	int count=2;
		
		while(count<n) {
			boolean flag=true;
			for(int j=2;j<=count/2;j++) {
				if (count%j==0) {
				flag=false;
				break;
			}}
		if(flag)
		System.err.println(count);
		++count;
	}
	}
}


