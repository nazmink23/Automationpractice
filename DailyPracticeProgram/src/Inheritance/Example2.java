package Inheritance;

class Company{ 
	public void google() {
		System.out.println("google company employee");
		
	}
		
}
class hr extends Company{ 
	public void id() {
		System.out.println("Hire the Employee");
		
	}
		
}
class manager extends hr{ 
	public void lead() {
		System.out.println("manager the team");
		
	}	
		
}
class employee extends manager{ 
	public void tester () {
		System.out.println("he is doing Mannual Testing work");
		
	}
	
}

public class Example2 {

	public static void main(String[] args) {
		Company obj1=new Company ();
		obj1.google();
		System.out.println("---------------------------------------------");
		hr obj2 =new hr();
		obj2.google();
		obj2.id();
		System.out.println("---------------------------------------------");
		manager obj3 =new manager();
		obj3.google();
		obj3.id();
		obj3.lead();
		System.out.println("---------------------------------------------");
		employee obj4=new employee();
		obj4.google();
		obj4.id();
		obj4.lead();
		obj4.tester();
		System.out.println("---------------------------------------------");
		hr obj5=new manager();
		obj5.id();
		
		
		
		
	}


}