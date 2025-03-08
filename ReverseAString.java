package com.basicJava;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Testing";
		String rev="";
		
		System.out.println("The given string is:"+str);
		
		/*int len=str.length();
	
		for (int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
				
		}
		System.out.println(rev);*/
		
		
		
		
		char a[]=str.toCharArray();
		int len=a.length;
		
		for(int i=len-1;i>=0;i--)
		{
		rev=rev+a[i];
		}
		System.out.println("The reversed string is:"+rev);
		
		
		
		/*StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());*/
	}

}
