/**
 * 
 */
package com.java.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author AMIT
 *
 */
public class Listimp {

	/**
	 * @param argst
	 */
	public static void main(String[] args) {
		List<String>li=new ArrayList<String>();
		li.add("amit");
		li.add("arun");
		li.add("vinayak");
		System.out.println(li.get(2));
		java.util.ListIterator<String> itr=li.listIterator();
		System.out.println("prints list in Forward direction ");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("prints list in Reverse direction");
		while((itr.hasPrevious())){
			System.out.println(itr.previous());
		}
		// TODO Auto-generated method stub

	}

}
