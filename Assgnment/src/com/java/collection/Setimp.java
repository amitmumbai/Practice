package com.java.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setimp {
	public static void main(String[] args) {
	Set<String>s=new HashSet<String>(); 
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
	/*s.clear(); //it will delete all elements from set
	System.out.println(s);*/
	s.remove("ajay");//removes ajay element.
		System.out.println(s);
	}

}
