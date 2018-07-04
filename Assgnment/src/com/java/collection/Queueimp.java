package com.java.collection;
/*
	queue doesn't maintain asending order
*/
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queueimp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Queue<String>s=new PriorityQueue<String>(); 
			s.add("amit");
			s.add("ajay");
			s.add("vinu");
			s.add("akash");
			s.add("rames");
			System.out.println("head :"+s.element());
			Iterator<String>it=s.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			s.remove();	
			s.poll();	
			System.out.println("After removing elements");
			Iterator<String>it1=s.iterator();
			while(it1.hasNext())
			{
				System.out.println(it1.next());
			}
	}
}