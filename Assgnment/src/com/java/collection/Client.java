/**
 * 
 */
package com.java.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @author AMIT
 *
 */
public class Client {
	class Data 
	{
		int Empid;
		String Empname;
		double Empsalary;
		/**
		 * @param empid
		 * @param empname
		 * @param empsalary
		 */
		public Data(int empid, String empname, double empsalary)
		{
			Empid = empid;
			Empname = empname;
			Empsalary = empsalary;
		}
	
	}
	public static void main(String[] args) {
		int choice;
		Scanner in = new Scanner(System.in);
		System.out.println("1.Add employee\n2.List employ with default sorting by id\n3.sort by name (if name are same sort by id)\n4.sort by salary\n5.exit ");
		System.out.println("Enter Your Choice");
		choice = in.nextInt();
		System.out.println("Enter number of Employee");
		int n = in.nextInt();
		int Empid[] = new int[n];
		String Empname[] = new String[n];
		double Empsalary[] = new double[n];
		switch (choice) {
		case 1: {
			for (int i = 0; i<n; i++) 
			{
				System.out.println("Enter Empid");
				Empid[i] = in.nextInt();
				System.out.println("Enter Empname");
				Empname[i] = in.next();
				System.out.println("Enter Empsalary");
				Empsalary[i] = in.nextDouble();
			}
				break;
				}
		case 2:{
				//sortingbyid();
				break;
				}
		case 3:{ 
				//sortingbyname();
				break;
				}
		case 4:{
				//sortingbysalary();
				}
		default:
		}
		Client c=new Client();
	c.addEmployee(Empid,Empname,Empsalary,n);
	}
	public void addEmployee(int Empid[],String Empname[],double Empsalary[],int n){
		List<Data> emplist=new ArrayList<Data>();
		for(int i=0;i<n;i++)
		{
			emplist.add(new Data(Empid[i],Empname[i],Empsalary[i]));
		}
		
	}
}
