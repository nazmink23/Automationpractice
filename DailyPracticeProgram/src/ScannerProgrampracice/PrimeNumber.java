package ScannerProgrampracice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc1.nextInt();
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) { 
			count++; // 0+1=1 
			
				
			}
			
		}
		if(count==2) { 
			System.out.println("Given number is prime="+num);
		}else {
			System.out.println("Given number is not prime="+num);
		}

	}

}


