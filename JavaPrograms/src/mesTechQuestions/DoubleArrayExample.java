package mesTechQuestions;

public class DoubleArrayExample {

	public static void main(String[] args) {
double[] array= {-1.5,-3.5,2.5,-1};
for(double value:array) {
	if(Math.round(value+0.5)==Math.ceil(value)) {
		System.out.println(value);
	}
}
	}

}
