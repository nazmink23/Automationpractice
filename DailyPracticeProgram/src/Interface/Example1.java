package Interface; // this is 100%abstract 

interface grandfather {
	
	
	public void banglow();//here is not used abstract keyward but methodis abstract
	
}
//implements keyward is used in interface
class father implements grandfather{ 
	@Override
	public void banglow() {
		
		System.out.println("this is grandfather property");
		 
	 }
	public void rowhouse() {
		
		System.out.println("this is father property");
		 
	}
	
}
public class Example1 implements grandfather {
	
	@Override
     public void banglow() {
		
		System.out.println("This is grandfather property-2");
		 
	 }    
	
	public static void main(String[] args) {
		
		father f1 = new father ();
		f1.banglow();
		f1.rowhouse();
		System.out.println("---------------------------------");
		 
		Example1 e1 = new Example1();
		e1.banglow();   
		System.out.println("---------------------------------");
		 
		grandfather g1= new father(); //upcasting
		g1.banglow();
		System.out.println("---------------------------------");
		 
		grandfather g2= new Example1(); //upcasting
		e1.banglow();	
		
	}

}
