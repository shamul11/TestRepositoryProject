package test.projct;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPrograms {

	public static void main(String[] args) {
		
		Set<String> hashset = new HashSet<String>();
			
			hashset.add("Miraj");
			hashset.add("Mira");
			hashset.add("Miran");
			hashset.add("Rudro");
			
			System.out.println("Hashset Elements: " +hashset);
			
				Set<String> linkedhashset = new LinkedHashSet<String>();
			
			linkedhashset.add("Abraj");
			linkedhashset.add("kaira");
			linkedhashset.add("Navid");
			linkedhashset.add("Ruro");
			
			System.out.println("\nLinkedhashset Elements: " +linkedhashset);
			
			
			Set<String> treeset = new TreeSet<String>();
			
			treeset.add("Ahmed");
			treeset.add("Ahmed");
			treeset.add("Salman");
			treeset.add("Avida");
			
			System.out.println("\nTreeset Elements: " +treeset);
			
			

	}

}
