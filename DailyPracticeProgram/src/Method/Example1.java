package Method;

public class Example1 {

	public static void main(String[] args) {
		
		Example1.primenumber();
		
		Example1 obj=new Example1();
		
		obj.reverce();
	
	}
    public static void primenumber() { //static methos
    	int num=37;
    	int count=0;
    	for(int i=1;i<=num;i++) { //1<=37
    		if(num%i==0) {      //37%1=0 
    			count++;		//0+1=1 
    			
        	}
    		
    	}
    	if(count==2) {
    		
    		System.out.println("Given number is prime "+num);
    		
    	}else {
    		
    		System.out.println("Given number isnt prime "+num);
    		
    	}
    }
    public void reverce() {  //non static method
    	
    	int num=368;
    	int rev=0;
    	int rem;
    	
    	while (num!=0) {
    		rem=num%10;
    		rev=rev*10+rem;
    		num=num/10;		
    	}
    	System.out.println("Reverse number"+rev);
    	
    }
}
