import java.util.Scanner;

public class Swap {
	public void swap(int num1,int num2) {
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("Number1="+num1+" Number2="+num2);		
	}
	
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int num1=in.nextInt();
		int num2=in.nextInt();
		System.out.println("Number1="+num1+" Number2="+num2);
		Swap s= new Swap();
		s.swap(num1, num2);		
	}
}
