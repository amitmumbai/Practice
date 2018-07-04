package com.java.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Dequeimp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String>s=new ArrayDeque<String>(); 
		s.add("amit");
		s.add("ajay");
		s.add("vinu");
		s.add("akash");
		s.offerFirst("rames");
		System.out.println("head :"+s.element());
		Iterator<String>it=s.iterator();
		System.out.println("Before removing");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		s.poll();// is same as s.pollFirst and removes first element of deque
		s.pollLast();// removes first element of deque
		System.out.println("After removing");
		Iterator<String>it1=s.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
	}
	

}
