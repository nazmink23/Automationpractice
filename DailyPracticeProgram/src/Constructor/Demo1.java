package Constructor; //constructor chaning

public class Demo1 {
	
	Demo1(){
		System.out.println("i am constructor-1");
	}
    Demo1(int a){
    	this();
    	System.out.println("i am constructor-2");
    	System.out.println("valu of a="+a);
		
	}
    Demo1(int b,float f){
    	this(100);
    	double result1=b+f;
    	System.out.println("i am constructor-3");
    	System.out.println("Addition of two num="+result1);
		
	}
    Demo1(int c,float s,double d){
    	this(3.4f,60,3.80);
    	double result2=c*s*d;
    	System.out.println("i am constructor-4");
    	System.out.println("Multification of 3 num="+result2);
	}
    Demo1(float v,int j,double k){
    	this(40,5.6f);
    	double result3=v*j-k;
    	System.out.println("i am constructor-5");
    	System.out.println("print the result="+result3);
	}

	public static void main(String[] args) {
		
		
		//Demo1 D1= new Demo1();
		//System.out.println("-------------------------------------");
		//Demo1 D2= new Demo1(10);
		//System.out.println("-------------------------------------");
		//Demo1 D3= new Demo1(20,3.6f);
		//System.out.println("-------------------------------------");
		Demo1 D4= new Demo1(30,6.9f,40.07);
		System.out.println("-------------------------------------");
		//Demo1 D5= new Demo1(9.7f,40,50.900);
		//System.out.println("-------------------------------------");
		

	}

}
