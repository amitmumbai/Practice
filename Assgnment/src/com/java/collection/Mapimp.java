/**
 * 
 */
package com.java.collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author AMIT
 *
 */
public class Mapimp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>s=new HashMap<Integer,String>(); 
		s.put(1,"amit");
		s.put(2,"ajay");
		s.put(5,"vinu");
		s.put(10,"akash");
		s.put(12,"rames");
		System.out.println(s.get(12));
		for(Map.Entry m:s.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }  
	}

}
