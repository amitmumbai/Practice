package com.java.collection;
/*set implementation using hashset
 * 
 * */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setimp2 {
	String name;
	int age;
	
	/**
	 * @param name
	 * @param age
	 */
	public Setimp2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Setimp2 s1=new Setimp2("ajay",21);
		Setimp2 s2=new Setimp2("amit",22);
		Set<Setimp2>student=new HashSet<Setimp2>();
		student.add(s1);
		student.add(s2);
		Iterator<Setimp2>itr=student.iterator();
		while(itr.hasNext()){
			Setimp2 s=itr.next();
			System.out.println(s.name+" "+s.age);
		}
		System.out.println(student.contains(s2));//checks object contains or not.
	}

}
