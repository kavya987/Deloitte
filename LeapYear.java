import java.util.Scanner;

public class LeapYear {
	
	void isLeapYear(int y) {
		if(y%400==0||(y%4==0&&y%100!=0))
			System.out.println("Leap year");
		else
			System.out.println("Not a leap year");		
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int y=in.nextInt();
		LeapYear lp=new LeapYear();
		lp.isLeapYear(y);
		
	}

}