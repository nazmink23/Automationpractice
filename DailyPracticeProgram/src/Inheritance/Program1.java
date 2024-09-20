package Inheritance;

//hererical inheritance programs

class Employee{
	void idcard() {
		System.out.println("TCS Employee");
		
	}void wififree(){
		System.out.println("Paswd is TCS123");		
	}
	
	}	
class hr extends Employee {
	void hireemp(){
		System.out.println("Hire the Employee for Quality Assurance profile");
		
	}	
}
class manager extends Employee{
	void managedstaff(){
		System.out.println("Given the task to perform on time");
	
	}	
}

public class Program1 {

	public static void main(String[] args) {
		
		System.out.println("-------------------Manager inherite Employee class-----------------------");
		
		manager m1=new manager();
		m1.idcard();
		m1.managedstaff();
		m1.wififree();
		System.out.println("-------------------Hr inherite Employee class-----------------------");
		hr h1=new hr();
		m1.idcard();
		m1.wififree();
		h1. hireemp();
		
		
		
		 
	}

}
