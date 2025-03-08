package com.basicJava;

public class PalindromeORnot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="MALAYALAM";
		int len=str.length();
		String rev="";
		System.out.println("The given string is:  "+str);		
		for(int i=len-1;i>=0;i--)
		
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("The reversed string is:   "+rev);
		
		
		if(str.equals(rev))
		{
			System.out.println("The given string is palindrome");
		}
		else
		{
			System.out.println("The given string is not palindrome");
		}
		
	/*int a=10;
	int b=5;
	int c=a-b;
	System.out.println(c);
	if(b==c)
	{
		System.out.println("The values are equal");
	}
	else
	{
		System.out.println("The values are not equal");
	}*/
}}
