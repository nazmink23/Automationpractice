package ScannerProgrampracice;

import java.util.Scanner;

public class Fcatornumber {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number=");
		int num=sc.nextInt();

		System.out.println("Factor of even numebs");
		for(int i=1;i<=num;i++) {
			
			if(num%i==0) {
				System.out.println(i);
				
			}
			
		}
	}

}
