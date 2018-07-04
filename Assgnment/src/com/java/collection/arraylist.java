package com.java.collection;

import java.util.ArrayList;


public class arraylist {
	public static void main(String args[]){
		ArrayList<String>list=new ArrayList<String>();
		list.add("amit");
		list.add("arun");
		list.add("vinayak");
		//traversing collection elements by for each loop
		/*for(String obj:list){
			System.out.println(obj);
			}*/
		// or
		/*for(int i=0;i<list.size();i++)
		{
			if(list.get(i)instanceof String)
			{
				String str=list.get(i); 
				System.out.println(str);
			}
			
		}*/
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
			
	}

}
