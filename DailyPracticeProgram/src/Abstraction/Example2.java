package Abstraction;

abstract class Name {

	// abstract class strat with abstract keyward
	abstract void Nazmin();

	// nprmal method
	public void Anam() {

		System.out.println("Hey..!hi I m Anam khan");
	}
}

public class Example2 extends Name {
	  
	void Nazmin() {
		
		System.out.println("Hey..!hi I m Nazmin Khan");
	}
void sofiya() {
		
		System.out.println("Hey..!hi I m Sofiya Khan");
	}
	
	
	public static void main(String[] args) {
		
		//here is not created the object of name bcz this is abstract class
		
		Example2 obj=new Example2(); 
		obj.Anam();
		obj.Nazmin();
		obj.sofiya();
		System.out.println("-------------------------------------------");
		Name obj1= new Example2();
		obj1.Anam();
		obj1.Nazmin();
		
	}

}
