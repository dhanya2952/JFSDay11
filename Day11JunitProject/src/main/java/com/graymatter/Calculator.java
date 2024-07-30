package com.graymatter;

public class Calculator {
	
	public static boolean isEven(int num)
	{
		if(num%2==0)
			return true;
		return false;
	}
	
	public static int add(int a,int b)
	{
		return a+b;
	}
	
	public static int sub(int a,int b)
	{
		return a-b;
	}
	
	public static int mul(int a, int b)
	{
		return a*b;
	}
	
	public static int div(int a,int b)
	{
		return a/b;
	}
	public static int[] arrayEquals(int arr[])
	{
		return arr;
	}
	public static String checkString()
	{
		String str=null;
		return str;
	}
	
	public static Student createStudent()
	{
		return new Student("dhanya",56,21);
		
	}
	public static void main(String[] args) 
	{
		add(2,3);
		sub(4,3);
		mul(2,3);
		div(4,2);
	}

}
