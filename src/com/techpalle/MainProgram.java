package com.techpalle;

import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 - to create table\n" + 
		                   "press 2 - to insert a row into table\n" + 
				           "press 3 - to update the table\n" + 
		                   "press 4 - to delete the table\n" +
		                   "press 5 - to exit ");
		int eno=0;
		String ename=null;
		int esal=0;
		System.out.println("Enter number create");
		int n1 = sc.nextInt();
		if(n1==1)
		{
			Test.creating();
			System.out.println("table is created");
		}
		System.out.println("Enter number insert");
		int n2 = sc.nextInt();
	    if(n2==2)
		{
	    	System.out.println("Enter eno in int, ename in String, esal in int");
			Test.inserting(eno=sc.nextInt(), ename=sc.next(), esal=sc.nextInt());
			System.out.println("Data inserted successfully");
		}
	    System.out.println("Enter number update");
	    int n3 = sc.nextInt();
	    
		if(n3==3)
		{
			System.out.println("update eno in int, ename in String, esal in int");
			Test.update(eno=sc.nextInt(), ename=sc.next(), esal=sc.nextInt());
			System.out.println("Data update Successfully");
		}
		System.out.println("Enter number delete");
		int n4 = sc.nextInt();
		if(n4==4) 
		{
			System.out.println("Enter a row number in int");
			Test.delete(eno=sc.nextInt());
			System.out.println("Data delete successfully");
		}
		System.out.println("Enter number exit");
		int n5 = sc.nextInt();
		if(n5==5)
		{
			System.out.println("Exit......");
			System.exit(0);
		}
		
	}
	}