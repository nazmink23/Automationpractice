package Inheritance;


class Grandfather {
	
	public void farm() {
		System.out.println("This is Grandfather farm");
	}
	public void Rowhouse() {
		
		System.out.println("This is Grandfather Rowhouse");
		
	}
		
}
class father extends Grandfather {
	
	//overridding is done 
public void farm() {
		
		System.out.println("This is father farm");
	}
	public void banglow() {
		
		System.out.println("This is father Banglow");
	}
	public void car() {
		
		System.out.println("This is father car");
		
	}
	
}
class child extends Grandfather {
	
	public void farm() {
		//overridding 
		System.out.println("This is child farm");
	}
	
	public void bike() {
		System.out.println("This is child bike");
		
	}
	
}
public class Example1 {
	  public static void main(String[] args) {
		  
		  Grandfather obj1=new Grandfather();
		  obj1.farm();
		  obj1.Rowhouse();
		  father obj2= new father ();
		  obj2.banglow();
		  obj2.farm();
		  obj2.Rowhouse();
		  obj2.car();
		  child obj3 =new child();
		  obj3.farm();
		  obj3.bike();
		  obj3.Rowhouse();  
		  
		  System.out.println("---------------------------------------------");
		  
		  //Run Time Poly //Upcasting
		  //Grandfather is Refrance and Father is object 
		  
		  Grandfather obj4=new father();
		 
		  obj4.farm();
		  obj4.Rowhouse();
		  
		  
		  
         
	}

}
