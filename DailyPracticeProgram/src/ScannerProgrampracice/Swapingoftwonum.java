package ScannerProgrampracice;

public class Swapingoftwonum {

	public static void main(String[] args) {
		int a=10; int b=20; int c=30; int d=50;
		System.out.println("Before Swapping");
		System.out.println("Value of A= "+a);
		System.out.println("Value of b= "+b);
		int tem=a;
		a=b; //20
		b=tem;
		System.out.println("---------------------------------");
		System.out.println("After Swapping");
		System.out.println("Value of A= "+a);
		System.out.println("Value of b= "+b);
		
		//b=10--->c  c=30--->d;
		int tem2=c;
		c=tem;
		d=tem2;
		System.out.println("---------------------------------");
		System.out.println("Value of c= "+c);
		System.out.println("Value of d= "+d);
		
		//d=50--->a a=10---->c
		a=d;
		c=a;
		System.out.println("---------------------------------");
		System.out.println("Value of a= "+a);
		System.out.println("Value of c = "+c);
		
	}

}
