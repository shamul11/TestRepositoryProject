package test.projct;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashPrograms {

	public static void main(String[] args) {
		
		
		HashMap <Integer, String> hm = new HashMap<Integer, String>();
		
			hm.put(100, "Miraj");
			hm.put(101, "Jira");
			hm.put(102, "NiranP");
			hm.put(103, "kiraj");
			
			System.out.println("--------------HashMap-----------" );
			
			for(Map.Entry m:hm.entrySet()) {
				
				System.out.println(m.getKey()+" " +m.getValue());
			}
			
			Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
			
			ht.put(201, "Nipa");
			ht.put(202, "kira");
			ht.put(203, "Ahad");
			ht.put(204, "Mohammed");
			System.out.println("---------------Hashtable---------------------" );
			
			for(Map.Entry m: ht.entrySet()) {
				System.out.println(m.getKey()+" "+m.getValue());
			}

	}

}
