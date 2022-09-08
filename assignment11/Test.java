package com.oops.assignment11;

import java.util.Date;

public class Test
{

	public static void main(String[] args) 
	{
		Date dob = new Date(1997,10, 25);
		Date doj = new Date(2022, 8, 12);
         Employee e = new Employee(101,"prashant","satara", 50000, dob, doj);
         System.out.println(e);
         
         
	}

}
