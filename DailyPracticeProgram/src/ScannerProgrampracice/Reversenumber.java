package ScannerProgrampracice; //WAP for reverse number

public class Reversenumber {

	public static void main(String[] args) {

		int num = 786, rev = 0;// 687
		while (num != 0) { 
			int rem = num % 10; // 786%10=78.6 //7.8 //0.7
			rev = rev * 10 + rem; // 0*10+6 //8*10+8//7
			num = num / 10;  // 786/10

		}
		System.out.println("Reverse number is =" + rev);

	}

}
