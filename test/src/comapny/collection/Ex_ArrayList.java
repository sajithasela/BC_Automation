package comapny.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ex_ArrayList {

	public static void main(String[] args) {
		//ArrayList
		
		List myList = new ArrayList();
		myList.add("Zero");
		myList.add("One");
		myList.add("Two");
		myList.add("Three");
		myList.add("Four");
		myList.add("Five");
		
		//Print all in single Line
		System.out.println(myList);
		
		//Using Iterator print all Element values. 
		ListIterator itr = myList.listIterator();
		while(itr.hasNext()) {
			
			String element = (String) itr.next();
			System.out.println("Array Element Index : " +  itr.nextIndex() + "\n"+ "Element Value : " +element);
		}
		
	}

}
