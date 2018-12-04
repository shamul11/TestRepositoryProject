package test.projct;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListProgram {

	public static void main(String[] args) {
		
		
		List<String> arraylist = new ArrayList<String>();
		
			arraylist.add("David");
			arraylist.add("Maria");
			arraylist.add("Iran");
			System.out.println("Arraylist elements:" +arraylist);
			
		List<String> linkedlist	= new LinkedList<String>();
		
			linkedlist.add("Navid");
			linkedlist.add("Navid");
			linkedlist.add("Rahman");
			
			System.out.println("\nLinkedList Elements:"+ linkedlist);
			
		List<String> vector = new Vector<String>();
		
			vector.add("liaka");
			vector.add("lamia");
			vector.add("Siaka");
			System.out.println("\nVector Elements: " +vector);
	}

}
