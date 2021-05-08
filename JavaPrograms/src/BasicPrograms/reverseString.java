package BasicPrograms;

//import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
/*Scanner ref =new Scanner(System.in);
System.out.println("Enter the numbers");
String original=ref.nextLine();
ref.close();*/


//char []array=original.toCharArray();
		int[] array={34,34,55,55,65,50};
		int count=array.length-1;
for(int i=0;i<array.length-1;i++) {
//	for(int j=i+1;j<count;j++) {
		if(array[i]==array[i+1]) {
		int temp=array[count];
		array[count]=array[i];
		array[i]=temp;
		count--;
		}
	//}
}
//String reversed=String.valueOf(array);
/*for(int reversed:array) {
System.out.print(reversed+" ");
	}*/
for(int i=0;i<=count;i++) {
	System.out.print(array[i]+" ");
}
	}

}
