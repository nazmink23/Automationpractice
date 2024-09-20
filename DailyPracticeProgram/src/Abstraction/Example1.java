package Abstraction;

abstract class Renault {

	// abstract class strat with abstract keyward
	abstract void sales();

	// nprmal method
	public void showroom() {

		System.out.println("This Is Renault Company");
	}
}

	class triber extends Renault {

		// here is abstract method override .
		void sales() {

			System.out.println("This Is Renault Car");
		}

		public void cngcar() {

			System.out.println("This Is triber car give the avg");

		}
	}	

		class mustang extends Renault {

			// here is abstract method override .
			void sales() {

				System.out.println("This Is Renault Best Model");

			}
			public void color() {
				
				System.out.println("car color is Red");
			}

		}

	public class Example1 extends Renault {
		// here is abstract method override .
		void sales() {

		System.out.println("This Is Renault Best Model");
	
	}
		void carwheels() {
      
	   System.out.println("car has 4 wheels");
			
			
		}

	public static void main(String[] args) {
		
		//Renault r1=new Renault()//we cant ctreate object of abstract class bcz itz incompleted class 
		triber t1=new triber();
		t1.cngcar();
		t1.sales();
		t1.showroom();
		System.out.println("----------------------------------------------------");
		Renault obj=new Example1();//upcasting  //this iz the run time polymorphism
		obj.sales();
		obj.showroom();
		System.out.println("----------------------------------------------------");
		mustang obj1=new mustang();
		obj1.color();
		obj1.sales();
		obj1.showroom();
		
		
		
		
	    }

	  }
	
	   
