package Constructor;


public class Example2 {
	
	
	Example2(){ //0
		
		System.out.println("I am zero -param const");
	}
	
	Example2(int a){ //2 construtor
		this();//constructor chaning by using this keyward

		System.out.println("I am param const");
		System.out.println("having int param");
		System.out.println("print the value of a="+a);
		
	}
    Example2(int b,double c){ //3 const
    	this(60);//constructor chaning by using this keyward

    	double result=b+c;
		
		System.out.println("I am 2 param const");
		System.out.println("having int double param");
		System.out.println("print the value of b="+b);
		System.out.println("print the value of c="+c);
		System.out.println("addition of two num"+result);
		
		
	}
     Example2(int d,float f,double e){ //4 const
	   this(40,10.5); //constructor chaning by using this keyward
	   System.out.println("I am 3 param const");
	   System.out.println("having int float double param");
	   System.out.println("print the value of d="+d);
	   System.out.println("print the value of f="+f);
	   System.out.println("print the value of e="+e);
}
	

	public static void main(String[] args) {
		
		//Example2 obj1=new Example2();
		//System.out.println("---------------------------------------");
		//Example2 obj2=new Example2(10);
		//System.out.println("---------------------------------------");
		//Example2 obj3=new Example2(11,5.60);
		//System.out.println("---------------------------------------");
		
		Example2 obj4=new Example2(20,4.8f,90.00);
		System.out.println("---------------------------------------");
		

	}

}


//constructor is block of statement which is similar to method .
//when we create the object constructor is called .
//constructor have the same name as java class
//two types of constructor
//1)default constructor
//2)userdefined cinstructor.