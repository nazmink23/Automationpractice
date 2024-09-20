package Collectionlistprogram;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {
    public static void main(String[] args) {
	List l2=new ArrayList();
	l2.add("Nazmin");//here is i used object 
	l2.add(12);
	l2.add("Nazmin");
	l2.add("Saudi Arab");
	l2.add(null);
	System.out.println("Print the All Elements"+l2);
	System.out.println("----------------------------------");
	l2.add(3, "Shaikh");//add the elements by using the index
	System.out.println("Print the All Elements"+l2);
	System.out.println("----------------------------------");
	System.out.println("Print the Total Elements=" +l2.size());
	System.out.println("----------------------------------");
	System.out.println("Print the any one Elements=" +l2.get(4));
	System.out.println("Print the any one Elements=" +l2.get(1));
	System.out.println("----------------------------------");
	for(int i=0;i<l2.size();i++) {
		System.out.println("Print the any one Elements :- "+i+" = "+l2.get(i));
	}
}
}