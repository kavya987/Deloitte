package excercise;

public class Calculator {
	
	void add(int num1,int num2) {
		System.out.println(num1+" + "+num2 +" = " +(num1+num2)); 
	}
	void add(double num1,double num2) {
		System.out.println(num1+" + "+num2 +" = "+(num1+num2));  
	}
	void add(double num1,int num2) {
		System.out.println(num1+" + "+num2 +" = "+(num1+num2)); 
	}
	void add(int num1,double num2) {
		System.out.println(num1+" + "+num2 +" = "+(num1+num2));  
	}
	
	
	void diff(int num1,int num2) {
		System.out.println(num1+" - "+num2 +" = "+(num1-num2)); 
	}
	void diff(double num1,double num2) {
		System.out.println(num1+" - "+num2 +" = "+(num1-num2));  
	}
	void diff(double num1,int num2) {
		System.out.println(num1+" - "+num2 +" = "+(num1-num2)); 
	}
	void diff(int num1,double num2) {
		System.out.println(num1+" - "+num2 +" = "+(num1-num2));  
	}
	
	
	void mul(int num1,int num2) {
		System.out.println(num1+" * "+num2 +" = "+(num1*num2)); 
	}
	void mul(double num1,double num2) {
		System.out.println(num1+" * "+num2 +" = "+(num1*num2));  
	}
	void mul(double num1,int num2) {
		System.out.println(num1+" * "+num2 +" = "+(num1*num2)); 
	}
	void mul(int num1,double num2) {
		System.out.println(num1+" * "+num2 +" = "+(num1*num2));  
	}
	
	
	void div(int num1,int num2) {
		System.out.println(num1+" / "+num2 +" = "+(num1/num2)); 
	}
	void div(double num1,double num2) {
		System.out.println(num1+" / "+num2 +" = "+(num1/num2));  
	}
	void div(double num1,int num2) {
		System.out.println(num1+" / "+num2 +" = "+(num1/num2)); 
	}
	void div(int num1,double num2) {
		System.out.println(num1+" / "+num2 +" = "+(num1/num2));  
	}
	
	public static void main(String[] args) {
		
		Calculator cal= new Calculator();
		cal.add(10, 20);
		cal.add(100.44, 20.7);
		cal.add(10.4, 280);
		cal.add(70, 200.5);
		
		System.out.println();
		
		cal.diff(10, 20);
		cal.diff(100.44, 20.7);
		cal.diff(10.4, 280);
		cal.diff(70, 200.5);
		
		System.out.println();
		
		cal.mul(10, 20);
		cal.mul(100.44, 20.7);
		cal.mul(10.4, 280);
		cal.mul(70, 200.5);
		
		System.out.println();
		
		cal.div(10, 20);
		cal.div(100.44, 20.7);
		cal.div(10.4, 280);
		cal.div(70, 200.5);
	}

}
