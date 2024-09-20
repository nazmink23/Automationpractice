package Constructor;


public class Example1 {
	
	
	Example1(){
		System.out.println("I am zero -param const");
	}
	
	Example1(int a){
		
		System.out.println("I am param const");
		System.out.println("having int param");
		System.out.println("print the value of a"+a);
		
	}
    Example1(int b,double c){
    	
    	double result=b+c;
		
		System.out.println("I am 2 param const");
		System.out.println("having int double param");
		System.out.println("print the value of b"+b);
		System.out.println("print the value of c"+c);
		System.out.println("addition of two num"+result);
		
		
	}
     Example1(int d,float f,double e){
	
	   System.out.println("I am 3 param const");
	   System.out.println("having int float double param");
	   System.out.println("print the value of d"+d);
	   System.out.println("print the value of f"+f);
	   System.out.println("print the value of e"+e);
}
	

	public static void main(String[] args) {
		
		Example1 obj1=new Example1();
		System.out.println("---------------------------------------");
		Example1 obj2=new Example1(10);
		System.out.println("---------------------------------------");
		Example1 obj3=new Example1(11,5.60);
		System.out.println("---------------------------------------");
		Example1 obj4=new Example1(20,4.8f,90.00);
		System.out.println("---------------------------------------");
		
		
		
		

	}

}


//constructor is block of statement which is similar to method .
//when we create the object constructor is called .
//constructor have the same name as java class
//two types of constructor
//1)default constructor
//2)userdefined cinstructor.