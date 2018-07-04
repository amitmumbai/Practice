package com.java.collection;
import java.util.ArrayList;
import java.util.Iterator;

public class Student {
	int rollno;
	String name;
	int age;
	Student(int rollno,String name,int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args) {
		//creating user defined class objects
		Student s1=new Student(1,"Amit",21);
		Student s2=new Student(2,"Anand",20);
		Student s3=new Student(3,"vinayak",21);
		//creating arraylist
		ArrayList<Student> s=new ArrayList<Student>();
			s.add(s1);//using add method to add element to arraylist
			s.add(s2);
			s.add(s3);
			//traversing collection elements by iterator interface
			Iterator <Student>it=s.iterator();
			while(it.hasNext()){
				Student st=(Student)it.next();
				System.out.println(st.rollno+" "+st.name+" "+st.age);
			}
	}
}
