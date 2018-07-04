/**
 * 
 */
package com.java.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * set implementation using Treeset
 * @author AMIT
 *
 */
public class Setimp3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Set<String>s=new TreeSet<String>(); 
			s.add("amit");
			s.add("amit");
			s.add("ajay");
			s.add("vinu");
			s.add("akash");
			s.add("rames");
			Iterator<String>it=s.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());// set Will not take duplicate values.
				
			}

	}

}
